package com.geekbrains.lesson4.generics;

public class BoxWithNumbers <N extends Number>{
    private N[] array;

    public BoxWithNumbers(N... array){
        this.array = array;
    }
    public double average(){
        double avg = 0.0;
        for(int i = 0; i < array.length; i++){
            avg += array[i].doubleValue();
        }
        avg /= array.length;
        return avg;
    }
    public boolean compareAverage(BoxWithNumbers<N> another){
        return Math.abs(this.average() - another.average()) < 0.0001;
    }
    public boolean compareAverageAnyType(BoxWithNumbers<?> another){
        return Math.abs(this.average() - another.average()) < 0.0001;
    }
}
