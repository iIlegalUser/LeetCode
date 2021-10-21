package problem;

import java.util.*;

public class _01_TwoSum {
    static class Solution {
        public static int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> hm = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if(hm.containsKey(target - nums[i]))
                    return new int[]{hm.get(target - nums[i]), i};
                hm.put(nums[i], i);
            }
            return new int[0];
        }
    }
    public static void main(String[] args) {
        int[] ints = Solution.twoSum(new int[]{3, 2, 4}, 6);
        System.out.println(Arrays.toString(ints));
    }
}
