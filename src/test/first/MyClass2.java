package test.first;

public class MyClass2 {
    int i = 5;

    public MyClass2 (){

    }

    public static void main(String[] args) {
        MyClass2 myClass2 = new MyClass2();
        System.out.println(myClass2.initialize().i);
    }
    public MyClass2 initialize(){
        i=6;
        return this;
    }
}
