package application;

import entities.Account;
import entities.exceptions.DomainException;

import java.util.Scanner;

public class ProgramAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();

            System.out.print("Holder: ");
            String holder = sc.nextLine();

            System.out.print("Initial balance: ");
            double inib = sc.nextDouble();

            System.out.print("Withdraw limit: ");
            double wlimit = sc.nextDouble();

            Account account = new Account(number, holder, inib, wlimit);

            System.out.println();

            System.out.print("Enter amount of withdraw: ");
            double amount = sc.nextDouble();

            account.withdraw(amount);

            System.out.println("New Balance: " + account.getBalance());
        } catch (DomainException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }

        sc.close();
    }
}
