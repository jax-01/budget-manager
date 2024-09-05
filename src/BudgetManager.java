package src;

import java.util.ArrayList;
import java.util.Scanner;

public class BudgetManager {
    private static float balance = 0;
    private static ArrayList<String> items = new ArrayList<String>();

    public static void main(String[] args) {
        displayMenu();
//        Scanner sc = new Scanner(System.in);
//        StringBuilder list =  new StringBuilder();
//        float total = 0f;
//
//        while (sc.hasNextLine()) {
//            list.append(sc.nextLine()).append("\n");
//        }
//
//        String[] listArray = list.toString().split("\n");
//
//        for (int i = 0; i < listArray.length; i++) {
//            total = total + Float.parseFloat(listArray[i].substring(listArray[i].lastIndexOf("$") + 1));
//        }
//
//        System.out.println(list);
//        System.out.printf("Total: $%.2f", total);
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

    }

    public static void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}
