// public package Exp1;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Test {

    public static void main(String[] args) {
      Predicate <String> LetterStartsWithV=x->x.charAt(0) =='V';
      List<String> Names= Arrays.asList("Sivakrishna", "Vamsi","VishnuPriya","VV Vinayak","Vamsi");
        //  List<String> result=Names.stream().filter(LetterStartsWithV).collect(Collectors.toList());       // List Allow the Duplicates
         Set<String> result=Names.stream().filter(LetterStartsWithV).collect(Collectors.toSet());           // Set doesn't Allow the duplicates
         System.out.println(result);
    }
}