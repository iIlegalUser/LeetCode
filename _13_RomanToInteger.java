package problem;

import java.util.HashMap;

public class _13_RomanToInteger {
    static class Solution {
        public static int romanToInt(String s) {
            HashMap<Character, Integer> map = new HashMap<>(){{
                put('I', 1);
                put('V', 5);
                put('X', 10);
                put('L', 50);
                put('C', 100);
                put('D', 500);
                put('M', 1000);
            }};

            int res = 0;
            int n = s.length();
            for (int i = 0; i < n - 1; i++) {
                int fir = map.get(s.charAt(i));
                if(fir < map.get(s.charAt(i + 1)))
                    res -= fir;
                else
                    res += fir;
            }
            res += map.get(s.charAt(n - 1));
            return res;
        }
    }

    public static void main(String[] args) {
        System.out.println(Solution.romanToInt("IX"));
    }
}
