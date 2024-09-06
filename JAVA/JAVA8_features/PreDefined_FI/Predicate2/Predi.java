package Two;

import One.Test;
import java.util.*;
import java.util.function.Predicate;

public class Predi {
    public static void main(String[] args) {

        List<String> enames = Arrays.asList("Siva", "Krishna", "Vamsi", "DharanTej", "Allu Arjun");
        Predicate<String> p = x -> x.length() > 5 && x.toUpperCase().charAt(0);

        List<String> result = enames.stream().filter(p).map(String :: toUpperCase).toList();
      
        System.out.println(result);
        Test t1 = new Test();   
        t1.name();

    }
}
