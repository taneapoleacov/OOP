package com.tanea.laboratory1.task1;

public class Monitor {

    int height;
    int weight;
    float diagonal;
    String color;

    boolean compare (Monitor m2){
        return height == m2.height && weight == m2.weight && diagonal == m2.diagonal && color.equals(m2.color);
    }
}

