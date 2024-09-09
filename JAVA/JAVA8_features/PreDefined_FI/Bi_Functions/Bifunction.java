import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
public class Bifunction{
    public static void main(String[] args) {
        BiFunction<String, String, Integer> bifun= (x,y)->x.length()+y.length();
        System.out.println(bifun.apply("Sivakrishna", "Virat kohli"));

        BiPredicate<String,Integer> biPredicate= (x,y)->x.length()==y;
        System.out.println(biPredicate.test("Siva", 4));

        BiConsumer<Integer,Integer>  biConsumer=(a,b)->{};
        biConsumer.accept(78, 89);


        // BiSupplier is not there cause the no answer can give a two results, because of that there is no  BiSupplier
    }
}