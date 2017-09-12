/**
 * Created by hghawsi on 12.09.2017.
 */
public class MethodReference {

    public static int add(int a, int b){
        return a + b;
    }

    interface Printer{
        void print(String val);
    }
    public void printSomething(String something, Printer printer){
        printer.print(something);
    }

    public static void main(String[] args){
        MethodReference methodReference = new MethodReference();
        String something = "I am Lambda";

        /*methodReference.printSomething(something, new Printer() {
            @Override
            public void print(String val) {
                System.out.print(val);
            }
        });*/

        //methodReference.printSomething(something, (toPrint) -> System.out.print(toPrint));

        methodReference.printSomething(something, System.out::println);
    }
}
