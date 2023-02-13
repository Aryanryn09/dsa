package polymorphism;

public class circle extends shapes {


    //this is runned when object of circle is created
    //hence iit will override the parent method
    @Override
//this is callesd annotation


    void area() {
        System.out.println("area is pie r square");
    }
}
