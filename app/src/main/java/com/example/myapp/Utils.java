package com.example.myapp;

import com.example.myapp.adapters.Item;

import java.util.ArrayList;

public class Utils {
    public static ArrayList<Item> getListViewItems() {
        ArrayList<Item> list = new ArrayList<Item>();
        for (int i = 0; i < 200; i++) {
            list.add(
                    new Item(
                            "item " + (i + 1),
                            R.drawable.circle_check_svgrepo_com
                    )
            );
        }
        return list;
    }
}
