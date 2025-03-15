package main;

import entities.BubbleSort;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();

        for(int i=20; i>0; i--){
            list.add(i);
        }

        System.out.println(list);


        BubbleSort.sort(list);

        System.out.println(list);

    }
}
