package com.ansh.inheritance;

public class Box {
    double weight;
    double l;
    double b;
    double h;

    Box()
    {
        this.l=-1;
        this.b=-1;
        this.h=-1;
    }

    Box(double side)
    {
        this.l=side;
        this.b=side;
        this.h=side;
    }

    Box(double l,double b,double h)
    {
        this.l=l;
        this.b=b;
        this.h=h;
    }

    Box(Box old)
    {
        this.l= old.l;
        this.b= old.b;
        this.h= old.h;
    }

    public void information()
    {
        System.out.println("Running the box");
    }

}

class BoxWeight extends Box{
    double weight;

    public BoxWeight() {
        this.weight=-1;
    }

    public BoxWeight(double side, double weight) {
        super(side);// what is this thing?? -> call the parent class constructor
        this.weight = weight;
    }

    public BoxWeight(double l, double b, double h, double weight) {
        super(l, b, h);
        this.weight = weight;
    }

    public BoxWeight(Box old) {
        super(old);
        weight=old.weight;
    }
}
