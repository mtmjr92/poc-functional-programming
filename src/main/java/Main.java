import consumer.ExempleConsumer;
import function.ExempleFunction;
import predicate.ExemplePredicate;
import supplier.ExempleSupplier;

public class Main {

    public static void main(String[] args) {
        System.out.println("CONSUMER");

        ExempleConsumer.exempleTestConsumer(s -> System.out.println(s));
        ExempleConsumer.exemple2TestConsumer();

        System.out.println("\nSUPPLIER");

        ExempleSupplier.exempleTestSupplier();
        ExempleSupplier.exemple2TestSupplier();

        System.out.println("\nPREDICATE");

        ExemplePredicate.exempleTestPredicate();
        ExemplePredicate.exemple2TestPredicate();

        System.out.println("\nFUNCTION");
        ExempleFunction.exempleTestFunction();
    }

}
