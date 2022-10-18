package test.first;

public class MyClass {
    //fields - parameters - variables
    //constructors
    //methods
   static int i;

    public MyClass (){
        i=6;
    }

    public static void main(String[] args) {

        MyClass.initialize();
        System.out.println(EnumConstants.MONDAY);

    }
public static void initialize(){
        System.out.println("I'm in initialize method");
    }
}
