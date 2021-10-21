package problem;

public class _04_MedianOfTwoSortedArrays {
    static class Solution {
        public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
            double res = 0;
            int len = nums1.length + nums2.length;
            int i = (nums1.length - 1) / 2;

            if(len % 2 == 0){
                int n = len / 2 - 1;
                int j = n - i;
                while(j < nums2.length && nums2[j] < nums1[i]){
                    i = i / 2;
                    j = n - i;
                }
                if(j >= nums2.length) {
                    i = n - nums2.length;
                    res = ((double) (nums1[i] + nums1[i + 1])) / 2;
                }
                else if(nums1[i + 1] <= nums2[j]){
                    res = ((double) (nums1[i] + nums1[i + 1])) / 2;
                }
                else {
                    res = ((double) (nums1[i] + nums2[j])) / 2;
                }
            }
            else {
                int n = len / 2;
                int j = n - i;
                while(j < nums2.length && nums2[j] < nums1[i]){
                    i = i / 2;
                    j = n - i;
                }
                if(j >= nums2.length)
                    res = nums1[n - nums2.length];
                else
                    res = nums1[i];
            }
            return res;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{5,7,8,9,10};
        int[] nums2 = new int[]{0,1};
        System.out.println(Solution.findMedianSortedArrays(nums1, nums2));
    }
}
