package src;

import java.util.Scanner;

public class BudgetManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder list =  new StringBuilder();
        float total = 0f;

        while (sc.hasNextLine()) {
            list.append(sc.nextLine()).append("\n");
        }

        String[] listArray = list.toString().split("\n");

        System.out.println(list);
    }
}
