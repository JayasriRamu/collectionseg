import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class CollectionExample2List {
    public static void main(String args[]) {
        List<String> chars = new ArrayList<>(List.of("a", "b", "c"));

        // Add an element at position
        chars.add(2, "new");
        System.out.println(chars); // [a, b, new, c]

        // Add multiple elements at position
        chars.addAll(2, List.of("A", "newBnew"));

        System.out.println("At position 2 " + chars.get(2));

        System.out.println(chars); // [a, b, newA, newB, c]

        // Edit an element at position
        chars.set(2, "newA");
        System.out.println(chars); // [a, b, newA]

        // Get an element at position
        System.out.println(chars.get(0)); // a

        // Check index of an element
        System.out.println(chars.indexOf("b")); // 1

        // Remove an element at position
        chars.remove(1);
        System.out.println(chars); // [a, c]

        // -------------------------------------------------

        // - Create an unmodified list
        chars = List.of("a", "b", "c");

        // - Create list from an unmodified list
        chars = new ArrayList<>(List.of("a", "b", "c"));

        // - Sort a list a --> z
        chars = new ArrayList<>(List.of("b", "a", "c"));
        chars.sort(Comparator.naturalOrder());
        System.out.println(chars); // [a, b, c]

        // - Sort a list z --> a
        chars.sort(Comparator.reverseOrder());
        System.out.println(chars); // [c, b, a]

        // - Replace/Update all elements
        chars = new ArrayList<>(List.of("a", "b", "c"));
        chars.replaceAll(s -> s + "_1");
        System.out.println(chars); // [a_1, b_1, c_1]
    }
}
