public class Test {
    public static void main(String[] args) {
        One n=new One();                               
        Thread thread=new Thread(n);
        thread.run();
    }
}
