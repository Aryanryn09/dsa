public class singleton {


          private  singleton() {


    }
    private static singleton instance;

public static singleton getInstance(){
    //new instance will be created when for each of the following new object

            if(instance==null){
              instance =new singleton();

              //when one class is called then one instance is created
                //then the null becomes false so same obj is printed again and again

}
          return instance;
}
}
