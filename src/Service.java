package src;

import java.util.Scanner;

public class Service {
    private static final Scanner sc = new Scanner(System.in);

    public static void service() {
        Integer number;
        String agency;
        String clientName;
        Double balance;

        System.out.println("Please enter the number of the account:");
        number = sc.nextInt();

        System.out.println("Please enter the agency of the account:");
        agency = sc.next();

        System.out.println("Please enter the client name of the account:");
        clientName = sc.next();

        System.out.println("Please enter the balance of the account:");
        balance = sc.nextDouble();

        BankSystem bank = new BankSystem(number, agency, clientName, balance);
        String message = bank.showMessage();

        System.out.println(message);
    }
}
