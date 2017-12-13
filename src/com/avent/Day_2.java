package com.avent;

public class Day_2 {

    public static int get_checksum(String[][] puzzle)
    {
        int sum = 0;
        for (int i = 0; i < puzzle.length; i++)
            sum += get_difference(puzzle[i]);
        return sum;
    }

    private static int get_difference(String[] strings) {
        int lower = Integer.parseInt(strings[0]), higher = Integer.parseInt(strings[0]);
        for (int i = 1; i < strings.length; i++)
        {
            if (Integer.parseInt(strings[i]) < lower)
                lower = Integer.parseInt(strings[i]);
            if (Integer.parseInt(strings[i]) > higher)
                higher = Integer.parseInt(strings[i]);
        }
        return higher - lower;
    }

    public static int get_checksum_1(String[][] puzzle)
    {
        int sum = 0;
        for (int i = 0; i < puzzle.length; i++)
        {
            //System.out.println("divide["+i+"] = " + get_divide(puzzle[i]));
            sum += get_divide(puzzle[i]);
        }
        return sum;
    }

    private static int get_divide(String[] strings) {
        for (int i = 0; i < strings.length; i++)
            for (int j = 0; j < strings.length; j++)
                if (Integer.parseInt(strings[j]) > Integer.parseInt(strings[i]) &&
                        Integer.parseInt(strings[j]) % Integer.parseInt(strings[i]) == 0)
                    return Integer.parseInt(strings[j]) / Integer.parseInt(strings[i]);
        return 0;
    }

}
