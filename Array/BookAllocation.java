package Array;
import java.util.*;

public class BookAllocation {
        // Function to check if we can allocate books to m students with maxPages as upper limit
    static boolean isPossible(int[] books, int n, int m, int maxPages) {
        int studentsRequired = 1;
        int currentSum = 0;

        for (int i = 0; i < n; i++) {
            if (books[i] > maxPages) return false;

            if (currentSum + books[i] > maxPages) {
                studentsRequired++;
                currentSum = books[i];
                if (studentsRequired > m) return false;
            } else {
                currentSum += books[i];
            }
        }
        return true;
    }

    // Main function to find minimum of the maximum pages assigned
    static int findMinimumPages(int[] books, int n, int m) {
        if (n < m) return -1;

        int sum = 0;
        for (int pages : books) sum += pages;

        int low = books[0];
        int high = sum;
        int result = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(books, n, m, mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return result;
    }

    // Driver function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // Number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();  // Number of books
            int m = sc.nextInt();  // Number of students
            int[] books = new int[n];

            for (int i = 0; i < n; i++) {
                books[i] = sc.nextInt();
            }

            System.out.println(findMinimumPages(books, n, m));
        }
        sc.close();
    }


}
