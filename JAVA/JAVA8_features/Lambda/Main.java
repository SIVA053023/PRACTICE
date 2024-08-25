 interface Two {
    void sayHello();
}

class MyTwo implements Two {
    @Override
    public void sayHello() {
        System.out.println("Hello from MyTwo!");
    }

    @Override
    public String toString() {
        return "This is a MyTwo instance.";
    }
class ok {
    public static void main(String[] args) {
        // Create an instance of MyTwo
        Two myTwo = new MyTwo();
        
        // Print the custom string representation
        System.out.println(myTwo.toString());
        
        // Create a lambda Tworession for the Two interface
        Two lambdaTwo = () -> System.out.println("Hello from Lambda!");
        
        // Print the default string representation of the lambda Tworession
        System.out.println(lambdaTwo.toString());
        
        // Call the sayHello method
        lambdaTwo.sayHello();
    }
}
}

