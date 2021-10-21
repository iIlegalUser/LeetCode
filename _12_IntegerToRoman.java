package problem;

public class _12_IntegerToRoman {
    static class Solution {
        public static String intToRoman(int num) {
            int[] arr = new int[]{1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
            String[] symbol = new String[]{"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
            StringBuilder res = new StringBuilder();
            for (int i = arr.length - 1; i >= 0; i--) {
                if (num >= arr[i]) {
                    res.append(symbol[i].repeat(num / arr[i]));
                    num = num % arr[i];
                }
            }
            return res.toString();
        }
    }

    public static void main(String[] args) {
        System.out.println(Solution.intToRoman(1994));
    }
}
