package problem;

import java.util.Arrays;

/*
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 * https://leetcode-cn.com/problems/longest-common-prefix/
 */
public class _14_LongestCommonPrefix {
    static class Solution {
        public static String longestCommonPrefix(String[] strs) {
            if(strs == null || strs.length == 0 )
                return "";
            Arrays.sort(strs);
            String fir = strs[0];
            String last = strs[strs.length - 1];
            int i = 0;
            for(; i < Math.min(fir.length(), last.length()) && fir.charAt(i) == last.charAt(i); i++);
            return fir.substring(0, i);
        }
    }

    public static void main(String[] args) {
        String[] strs = new String[]{""};
        System.out.println(Solution.longestCommonPrefix(strs));
    }
}
