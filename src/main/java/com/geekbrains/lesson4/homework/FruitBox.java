package com.geekbrains.lesson4.homework;

import com.geekbrains.lesson4.homework.fruits.Fruit;

import java.util.ArrayList;
import java.util.Arrays;

//                b.
//                Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу
//        фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины.
//                c.
//                Для хранения фруктов внутри коробки можно использовать ArrayList.
public class FruitBox<T extends Fruit> {
    private ArrayList<T> container;
    public FruitBox(){
        this.container = new ArrayList<>();
    }

    public FruitBox(T... fruits){
        this.container = new ArrayList<>(Arrays.asList(fruits));
    }
    //                g.
//                Не забываем про метод добавления фрукта в коробку.
    public void add(T fruit){
        this.container.add(fruit);
    }

    public void add(T... fruits){
        this.container.addAll(Arrays.asList(fruits));
    }

    //                d.
//                Написать метод getWeight(), который высчитывает вес коробки. Задать вес одного
//        фрукта и их количество: вес яблока — 1.0f, апельсина — 1.5f (единицы измерения не
//        важны).
    public float getWeight(){
        if(container.size() == 0){
            return 0.0f;
        }
        return container.size() * container.get(0).getWeight();
    }

    //        e.
//                Внутри класса Box написать метод Compare, который позволяет сравнить текущую
//        коробку с той, которую подадут в Compare в качестве параметра. True, если их массы
//        равны, False — в противном случае. Можно сравнивать коробки с яблоками и
//        апельсинами.
    public boolean compare(FruitBox<?> another){
        return Math.abs(this.getWeight() - another.getWeight()) < 0.0001;
    }
    //                f.
//                Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
//        Помним про сортировку фруктов: нельзя высыпать яблоки в коробку с апельсинами.
//                Соответственно, в текущей коробке фруктов не остаётся, а в другую перекидываются
//        объекты, которые были в первой.
    public void transfer(FruitBox<? super T> another){
        // защита от случайной очистки коробки при попытке пересыпать из коробки в нее же.
        if(this == another){
            return;
        }
        another.container.addAll(this.container);
        this.container.clear();
    }
}
