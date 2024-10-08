package src;

import java.util.ArrayList;
import java.util.Scanner;

public class BudgetManager {
    private static float balance = 0;
    private static float expenses = 0;
    private static ArrayList<String> items = new ArrayList<String>();

    public static void main(String[] args) {
        do {
            displayMenu();
            switch (new Scanner(System.in).nextInt()) {
                case 1:
                    addIncome();
                    break;
                case 2:
                    addPurchase();
                    break;
                case 3:
                    showList();
                    break;
                case 4:
                    displayBalance();
                    break;
                case 0:
                    exit();
                default:
                    System.out.println("Invalid action");
            }
        } while (true);
    }

    private static void displayMenu() {
        System.out.println("\nChoose your action:");
        System.out.println("1.) Add income\n2.) Add purchase");
        System.out.println("3.) Show list of purchases");
        System.out.println("4.) Balance\n0.) Exit");
    }

    public static void addIncome() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter income:");
        int income = sc.nextInt();

        balance += income;
        System.out.println("Income was added!");
    }

    public static void addPurchase() {
        Scanner sc = new Scanner(System.in);
        StringBuilder item = new StringBuilder();

        System.out.println("\nEnter purchase name:");
        item.append(sc.nextLine());

        System.out.println("Enter its price:");
        item.append(" $").append(sc.nextLine());

        items.add(item.toString());
        System.out.println("Purchase was added!");
    }

    public static void showList() {
        if (items.isEmpty()) {
            System.out.println("The purchase list is empty");
            return;
        }

        for (String item : items) {
            System.out.println(item);
        }

        System.out.println("Total sum: $" + getTotalExpenses());
    }

    private static float getTotalExpenses() {
        expenses = 0;
        for (String item : items) {
            expenses += Float.parseFloat(item.substring(item.lastIndexOf("$") + 1));
        }

        return expenses;
    }

    public static void displayBalance() {
        System.out.println("Balance: $" + balance);
    }

    public static void exit() {
        System.exit(0);
    }
}
