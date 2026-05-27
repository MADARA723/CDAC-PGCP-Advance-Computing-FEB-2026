package test;

// import → access classes from another package
import com.Basics.ContractEmp;
import com.Basics.SalariedEmp;
import com.Basics.Employee;

public class TestEmployee {

    public static void main(String[] args) {

        // ❌ Cannot create object of abstract class
        // Employee e = new Employee();

        // ❌ Even parameterized constructor not allowed for abstract class
        // Employee e1 = new Employee(12,"xxxx","3456","Hr","mgr");

        // Creating Salaried Employee object
        SalariedEmp se = new SalariedEmp(13, "yyyy", "3245342", "Hr", "mgr", 3456, 0);

        // Creating Contract Employee object
        ContractEmp ce = new ContractEmp(14, "zzzz", "566778", "Hr", "mgr", 34, 45565);

        // toString() → prints full object details (Person + Employee + SalariedEmp)
        System.out.println(se);

        // calculateSal() → runtime polymorphism (calls overridden method)
        System.out.println(se.calculateSal());

        // calculateBonus() → method overloading
        System.out.println(se.calculateBonus(0.30f));

        // toString() → prints ContractEmp details
        System.out.println(ce);

        // calculateSal() → different logic (hrs * charges)
        System.out.println(ce.calculateSal());
    }
}