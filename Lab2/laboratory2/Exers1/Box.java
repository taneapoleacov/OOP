package com.tanea.laboratory2.Exers1;

public class Box {
    private double height,width,depth;


    public Box(double value) {
        height = value;
        width = value;
        depth = value;
    }

    public Box() {
        height = 1;
        width = 1;
        depth = 1;
    }

    public Box( double height, double width,double depth) {
        this.height =height;
        this.width = width;
        this.depth = depth;
    }

    @Override
    public String toString() {
        return ( width+" x "+ height+" x "+ depth);
    }


    public double areaCalculator(){
        return 2*width*height+2*height*depth+2*depth*width ;

    }

    public double volumeCalculator(){
        return width*height*depth;
    }
}


