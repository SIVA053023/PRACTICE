// by using the satic methods we cannot be able to overridden or changed


interface A{
    static void sayHello(){
        System.out.println("Hello good morning");
    }
    default void Bye(){
        System.out.println("Bye....!");
    }
}


public class Main implements A{
    public static void main(String[] args) {
        // how to call the satic method
        A.sayHello();            // this is the only way to call the satic method 

        // how to call the default method, definitely we know that it requires a object
        Main m1=new Main();
        m1.Bye(); 
        // m1.sayHello();       we cannot be able to call the satic method like this

    }
}

