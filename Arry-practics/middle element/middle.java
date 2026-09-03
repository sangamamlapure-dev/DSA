public class Solution {
    public int solve(int[] A) {
        int left = 0;
        int right = A.length - 1;

        while (left < right) {
            left++;
            right--;
        }

        return A[left];
    }
}