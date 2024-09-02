public interface Mainmethod {

    default void m1(){
        System.out.println("This is a default method");
    }
    public static void main(String[] args) {                 // from java 1.8 onwards in interfaces also main method is there
        System.out.println("hello good morning");
        Mainmethod m=new Mainmethod(){};     // // Creating an anonymous class to provide implementation  to intialize the instance nmethod
        m.m1();
      
    }
}
