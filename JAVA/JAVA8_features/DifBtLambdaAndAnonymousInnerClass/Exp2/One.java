// here we are using the lambda expressions only

public class One {
    public static void main(String[] args) {
        Test t1=()->"Sivakrishna";
       System.out.println( t1.get_Name());

       String result=t1.get_Name();
       System.out.println(result);

       Test Editor=()->"Editor name is";
       System.out.println( Editor.get_Name());

       Test Manager=()->"Allu Arjun";
       System.out.println( Manager.get_Name());
       

    }

}
