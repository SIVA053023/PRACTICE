package Exp2;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

// Printing the Names those names which are not started with 2 nd letter "n" by using the predicator

public class predicate {
    public static void main(String[] args) {
        
        List<String> names=Arrays.asList("Sivakrishna","Menon","vamsi","Vamsi Krishna","Riyaz");

       // below example by using the != operator

       /* Predicate<String> predicate=x->x.charAt(x.length()-2)!='n';
        List<String> result=names.stream().filter(predicate).collect(Collectors.toList());
        System.out.println(result); */

        // now i am usig the negate()

        Predicate<String> predicate=x->x.charAt(x.length()-2)=='n';
        Predicate<String> p=predicate.negate();
        List<String> result=names.stream().filter(p).collect(Collectors.toList());
        System.out.println(result);

    }
}
     
