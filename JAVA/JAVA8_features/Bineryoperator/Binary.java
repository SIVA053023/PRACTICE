import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.*;

/**
 * Binary
 */
public class Binary {

    public static void main(String[] args) {
        // BiFunction<String,String,String> name=(a,b)->a+b;   // hetre i am concatinating the booth Strings a and b

        // on behalf of the above code i can able to write the Binaryoperator

        BinaryOperator<String> name=(a,b)->a+b;
        System.out.println(name.apply("Siva", "krishna").toUpperCase());


    }
}