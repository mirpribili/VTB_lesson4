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
        /*
        тоже задался этим вопросом и вот как я это понял:
    "public static <T> ArrayList<T> foo (T...elements)...."
    -- первое указание <T> говорит о том что наш метод имеет дело с универсальным типом <T> (дженерик-метод!). Если сделать без этого указания:
    "public static ArrayList<T>  foo (T...elements)...",  то программа не будет понимать что это за тип <T> такой у нас такой вообще.
    -- второе указание говорит о том что мы вернем список, элементы которого будут объектами класса  <T>. Мы бы могли это второе указание вообще не делать, тогда компилятор полагал бы что у нас возвращается список элементов класса Object.

    и еще один интересный нюанс, если у нас метод бы ничего не возвращал, то он объявлялся бы так:
    "public static <T> void foo (T...elements)......."
    т.е., тут мы: указываем что это метод-дженерик, он получает некие элементы типа <T>, работает с ними, но ничего не возвращает.
        */
        return new ArrayList<>(Arrays.asList(array));
    }
}
