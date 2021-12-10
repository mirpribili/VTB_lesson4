package com.geekbrains.lesson4.generics;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        // old
        SimpleBox intBox1 = new SimpleBox(10);
        SimpleBox intBox2 = new SimpleBox(20);
        // ....
        intBox2.setObj("Java"); // will give an error later
        // ....
        if (intBox1.getObj() instanceof Integer && intBox2.getObj() instanceof Integer) {
            int sum = (Integer) intBox1.getObj() + (Integer) intBox2.getObj();
            System.out.println("sum: " + sum);
        }else {
            System.out.println("error");
        }
        // NEW
        GenBox<String> strBox = new GenBox<>("Java");
        GenBox<Integer> intBox10 = new GenBox<>(10);
        GenBox<Integer> intBox20 = new GenBox<>(20);
        int sum = intBox10.getObj() + intBox20.getObj();

        // new extended version
        BoxWithNumbers<Integer> intBox03 = new BoxWithNumbers<>(1,2,3,4);
        BoxWithNumbers<Integer> intBox03b = new BoxWithNumbers<>(1,2,3,4);
        System.out.println(intBox03.average());
        BoxWithNumbers<Float> floatBox03 = new BoxWithNumbers<>(1.0f,2.0f,3.0f,4.0f);
        System.out.println(floatBox03.average());
        System.out.println(intBox03.compareAverage(intBox03b));

        System.out.println(intBox03.compareAverageAnyType(floatBox03));

        method01a(new int[]{1,2,3,4,5});
        method02a(1,2,3,4,5);
    }
    // analog
    public static void method01a(int[] arr){}
    public static void method02a(int... arr){}



    // What is the difference?
    public static void doSomething01(GenBox<? extends Number> box){} // Number or child
    public static void doSomething02(GenBox<Number> box){} // ONLY NUMBER !!!
    public static void doSomething03(GenBox<? super Number> box){} // Number or parent


    /// Обобщенный метод!
    public static <T> T getFirstElement01(List<T> list){
        return list.get(0);
    }
    public static <T extends Number> T getFirstElement02(List<T> list){
        return list.get(0);
    }

}
