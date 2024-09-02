interface A{
    default void sayHello(){
        System.out.println("A says hello");
    }
}
interface B{
    default void sayHello(){
System.out.println("B says hello");
    }
}
public class Myclass implements A,B{                            // here we are achieving the Multiple inheritence  through the interfaces  but it is not possible in the Class level
    public static void main(String[] args) {
        Myclass m=new Myclass();
        m.sayHello();
    }
    public void sayHello(){                    // here we are telling the compiler to print the interface A sayhello();
        A.super.sayHello();
    }
    // public void sayHello(){
    //     B.super.sayHello();           // if we use this we print the interface B sayHello();
    // }
    
    
    
}