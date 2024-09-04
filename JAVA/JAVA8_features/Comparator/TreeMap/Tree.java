package TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class Tree {
    public static void main(String[] args) {
        Map<String,String> employees=new TreeMap<>((a,b)->b.compareTo(a));      // here the tree map can accepts the comparator
       employees.put("name","Siva");
       employees.put("name","krishna");
       employees.put("name","Allu");
       System.out.println(employees);
    }
}
