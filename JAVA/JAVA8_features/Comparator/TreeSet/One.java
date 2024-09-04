package TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class One {
    public static void main(String[] args) {
        
        Set<Integer> eids= new TreeSet<>((a,b)->b-a);
        eids.add(12);
        eids.add(11);
        eids.add(13);
        System.out.println(eids);

    }
}
