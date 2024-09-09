import java.util.function.Function;
import java.util.function.UnaryOperator;


// Unary Operator extends the FunctionInterface

/**
 * Unary
 */
public class Unary {

    public static void main(String[] args) {
        // Function<Integer,Integer> fun=s->s*s;

        // This is wha t the diffrence between the unary and the function that it requires the both inout type and the output type even though both types are same
        // but in case of unary it not requires to declare the input and the output type when the bot are same types, just delclare once is enough
        UnaryOperator<Integer> unary=x->x*x;
       System.out.println( unary.apply(8));

       UnaryOperator<String> unary2=s->s.toUpperCase();
       System.out.println(unary2.apply("Sivakrishna"));
    }
}