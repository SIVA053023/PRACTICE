/**
 * InnerOne
 */
 interface Bank {
 public void m1();
 public void m2();
 public void m3();
    
}

public class One implements Bank {
    public void m1(){
          System.out.println("This is a m1 method");
     }
     public void m2(){
        System.out.println("This is a m2 method");
   }
   public void m3(){
    System.out.println("This is a m3 method");
   }
   public static void main(String[] args) {
    One n= new One(){};
    n.m1();
    n.m2();
    n.m3();
   }
}
