import java.util.*;

public class Test{
    public static void main(String[] args) {
        List<Integer> eids=new ArrayList<>();
        eids.add(56);
        eids.add(789);
        eids.add(45);
        eids.add(265);
        eids.add(321);

        // below line no 13 is by using the lambda expression without creating a extra Myclass for implementing the Comparator interface
       // Collections.sort(eids,(a,b)->b-a);          // a-b means a Ascending order and b-a means descending order
       Collections.sort(eids,new Myclass());
        System.out.println(eids);
    }
}