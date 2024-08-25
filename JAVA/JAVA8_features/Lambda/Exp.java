                              // NORMAL

/**
   public interface Exp {

    void sayHello();
  }


  class Test implements Exp{

    public void sayHello(){
      System.out.println("Hellow good morning");
    }
        public static void main(String[] args) {
          Test t1=new  Test();
          t1.sayHello();

          
        }
  }
 */


                                       // Lambda


      /**
       * Exp
       */
      public interface Exp {
      
       void sayHello();
      }
      
      class child {

        // public void sayHello(){
        //   System.out.println("good morning");           this is a normal way but
        // }
        public static void main(String[] args) {
             
         Exp s1= ()->{System.out.println("hello good morning");};
         s1.sayHello();
        }
      }

