package application;

import entities.Employees;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        List<Employees> employees = new ArrayList<>();

        for (int i=0; i<n; i++) {
            System.out.println();

            System.out.println("Employee #" + (i+1));

            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            Employees employeer = new Employees(id, name, salary);
            employees.add(employeer);

        }

        System.out.println();
        System.out.print("Enter the employee ID that will have salary increase: ");
        int id = sc.nextInt();

        boolean found = false;

        for (Employees employeer : employees) {
            if (employeer.getId() == id) {
                found = true;

                System.out.print("Enter the percentage: ");
                double perc = sc.nextDouble();

                employeer.increaseSalaryByPerc(perc);
            }
        }

        if (!found) {
            System.out.println();
            System.out.println("This id does not exist!");
            System.out.println();

            System.out.println("List of employees:");
            for (Employees employer : employees) {
                System.out.println(employer);
            }
        } else {
            System.out.println();
            System.out.println("List of employees:");
            for (Employees employer : employees) {
                System.out.println(employer);
            }
        }

        sc.close();

    }
}