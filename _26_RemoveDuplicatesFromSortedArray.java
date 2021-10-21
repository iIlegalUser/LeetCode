package problem;

import java.util.Arrays;

public class _26_RemoveDuplicatesFromSortedArray {
    static class Solution {
        public static int removeDuplicates(int[] nums) {
            if(nums == null || nums.length == 0)
                return 0;
            int res = 1;
            for (int i = 1; i < nums.length; i++) {
                if(nums[i] != nums[i - 1])
                    nums[res++] = nums[i];
            }
            return res;
        }
    }
    public static void main(String[] args) {
        int[] tst = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(Solution.removeDuplicates(tst));
        System.out.println(Arrays.toString(tst));
    }

}
