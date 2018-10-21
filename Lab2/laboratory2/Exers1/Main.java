package com.tanea.laboratory2.Exers1;

public class Main {
    public static void main(String[] args) {

        Box box1 = new Box();
        Box box2 = new Box(5);
        Box box3 = new Box(4,5,8);

        System.out.println("The first box dimensions: "+box1.toString());
        System.out.println("The area of box1 is "+box1.areaCalculator());
        System.out.println("The volume of box1 is "+box1.volumeCalculator());


        System.out.println("The second box dimensions: "+box2.toString());
        System.out.println("The area of box2 is "+box2.toString());
        System.out.println("The volume of box2 is "+box2.toString());

        System.out.println("The third box dimensions:  "+box3.toString());
        System.out.println("The area of box3 is "+box3.toString());
        System.out.println("The volume of box3 is "+box3.toString());
    }

}
