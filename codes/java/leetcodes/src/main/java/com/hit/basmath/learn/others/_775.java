package com.hit.basmath.learn.others;

/**
 * 775. Global and Local Inversions
 * <p>
 * We have some permutation A of [0, 1, ..., N - 1], where N is the length of A.
 * <p>
 * The number of (global) inversions is the number of i < j with 0 <= i < j < N and A[i] > A[j].
 * <p>
 * The number of local inversions is the number of i with 0 <= i < N and A[i] > A[i+1].
 * <p>
 * Return true if and only if the number of global inversions is equal to the number of local inversions.
 * <p>
 * Example 1:
 * <p>
 * Input: A = [1,0,2]
 * Output: true
 * Explanation: There is 1 global inversion, and 1 local inversion.
 * <p>
 * Example 2:
 * <p>
 * Input: A = [1,2,0]
 * Output: false
 * Explanation: There are 2 global inversions, and 1 local inversion.
 * <p>
 * Note:
 * <p>
 * A will be a permutation of [0, 1, ..., A.length - 1].
 * A will have length in range [1, 5000].
 * The time limit for this problem has been reduced.
 */
public class _775 {
    public boolean isIdealPermutation(int[] A) {
        int max = -1;
        for (int i = 0; i < A.length - 2; i++) {
            max = Math.max(max, A[i]);
            if (max > A[i + 2])
                return false;
        }
        return true;
    }
}
