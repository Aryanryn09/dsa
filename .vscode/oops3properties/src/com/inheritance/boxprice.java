package com.inheritance;

public class boxprice extends boxweight {//multilevel inheritance =

    double cost;

    boxprice(){

        super();
        this.cost=-1;
    }
    boxprice(boxprice other){
        super(other);
        this.cost=other.cost ;
    }

    public boxprice( double l,double h,double w,double weight,double cost) {


  super(l,h,w,weight);
        this.cost = cost;
    }

    public  boxprice(double side,double weight,double cost){


//        super(side,cost) ;

 this.weight=weight;
// super(side,weight);


    }

}
