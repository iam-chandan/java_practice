package multithreading.threadState;

public class Demo {
    public static void main(String[] args) {
        System.out.println("interviewQ_A.FoundDuplicate thread started");
        try {
            System.out.println("interviewQ_A.FoundDuplicate thread executing..");
            Thread.sleep(4000);
            System.out.println("interviewQ_A.FoundDuplicate thread executing..");
            Thread.sleep(4000);
            System.out.println("interviewQ_A.FoundDuplicate thread executing..");
            Thread.sleep(4000);
            System.out.println("interviewQ_A.FoundDuplicate thread executing..");
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("main thread ended");
    }
}
