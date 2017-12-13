package com.avent;

public class Day_1 {
    public static int get_captcha_iter(String puzzle)
    {
        int sum = 0;
        int l = puzzle.length();
        for (int i = 0; i < l; i++)
        {
            if (puzzle.charAt(i) == puzzle.charAt((i + l / 2) % l))
            {
                sum += Integer.parseInt("" + puzzle.charAt(i));
            }
        }
        return sum;
    }
}
