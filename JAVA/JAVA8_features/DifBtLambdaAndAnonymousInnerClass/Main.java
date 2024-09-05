// What is the difference between the lambda expression And the Anonymous inner Class,
// here the  Anonymous inner Class is for to implement the interface methods directly in the mainn method



public class Main {
    public static void main(String[] args) {

        // here in the commment lines lines represents the ANONYMOUS INNER CLASS PART

        // One o1=new One (){
        //    public  int  getSalary(){
        //         return 5000;
        //     }
        //     public String empName(){
        //             return "Sivakrishna";
        //     }
        // };

        // System.out.println(o1.getSalary());
        // System.out.println(o1.empName());



        // Here We use the Lambda expresssion but this lamBAd expression is Applicable only when it is a Functional Interface
      One o1=()->{
      System.out.println("Sivakrishna");
      };
    o1.empName();
    //   for(int i=1;i<=10;i++){
    //     System.out.println("Krishna" + i);
    // }

    }
}
