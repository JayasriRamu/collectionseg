import java.util.ArrayList;

class Employee {
    int eNo;
    String name, address;

    Employee(int eNo, String name, String address) {
        this.eNo = eNo;
        this.name = name;
        this.address = address;
    }

    public Employee() {

    }

    // Display all employees data.
    void displayData(ArrayList<Employee> list) {
        System.out.println("Employee Detail");
        for (Employee emp : list) {
            System.out.println("Employee number: " + emp.eNo);
            System.out.println("Employee Name: " + emp.name);
            System.out.println("Employee Address: " + emp.address);
        }
    }
}

public class ListUserDefined {
    public static void main(String args[]) {
        Employee emp1 = new Employee(102, "Java", "Gosling");
        Employee emp2 = new Employee(205, "SpringBoot", "IOC");
        Employee emp3 = new Employee(333, "Collections", "Framework");

        ArrayList<Employee> list = new ArrayList<Employee>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        Employee temp = new Employee();

        // Call displayData method using temp reference variable object and pass list as
        // a parameter.
        temp.displayData(list);
    }
}
