package lld;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class RateLimiter {
    private final int maxRequests;
    private final long windowMillis;

    private static class UserWindows{
        long windowStart;
        AtomicInteger count;
        UserWindows(long start){
            this.windowStart = start;
            this.count = new AtomicInteger(0);
        }
    }

    private ConcurrentHashMap<String, UserWindows> userMap = new ConcurrentHashMap<String, UserWindows>();

    public RateLimiter(int maxRequests, long windowMillis) {
        this.maxRequests = maxRequests;
        this.windowMillis = windowMillis;
    }

    public synchronized boolean allowRequest(String userId){
        long currentTime = System.currentTimeMillis();

        userMap.putIfAbsent(userId, new UserWindows(currentTime));
        UserWindows userWindows = userMap.get(userId);

        if (currentTime - userWindows.windowStart > windowMillis) {
            userWindows.windowStart = currentTime;
            userWindows.count.set(0);
        }

        if (userWindows.count.incrementAndGet() <= maxRequests) {
            return true;
        }
        return false;
    }
}
