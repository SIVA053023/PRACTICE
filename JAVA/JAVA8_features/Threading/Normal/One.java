public class One implements Runnable{
    @Override
    public void run() {
        // TODO Auto-generated method stub
        for(int i=1;i<=10;i++){
            System.out.println("Hello"+" "+ i);           // here we are implementing the run();
        }
    }
}

// Here the runnable contains the only one abstract method that is run(); 

