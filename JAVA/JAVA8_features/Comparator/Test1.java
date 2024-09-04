import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        
        List<String> enames=Arrays.asList("Siva","Krishna","Vamsi","Nithin","Pawankalyan","Chiranjeevi");
        Collections.sort(enames,(a,b)->b.compareTo(a));  // here the " compareTo" is for to comparing the String
        System.out.println(enames);
    }
}
