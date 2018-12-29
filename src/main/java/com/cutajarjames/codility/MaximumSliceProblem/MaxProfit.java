package com.cutajarjames.codility.MaximumSliceProblem;

public class MaxProfit {
    public int solution(int[] A) {
        int globalMaxSum = 0;
        int localMaxSum = 0;
        for (int i = 1; i < A.length; i++) {
            int d = A[i] - A[i - 1];
            localMaxSum = Math.max(d, localMaxSum + d);
            globalMaxSum = Math.max(localMaxSum, globalMaxSum);
        }
        return globalMaxSum;
    }

    public static void main(String[] args) {
        System.out.println(new MaxProfit().solution(new int[]{23171, 21011, 21123, 21366, 21013, 21367}));
    }

}
