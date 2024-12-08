import java.util.*;

class MINBUY {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        while (t-- > 0) {
            int n = sc.nextInt(); // Number of items
            long X = sc.nextLong(); // Minimum coins required
            int[] A = new int[n]; // Array A
            int[] B = new int[n]; // Array B

            // Input for array A
            for (int i = 0; i < n; i++) {
                A[i] = sc.nextInt();
            }

            // Input for array B
            for (int i = 0; i < n; i++) {
                B[i] = sc.nextInt();
            }

            // Find the result for the current test case
            long result = findAns(A, B, n, X);
            System.out.println(result);
        }
        sc.close();
    }

    public static long findAns(int[] A, int[] B, int N, long X) {
        long[] totalCoins = new long[N];
        for (int i = 0; i < N; i++) {
            totalCoins[i] = (long) A[i] * B[i];
            if (totalCoins[i] >= X) {
                return 1; // If any single type satisfies the requirement
            }
        }

        // Sort the totalCoins array in ascending order
        Arrays.sort(totalCoins);

        long total = 0;
        long count = 0;

        // Accumulate the largest contributions first
        for (int i = N - 1; i >= 0; i--) {
            total += totalCoins[i];
            count++;
            if (total >= X) {
                return count; // Minimum types required to reach X
            }
        }

        // If not possible to reach X coins
        return -1;
    }
}

