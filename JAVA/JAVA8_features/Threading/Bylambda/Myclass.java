public class Myclass {

    public static void main(String[] args) {
        Runnable runnable=()->{                                           // here we are usimng the lambda expression
            for(int i=1;i<=10;i++){
                  System.out.println("hello"+""+i);
            }
        };
        Thread child=new Thread(runnable);
        child.run();
    }
}