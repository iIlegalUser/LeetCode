package problem;


public class _171_ExcelNumber {
    static class Solution {
        public static int titleToNumber(String columnTitle) {
            int res = 0;
            for (int i = 0; i < columnTitle.length(); i++) {
                res *= 26;
                res += columnTitle.charAt(i) - 'A' + 1;
            }
            return res;
        }
    }

    public static void main(String[] args) {
        System.out.println(Solution.titleToNumber("FXSHRXW"));
    }
}
