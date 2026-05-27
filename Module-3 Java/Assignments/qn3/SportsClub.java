package com.java.Assignment_01.qn3;

import java.util.Scanner;

public class SportsClub {

    public static void main(String[] args) {

        Employee employee[] = new Employee[10];
        int count = 0;
        int key = 0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n----------Select Your Choice-----------");
            System.out.println("1. Add New Employee");
            System.out.println("2. Display (Salaried / Contract)");
            System.out.println("3. Search by ID");
            System.out.println("4. Search by Name");
            System.out.println("5. Display All Employees");
            System.out.println("6. Salary by Designation");
            System.out.println("7. Display 5 Employees by Department");
            System.out.println("8. Exit");
            System.out.print("Choice: ");

            key = sc.nextInt();

            switch (key) {

                case 1: {
                    if (count < 10) {

                        System.out.println("1. Salaried Employee");
                        System.out.println("2. Contract Employee");
                        System.out.println("3. Vendor");

                        int type = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Name: ");
                        String name = sc.nextLine();

                        System.out.print("Mobile: ");
                        String mobno = sc.nextLine();

                        System.out.print("Email: ");
                        String emailId = sc.nextLine();

                        System.out.print("Date Of Joining: ");
                        String doj = sc.nextLine();

                        System.out.print("Department: ");
                        String dept = sc.nextLine();

                        System.out.print("Designation: ");
                        String des = sc.nextLine();

                        if (type == 1) {
                            System.out.print("Basic Salary: ");
                            double sal = sc.nextDouble();

                            employee[count++] = new SalariedEmployee(
                                    name, mobno, emailId, doj, dept, des, sal);

                        } else if (type == 2) {
                            System.out.print("Hours: ");
                            int hrs = sc.nextInt();

                            System.out.print("Rate: ");
                            float rate = sc.nextFloat();

                            employee[count++] = new ContractEmployee(
                                    name, mobno, emailId, doj, dept, des, hrs, rate);

                        } else if (type == 3) {
                            System.out.print("No of Employees: ");
                            int no = sc.nextInt();

                            System.out.print("Amount: ");
                            float amt = sc.nextFloat();

                            employee[count++] = new Vendor(
                                    name, mobno, emailId, doj, dept, des, no, amt);
                        }

                        System.out.println("Employee Added!");
                    } else {
                        System.out.println("No space available!");
                    }
                    break;
                }

                case 2: {
                    System.out.println("1. Salaried");
                    System.out.println("2. Contract");

                    int type = sc.nextInt();

                    for (int i = 0; i < count; i++) {
                        if (type == 1 && employee[i] instanceof SalariedEmployee) {
                            employee[i].display();
                        }
                        else if (type == 2 && employee[i] instanceof ContractEmployee) {
                            employee[i].display();
                        }
                    }
                    break;
                }

                case 3: {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (employee[i].getId() == id) {
                            employee[i].display();
                            found = true;
                        }
                    }

                    if (!found)
                        System.out.println("Employee not found!");
                    break;
                }

                case 4: {
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (employee[i].getName().equalsIgnoreCase(name)) {
                            employee[i].display();
                            found = true;
                        }
                    }

                    if (!found)
                        System.out.println("Employee not found!");
                    break;
                }

                case 5: {
                    for (int i = 0; i < count; i++) {
                        employee[i].display();
                    }
                    break;
                }

                case 6: {
                    sc.nextLine();
                    System.out.print("Enter Designation: ");
                    String des = sc.nextLine();

                    for (int i = 0; i < count; i++) {
                        if (employee[i].getDesignation().equalsIgnoreCase(des)) {
                            System.out.println("Name: " + employee[i].getName());
                            System.out.println("Salary: " + employee[i].getTotalSalary());
                        }
                    }
                    break;
                }

                case 7: {
                    sc.nextLine();
                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();

                    int c = 0;

                    for (int i = 0; i < count; i++) {
                        if (employee[i].getDepartment().equalsIgnoreCase(dept)) {
                            employee[i].display();
                            c++;
                        }
                        if (c == 5)
                            break;
                    }

                    if (c == 0)
                        System.out.println("No employees found!");
                    break;
                }

                case 8:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (key != 8);

        sc.close();
    }
}