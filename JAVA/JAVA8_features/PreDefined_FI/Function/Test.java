package One;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Test
 */
public class Test {

    public static void main(String[] args) {
        Function<String, Integer> one = x -> x.length();
        Function<Integer, Integer> two = s -> s * s;
        System.out.println(one.andThen(two).apply("Sivakrishna")); // here i am using the andThen() it after executing
                                                                   // the first function i.e one
        System.out.println(two.compose(one).apply("Sivakrishna")); // here i am using the compose() it means first
                                                                   // execute the compose() i.e one after that execute
                                                                   // the function two

        // both statements gives the same result

        Function<String,String>  name=Function.identity();                      // identify() just it gives the output as like we gave the input
        List<String> enames=Arrays.asList("Siva","Krishna","Vijaymalya");

        enames.stream().forEach(Test::Example);  // by using the For Each method  by using  the method reference  and it just returns the valiue not stored as in list as like Map

        List<String> result=enames.stream().map(m->name.apply(m).toUpperCase()).collect(Collectors.toList());   // here we are using the map it return the value and stores as a list
        // List<String> result=enames.stream().map(String::toUpperCase).collect(Collectors.toList());    one more awy to convert the strings into the UPPERCASE
        System.out.println(result);

    }
    public static void Example(String m){
        System.out.println(m);
    }
}