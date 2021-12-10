package com.geekbrains.lesson4.generics;

public class GenBox <T>{
    // внутри класса ОБОБЩЕННОГО нельзя создавать ТЕПЕРЬ объекты и массивы объектов
    // и статические поля...
    // почему нельзя?
    // static T staticField = ...
    private T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public GenBox(T obj) {
        this.obj = obj;
    }
}
