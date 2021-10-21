package problem;

import java.util.Random;

public class _09_PalindromeNumber {
    static class Solution {
        public static boolean isPalindrome1(int x) {
            if (x < 0)
                return false;
            String s = String.valueOf(x);
            int len = s.length() - 1;
            for (int i = 0; i < len; i++, len--) {
                if (s.charAt(i) != s.charAt(len))
                    return false;
            }
            return true;
        }

        public static boolean isPalindrome2(int x) {
            if (x < 0)
                return false;
            int z = x;
            int y = 0;
            while (x != 0) {
                y = y * 10 + x % 10;
                x /= 10;
            }
            return z == y;
        }
    }

    public static int generateRandomPalindromeNumber(int level) {
        int[] numbers = new int[level];
        Random r = new Random();
        level--;
        for (int i = 0; i <= level; i++, level--) {
            if(Math.random() < 0.8){
                numbers[i] = numbers[level] = r.nextInt(9);
            }
            else {
                numbers[i] = r.nextInt(10);
                numbers[level] = r.nextInt(10);
            }
        }
        int res = 0;
        for (int number : numbers) {
            res = res * 10 + number;
        }
        return res;
    }

    public static void main(String[] args) {
        int testTimes = 1000000;
        int level = 8;
        for (int i = 0; i < testTimes; i++) {
            int x = generateRandomPalindromeNumber(level);
            if (Solution.isPalindrome1(x) != Solution.isPalindrome2(x)) {
                System.out.println(Solution.isPalindrome1(x));
                System.out.println(Solution.isPalindrome2(x));
                System.out.println("Oops");
                break;
            }
        }
        System.out.println("Finish!");
    }
}
