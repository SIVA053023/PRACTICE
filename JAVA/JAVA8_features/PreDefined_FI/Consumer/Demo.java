import java.util.function.Consumer;

public class Demo{
    public static void main(String[] args) {
        Consumer<String> name=(s)->{};                // it doesn't give any output
        name.accept("Siva");
    }
}