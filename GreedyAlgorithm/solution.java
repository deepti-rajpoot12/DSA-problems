// import java.util.*;

// public class solution {
//     static final long MOD = 1000000007;

//      public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int N = sc.nextInt();
//         long X = sc.nextLong();
//         long Y = sc.nextLong();
//         long Z = sc.nextLong();

//         long[] A = new long[N];
//         long[] B = new long[N];

//         for (int i = 0; i < N; i++) A[i] = sc.nextLong();
//         for (int i = 0; i < N; i++) B[i] = sc.nextLong();

//         long sum = 0;

//         for (int i = 0; i < N; i++) {

//             long val1 = -B[i];

//             long val2 = Long.MIN_VALUE;
//             if (X > 0 && Y > 0) {
//                 val2 = A[i] * (X - 1) * (Y - 1) * Z;
//             }

//             long val3 = Long.MIN_VALUE;
//             if (Y > 0 && Z > 0) {
//                 val3 = A[i] * X * (Y - 1) * (Z - 1);
//             }

//             // Choose best option
//             if (val2 >= val1 && val2 >= val3) {
//                 X--; Y--;
//                 sum = (sum + val2) % MOD;
//             } 
//             else if (val3 >= val1 && val3 >= val2) {
//                 Y--; Z--;
//                 sum = (sum + val3) % MOD;
//             } 
//             else {
//                 sum = (sum + val1) % MOD;
//             }
//         }

//         // handle negative modulo
//         if (sum < 0) sum += MOD;

//         System.out.println(sum);
//     }
// }

import java.util.*;

public class Solution {

    static final long MOD = 1000000007;

    public static long maxSum(int N, long X, long Y, long Z, long[] A, long[] B) {

        long sum = 0;

        for (int i = 0; i < N; i++) {

            long op1 = -B[i];

            long op2 = Long.MIN_VALUE;
            long op3 = Long.MIN_VALUE;

            // operation 2
            if (X > 0 && Y > 0) {
                op2 = A[i] * X * Y;
            }

            // operation 3
            if (Y > 0 && Z > 0) {
                op3 = A[i] * Y * Z;
            }

            // choose best
            long best = Math.max(op1, Math.max(op2, op3));

            sum = (sum + best) % MOD;

            // update variables
            if (best == op2) {
                X--;
                Y--;
            } else if (best == op3) {
                Y--;
                Z--;
            }
        }

        return (sum % MOD + MOD) % MOD;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long X = sc.nextLong();
        long Y = sc.nextLong();
        long Z = sc.nextLong();

        long[] A = new long[N];
        long[] B = new long[N];

        for (int i = 0; i < N; i++) A[i] = sc.nextLong();
        for (int i = 0; i < N; i++) B[i] = sc.nextLong();

        System.out.println(maxSum(N, X, Y, Z, A, B));
    }
}