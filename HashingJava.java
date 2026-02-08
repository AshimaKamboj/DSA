import java.util.*;

public class HashingJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Precompute hash (frequency array)
        int[] hash = new int[13]; // assume numbers are 0 to 12

        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

        // Queries
        int q = sc.nextInt(); // number of queries
        while (q-- > 0) {
            int number = sc.nextInt();
            System.out.println(hash[number]);
        }
    }
}
