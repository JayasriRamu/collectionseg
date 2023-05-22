import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionExample3Set {
    public static void main(String args[]) {
        // - Create a set
        Set<String> uniqueNames = new HashSet<>();

        // - Create an unmodified set
        uniqueNames = Set.of("b", "a", "c", "d");
        System.out.println(uniqueNames); // [a, b, c]

        // - Create a set from a list
        uniqueNames = new HashSet<>(List.of("a", "b", "a", "c"));

        System.out.println(uniqueNames); // [a, b, c]
    }

}
