package com.inheritance;

public class boxweight extends box{//inheritance

    double weight;

    public boxweight() {
        this.weight=-1;

    }

    boxweight(boxweight other){
super(other);
        //default costrucor will be called in any given default circumstance
weight = other.weight;

    }



    public boxweight(double l, double w, double h, double weight) {
        super(l, w, h);//what iis this over here

        System.out.println(this.w);
        this.weight = weight;
        System.out.println(super.h);

    }

    }

//initializtion o fthe constructor in the main should be done

