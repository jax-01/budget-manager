package src;

import java.util.Scanner;

public class BudgetManager {
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
}
