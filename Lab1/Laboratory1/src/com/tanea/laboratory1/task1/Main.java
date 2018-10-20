package com.tanea.laboratory1.task1;

public class Main {

    public static void main(String[] args) {
        Monitor monitor1 = new Monitor();
        monitor1.height = 10;
        monitor1.weight = 15;
        monitor1.diagonal = 15.6f;
        monitor1.color = "black";

        Monitor monitor2 = new Monitor();
        monitor2.height = 9;
        monitor2.weight = 10;
        monitor2.diagonal= 13;
        monitor2.color = "blue";

        if(monitor1.compare(monitor2) == true) System.out.println("Monitors are equal");
        else System.out.println("Monitors differ");
    }

}
