package com.avent;

import java.util.ArrayList;

public class Day_3 {

    ArrayList<Item> puzzle;

    public Day_3(int number)
    {
        puzzle = generate_puzzle(number);
    }

    private ArrayList<Item> generate_puzzle(int number) {
        ArrayList<Item> res = new ArrayList<>();
        int x = 0, y = 0;
        for (int i = 1; i <= number; i++)
        {
            Item it = new Item(x, y, i);
        }
        return res;
    }

    class Item{
        int x;
        int y;
        int value;

        public Item(int x, int y, int value) {
            this.x = x;
            this.y = y;
            this.value = value;
        }
    }
}
