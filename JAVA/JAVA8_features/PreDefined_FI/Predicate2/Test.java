package One;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test{
    public static void main(String[] args) {
        List<Integer> eids =Arrays.asList(78,56,23,45,69,25,46);
        Predicate<Integer>  p=x->x%2==0 && x%3==0;

        List<Integer> result= eids.stream().filter(p).toList();
        System.out.println(result);
    }
}