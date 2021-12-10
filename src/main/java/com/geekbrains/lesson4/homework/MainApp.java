package com.geekbrains.lesson4.homework;

import com.geekbrains.lesson4.homework.fruits.Apple;
import com.geekbrains.lesson4.homework.fruits.Fruit;
import com.geekbrains.lesson4.homework.fruits.Orange;

import java.util.ArrayList;
import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
//        3.
//        Задача:
//                a.
//                Даны классы Fruit -> Apple, Orange.
        FruitBox<Apple> appleBox = new FruitBox<>(new Apple());
        FruitBox<Apple> anotherAppleBox = new FruitBox<>(new Apple());

        FruitBox<Orange> orangeBox = new FruitBox<>(new Orange());
        FruitBox<Fruit> fruitBox = new FruitBox<>();

        appleBox.transfer(fruitBox);
        appleBox.transfer(anotherAppleBox);
        // fruitBox.transfer(appleBox);
        // appleBox.transfer(orangeBox);

    }


    //        1.
    //        Написать метод, который меняет два элемента массива местами (массив может быть любого
    //                ссылочного типа).
    public static void swap(Object[] arr, int n1, int n2){
        Object obj = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = obj;
    }

    //        2.
    //        Написать метод, который преобразует массив в ArrayList.
    public static <T> ArrayList<T> convertToList(T[] array){
        return new ArrayList<>(Arrays.asList(array));
    }
}
