public interface Two {
      
    void sayHello();                     // we can definitely say this is a functional interface  cause it has exactly one interface
    default void m2(){
          System.out.println("This is a default method");
    }
    
}

// implements keyword to declare that it provides implementations for all the methods defined in the interface.

class one implements Two{
    public void sayHello(){
            System.out.println("hii goood morning");
    }
}

class execute extends one {
    public static void main(String[] args) {
        
        one n1= new one();                                // this execution by using the concrete implementation class from  class one
        n1.sayHello();
        n1.m2();                                        // this is acceced using the one class containes the two methods one is sayhello(); and the m2();

        Two t1=()->System.out.println("Good Evining");       // this one is direct taken from the interface two   and giving lambda expression to it
        t1.sayHello();

        
    }
}
