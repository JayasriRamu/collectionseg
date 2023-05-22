import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Person {
    String first_Name;
    String last_Name;

    Person() {

    }

    Person(String first_Name, String last_Name) {
        this.first_Name = first_Name;
        this.last_Name = last_Name;
    }

    @Override
    public String toString() {
        return "Person [first_Name=" + first_Name + ", last_Name=" + last_Name + "]";
    }
}

public class CollectionExample4Map {
    public static void main(String args[]) {
        // - Create an normal map
        Map<Integer, String> names = new HashMap<>();
        Map<String, Person> names1 = new HashMap<>();

        // - Create an unmodified map
        names = Map.of(1, "jaya", 2, "ram");

        Person p1 = new Person("Jayasri", "ram");
        names1 = Map.of("1", p1);

        names1.forEach((String, Person) -> {
            System.out.println(String + " => " + Person);
        });
        System.out.println("Hi  ");
        // - Create a modified map from an unmodified map
        Map<Integer, String> names2 = new HashMap<>(Map.of(1, "jaya", 2, "ram"));

        // ---------------------------------------

        Map<Integer, String> names3 = new HashMap<>();

        // - Add one element
        names3.put(1, "jaya");
        System.out.println(names3); // {1=jaya}

        // - Add multiple elements
        names3.putAll(Map.of(1, "jaya", 2, "ram"));
        System.out.println(names); // {1=jaya, 2=rma}

        // - Get value by key
        String name = names.get(1);
        System.out.println(name); // jaya

        // - Get value by key, if don't exist return default value
        name = names.getOrDefault(3, "NOT_FOUND");
        System.out.println(name); // NOT_FOUND

        // ---------------------------------------

        names = new HashMap<>(Map.of(1, "jaya", 2, "ram"));

        // - Get all keys
        Set<Integer> keys = names.keySet();
        System.out.println(keys); // [1, 2]

        // - Get all values
        Collection<String> values = names.values();
        System.out.println(values); // [jaya, ram]

        // - Print key-value
        names.forEach((k, v) -> System.out.printf("k=%s, v=%s %n", k, v));
        // k=1, v=jaya
        // k=2, v=ram
        // ---------------------------------------

        // - Update multiple values
        names = new HashMap<>();
        for (int i = 0; i < 4; i++) {
            names.compute(i, (k, v) -> "jaya_" + k);
        }
        System.out.println(names); // {0=jaya_0, 1=jaya_1, 2=jaya_2, 3=jaya_3}
    }
}
