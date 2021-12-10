package com.geekbrains.lesson4.generics;
// Обобщенные интерфейсы

//public class Box implements Comparable{ // old version
public class Box implements Comparable<Box>{
    private int size;

    public Box(int size){
        this.size = size;
    }
    @Override
    public int compareTo(Box o){
        // New version
        return this.size - o.size;
    }

//    @Override
//    public int compareTo(Object o) {
//
//        // old version
//        if(this == o) {
//            return 0;
//        }
//        if(o instanceof Box){
//            // throw exception
//        }
//        Box another = (Box) o;
//        return this.size - another.size;
//    }
}
