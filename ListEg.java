import java.util.ArrayList;
import java.util.List;

class MyList {
    public void ArrayEg() {
        List al = new ArrayList(); // Here, there is no use of generic. So, no type safety. We can add both integer
                                   // and string elements.

        // Adding elements using add() method with reference variable al.
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add("Java");

        // Adding element to 4th position.
        al.add(4, 35);

        // Adding element to 5th position.
        al.add(5, 45);

        System.out.println("Elements after adding: " + al);
    }

    void ArrayEgGeneric() {
        // Create a list1 of only String type. This means that Compiler will give errors
        // if we try to put any elements other than String type.
        List<String> al = new ArrayList<String>();
        al.add("Apple");
        al.add("Mango");
        al.add("Orange");
        al.add("Grapes");
        System.out.println("List1 contain: " + al);

        // Create another List2 of String type.
        List<String> al2 = new ArrayList<String>();
        al2.add("11");
        al2.add("12");
        al2.add("13");
        System.out.println("List2 contain :-" + al2);

        // Adding List2 in List1 at 2nd position(i.e index=2) using addAll() method.
        al.addAll(2, al2);
        //List.of({"l1,l2,l2"})
        System.out.println("List1 after adding List2 at 2nd position :-" + al);
    }

    void ArrayListExample1() {
        // Create a generic Arraylist object of String type.
        // This means the compiler will show an error if we try to put any other element
        // than String.
        ArrayList<String> al = new ArrayList<String>(); // Default capacity is 10.

        // Adding elements of String type.
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add(null);
        al.add("D");
        System.out.println(al);

        // Call remove() method to remove element D.
        al.remove("D"); // removes the first occurrence of the specified element D at position 3, not
                        // from the position 5.
        System.out.println(al);
        al.remove(3);
        System.out.println(al);

        // Call set method to replace the element D with a null element at position 3.
        al.set(3, null);
        System.out.println(al);
    }

void ArrayListExample2(){
  ArrayList al = new ArrayList();
  al.add("Apple");
  al.add("Orange");
  al.add("Banana");
  al.add("Gauva");
System.out.println(al);

// Call get() method using object reference variable 'al' to get the specified element.
// Since return type of get() method is String. Therefore, we will store it by using a fruitsName variable with data type String.
     String fruitsName = (String) al.get(2);
     System.out.println(fruitsName);

// Call size() method to get the number of elements present in the list.
// Since return type of size method is an integer. Therefore, we will store it by using variable numberOfElements with data type integer.
     int numberOfElements = al.size();
     System.out.println(numberOfElements);

// Check apple element is present or not.
   boolean check = al.contains("Apple");
   System.out.println(check);
    }
}

public class ListEg {
    public static void main(String args[]) {
        MyList myList = new MyList();
        // myList.ArrayEg();
        // myList.ArrayEgGeneric();
        // myList.ArrayListExample1();
        myList.ArrayListExample2();
    }
}
