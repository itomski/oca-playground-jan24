package de.lubowiecki.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class BuildInInterfaceTest {

    public static void main(String[] args) {

        // Predicate
        // Supplier
        // Consumer
        // Function
        // UnaryOperator
        // BiFunction
        // BiaryOperator

        // Primitive Varianten für int, long und double
        // IntSupplier etc.

        List<String> namen = new ArrayList<>();
        namen.addAll(List.of("Carol", "Peter", "Natasha", "Scott", "Tony"));

        // void accept(String t);
        Consumer<String> cons = n -> System.out.println(n);
        //namen.forEach(cons);

        namen.forEach(n -> System.out.println(n.toUpperCase()));

        System.out.println();

        List<Integer> zahlen = new ArrayList<>(List.of(1,3,7,99,18,12,9));
        zahlen.forEach(z -> System.out.println(z * 10));

        System.out.println();

        Consumer<String> cons1 = n -> System.out.print("# " + n);
        Consumer<String> cons2 = n -> System.out.print(n + "# \n");
        //Consumer<String> combi = cons1.andThen(cons2); // Verbindet zwei Consumer zu einem
        //namen.forEach(combi);
        namen.forEach(cons1.andThen(cons2));


    }
}
