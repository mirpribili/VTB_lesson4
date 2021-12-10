package com.geekbrains.lesson4.lists;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        //
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("ZZ","AA","B","B","B","C","D","E","B"));
        arrayList.get(0);
        // How to remove all?
        while (arrayList.remove("B"));
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);
        arrayList.sort(new Comparator<String>(){
            @Override
            public int compare(String o1, String o2){
                return o1.length() - o2.length();
            }
        });
        System.out.println(arrayList);

        // Who is faster sorted?
        List<Integer> aList = new ArrayList<>(1000000);
        List<Integer> lList = new LinkedList<>();
        for (int i = 0; i < 1000000; i++){
            int x = (int)(Math.random() * 5000);
            aList.add(x);
            lList.add(x);
        }
        long time = System.currentTimeMillis();
        Collections.sort(aList);
        System.out.println("time of aList:" + (System.currentTimeMillis() - time));

        time = System.currentTimeMillis();
        Collections.sort(lList);
        System.out.println("time of lList:" + (System.currentTimeMillis() - time));
    }
}
