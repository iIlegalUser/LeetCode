package problem;

/**
 *
 *将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行 Z 字形排列。
 *比如输入字符串为 "PAYPALISHIRING" 行数为 3 时，排列如下：
 *       P   A   H   N
 *       A P L S I I G
 *       Y   I   R
 *之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："PAHNAPLSIIGYIR"。
 */
public class _06_ZigZagConversion {
    static class Solution {
        public static String convert(String s, int numRows) {
            if(numRows <= 1)
                return s;
            StringBuilder res = new StringBuilder();
            int n = s.length();
            int i = 0;
            while(i < n){//第一行
                res.append(s.charAt(i));
                i = i + (numRows - 1) * 2;
            }
            for(i = 1; i < numRows - 1; i++){//中间各行
                int fir = i;
                while(fir < n){
                    res.append(s.charAt(fir));
                    if(fir + (numRows - 1 - i) * 2 < n)
                        res.append(s.charAt(fir + (numRows - 1 - i) * 2));
                    fir = fir + (numRows - 1) * 2;
                }
            }
            while(i < n){//最后一行
                res.append(s.charAt(i));
                i = i + (numRows - 1) * 2;
            }
            return res.toString();
        }
    }

    public static void main(String[] args) {
        System.out.println(Solution.convert("PAYPALISHIRING", 3));//PAHNAPLSIIGYIR
    }
}
