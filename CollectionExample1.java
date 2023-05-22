
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionExample1 {
    public static void main(String args[]) {
        Collection<String> names = new ArrayList<>();

        // - Add one element
        names.add("jaya");
        System.out.println(names); // [jaya]

        // - Add multiple elements
        names.addAll(List.of("sri", "Ramu"));
        names.addAll(List.of("Manoj", "Kumar"));
        System.out.println(names); // [sri, Ramu]
        System.out.println("After adding list of");
        boolean b = names.remove("Kumar1");
        System.out.println("boolean   " + b + "--------------" + names);
        // -----------------------------------------

        names = new ArrayList<>(List.of("jaya", "sri", "Ramu"));

        // - Remove one element
        names.remove("jaya");
        System.out.println(names); // [sri, Ramu]

        // - Remove multiple elements
        names.removeAll(List.of("sri", "Ramu"));
        System.out.println(names); // [jaya]

        // - Remove based on a condition
        names.removeIf(s -> s.startsWith("j"));
        System.out.println(names); // [Ramu]

        // - Remove all elements
        names.clear();
        System.out.println(names); // []

        // - Remove the differences
        Collection<String> names2 = new ArrayList<>(List.of("jaya", "sri", "Steve"));
        names.retainAll(names2);
        System.out.println(names); // [jaya, sri]

        // -----------------------------------------

        names = new ArrayList<>(List.of("jaya", "sri", "Ramu"));

        // - Print each element
        names.forEach(System.out::println); // jaya sri Ramu

        // - Get size
        System.out.println(names.size()); // 3

        // - Check empty
        System.out.println(names.isEmpty()); // false

        // - Check contain one element
        System.out.println(names.contains("Ramu")); // true

        // - Check contain multiple elements
        System.out.println(names.containsAll(List.of("Ramu", "jaya"))); // true

        // -----------------------------------------

        Collection<String> names3 = new ArrayList<>(List.of("jaya", "sri", "Ramu"));

        // - Convert to array with array type
        String[] strings = names3.toArray(new String[] {});
        System.out.println(Arrays.toString(strings));
    }
}
