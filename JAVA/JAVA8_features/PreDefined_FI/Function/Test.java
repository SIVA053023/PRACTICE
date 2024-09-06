package One;
import java.util.*;
import java.util.function.Function;

/**
 * Test
 */
public class Test {

    public static void main(String[] args) {
        Function<String, Integer> one=x->x.length();
        Function<Integer,Integer> two=s->s*s;
        System.out.println(one.andThen(two).apply("Sivakrishna"));  // here i am using the andThen() it after executing the first function i.e one

        System.out.println(two.compose(one).apply("Sivakrishna"));  // here i am using the compose() it means first execute the compose() i.e one after that execute the function two

        // both statements gives the same result
    }
}