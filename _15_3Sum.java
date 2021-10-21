package problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class _15_3Sum {
    static class Solution {
        public static List<List<Integer>> threeSum(int[] nums) {
            int n = nums.length;
            if(n < 3)
                return new ArrayList<>();
            HashMap<Integer, Integer> map = new HashMap<>();
            ArrayList<List<Integer>> res = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                for(int j = i + 1; j < n; j++){
                    if(map.containsKey(-(nums[i] + nums[j]))){
                        ArrayList<Integer> subRes = new ArrayList<>();
                        subRes.add(nums[i]);
                        subRes.add(nums[j]);
                        subRes.add(-(nums[i] + nums[j]));
                    }
                    else {

                    }
                }
            }
        }
    }
}
