package problem;

/*
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 * 如果反转后整数超过 32 位的有符号整数的范围[−2^31, 2^31 − 1] ，就返回 0。
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 * 链接：https://leetcode-cn.com/problems/reverse-integer
 */

public class _07_ReverseInteger {
    static class Solution {
        public static int reverse(int x) {
            int res = 0;

            while (x != 0) {
                res = res * 10 + x % 10;
                if ((res > Integer.MAX_VALUE / 10 || res < Integer.MIN_VALUE / 10) && (x > 9 || x < -9))
                    return 0;
                x = x / 10;
            }
            return res;
        }
    }

    public static void main(String[] args) {
        System.out.println(Solution.reverse(-2147483648));
    }
}
