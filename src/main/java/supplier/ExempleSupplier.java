package supplier;

import java.util.Optional;
import java.util.function.DoubleSupplier;
import java.util.function.Supplier;

/**
 * A Supplier is a simple interface which indicates that this implementation is a supplier of results.
 * This interface, however, does not enforce any restrictions that supplier implementation needs to return a different result on each invocation.
 */
public class ExempleSupplier {

    public static void exempleTestSupplier() {
        Supplier<Double> doubleSupplier1 = () -> Math.random();
        DoubleSupplier doubleSupplier2 = Math::random;

        System.out.println(doubleSupplier1.get());
        System.out.println(doubleSupplier2.getAsDouble());
    }

    public static void exemple2TestSupplier(){
        Supplier<Double> doubleSupplier = () -> Math.random();
        Optional<Double> optionalDouble = Optional.empty();
        System.out.println(optionalDouble.orElseGet(doubleSupplier));
    }

}
