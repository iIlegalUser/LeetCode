package problem;

public class _34_FindFirstAndLastPosition {
    static class Solution {
        public static int[] searchRange(int[] nums, int target) {
            int[] res = new int[]{-1, -1};
            if (nums.length == 0) {
                return res;
            }
            int leftInx = 0;
            int rightInx = nums.length - 1;
            int temp = nums.length / 2;
            while (nums[temp] != target) {
                if (leftInx >= rightInx) {
                    return res;
                }
                if (nums[temp] > target) {
                    rightInx = temp - 1;
                } else {
                    leftInx = temp + 1;
                }
                temp = (rightInx + leftInx) / 2;
            }
            rightInx = leftInx = temp;
            while (leftInx >= 0 && nums[leftInx] == target) {
                leftInx--;
            }
            while (rightInx < nums.length && nums[rightInx] == target) {
                rightInx++;
            }
            res = new int[]{leftInx + 1, rightInx - 1};
        /*res[0] = leftInx + 1;
        res[1] = rightInx - 1;*/
            return res;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5, 7, 7, 8, 8, 10};
        int[] res = Solution.searchRange(nums, 8);
        System.out.println(res[0] + " " + res[1]);
    }
}
