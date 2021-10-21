package problem;

/**
 * 请你来实现一个myAtoi(string s)函数，使其能将字符串转换成一个 32 位有符号整数（类似 C/C++ 中的 atoi 函数）。
 * 函数 myAtoi(string s) 的算法如下：
 * 读入字符串并丢弃无用的前导空格
 * 检查下一个字符（假设还未到字符末尾）为正还是负号，读取该字符（如果有）。确定最终结果是负数还是正数。如果两者都不存在，则假定结果为正。
 * 读入下一个字符，直到到达下一个非数字字符或到达输入的结尾。字符串的其余部分将被忽略。
 * 将前面步骤读入的这些数字转换为整数（即，"123" -> 123， "0032" -> 32）。如果没有读入数字，则整数为 0。必要时更改符号（从步骤 2 开始）。
 * 如果整数数超过 32 位有符号整数范围 [−2^31, 2^31 − 1] ，需要截断这个整数，使其保持在这个范围内。具体来说，小于 −2^31 的整数应该被固定为
 * −2^31，大于 2^31 − 1 的整数应该被固定为 2^31 − 1。
 * 返回整数作为最终结果。
 * 注意：
 * 本题中的空白字符只包括空格字符 ' ' 。
 * 除前导空格或数字后的其余字符串外，请勿忽略任何其他字符。
 * 链接：https://leetcode-cn.com/problems/string-to-integer-atoi
 */
public class _08_StringToInteger_atoi {
    static class Solution {
        public static int myAtoi(String s) {
            int i = 0;
            boolean minus = false;
            int n = s.length();
            int res = 0;
            while (i < n && s.charAt(i) == ' ')
                i++;
            if (i < n) {
                char ch = s.charAt(i);
                if (ch == '-') {
                    minus = true;
                    i++;
                } else if (ch == '+')
                    i++;
                else if (ch < '0' || ch > '9')
                    return 0;
            }
            for (; i < n; i++) {
                char ch2 = s.charAt(i);
                if (ch2 > '9' || ch2 < '0')
                    break;
                if (res > (Integer.MAX_VALUE - (ch2 - '0')) / 10) {//判断溢出 本题重点！！！！！！！！！！！！！！！
                    if (minus)
                        return Integer.MIN_VALUE;
                    return Integer.MAX_VALUE;
                }
                res = res * 10 + ch2 - '0';
            }
            if (minus)
                return -res;
            return res;
        }
    }

    public static void main(String[] args) {
        System.out.println(Solution.myAtoi("   -42"));//2147483647
    }
}
