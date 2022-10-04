package function;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * A ExempleFunction interface is more of a generic one that takes one argument and produces a result.
 * This has a Single Abstract Method (SAM) apply which accepts an argument of a type T and produces a result of type R
 */
public class ExempleFunction {

    public static void exempleTestFunction() {
        List<String> names = Arrays.asList("Smith", "Gourav", "Heather", "John", "Catania");
        Function<String, Integer> nameMappingFunctions = String::length;
        List<Integer> nameLength = names.stream().map(nameMappingFunctions).collect(Collectors.toList());
        System.out.println(nameLength);
    }

}
