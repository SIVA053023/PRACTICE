import java.util.*;

public class Test{
    public static void main(String[] args) {
        List<Integer> enames=new ArrayList<>();
        enames.add(56);
        enames.add(789);
        enames.add(45);
        enames.add(265);
        enames.add(321);
        Collections.sort(enames,(a,b)->b-a);          // a-b means a Ascending order and b-a means descending order
        System.out.println(enames);
    }
}