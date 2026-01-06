package src.main.java;

import java.lang.String;
import java.util.Scanner;

public class Employee {
    int id;
    java.lang.String name;
    double salary;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        id = sc.nextInt();
        System.out.print("Enter Employee Name: ");
        name = sc.next();
        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.getData();
        e.display();
    }

}
