package Two;
import java.util.*;
import java.util.function.Predicate;

public class Predi {
    public static void main(String[] args) {
    
        List<String> enames=Arrays.asList("Siva","Krishna","Vamsi","DharanTej","Allu Arjun");
        Predicate<String> p=x->x.toUpperCase().length()>5;
       
        List<String> result= enames.stream().filter(p).toList();
        System.out.println(result);

    }
}
