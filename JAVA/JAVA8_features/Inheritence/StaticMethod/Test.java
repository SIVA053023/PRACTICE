public interface Test {
    public static void one() {
        System.out.println("hii good morning");
    }
}

class A  implements Test{
    public static void one() {
        System.out.println("hii good Evining");            // here we are not overriding the method one  
    }
    public static void main(String[] args) {
        Test.one();
        A.one();
    }
}
