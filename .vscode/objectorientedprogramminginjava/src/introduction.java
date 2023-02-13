import java.util.Arrays;

public class introduction {
    public static void main(String[] args) {

        //creating a function in java
//creating obbjects for storing dofferent values

        int[] rono = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];
        Student aryan;
        aryan = new Student(29,"aryanbaneos",39.3f);

        Student one =new Student();
        Student two =one ;
one.name="something something";
        System.out.println(two.name);
        Student kunal =new Student(29,"aryanbaneos",39.3f);
        System.out.println(aryan );


//        aryan.roll=90;
//    aryan.name="aryan bansod";
//    aryan.marks=90.3f;


        System.out.println(Arrays.toString(students));//right now the student has by default value of null
  System.out.println(aryan.roll);
        System.out.println(aryan.name);
        System.out.println(aryan.marks);

        aryan.greeting();//running a void function and checking that it wo
        //it works for greetings or  not =


    }
    }
        class Student{
            int  roll;
            String  name;
            float marks;

            void greeting(){
                System.out.println("my name is "+name);
                System.out.println("my name is "+this.name);
                //s[ecified to that name called by the constructor itslef
            }



            Student(){
                //template for constructir
//
//                this.roll=29;
//                this.name="aryan bansod ";
//                this.marks=80.3f;

                //above or bleow is considerable
                this(23,"aryan band",93.5f);
            }

            Student(int roll,String name,float marks){
                //template for constructir

                this.roll=roll;
                this.name=name;
                this.marks=marks;

            }

            }




