package Trash;

import java.util.Scanner;

public class CheckPrinterImproved {

    private static int findMaxLength(String[] elements) {
        int max = 0;
        for (String e : elements) {
            if (e.length() > max) {
                max = e.length();
            }
        }
        return max;
    }

    public static void printCheck(String[] items) {
        String[][] values = new String[3][items.length];
        for (int i = 0; i < items.length; i++){
            values[0][i] = items[i].split(",")[0];
            values[1][i] = items[i].split(",")[1];
            values[2][i] = items[i].split(",")[2];
        }
        int name = findMaxLength(values[0]);
        int count = findMaxLength(values[1]);
        int cost = findMaxLength(values[2]);

        for (String item : items){
            String[] values2 = item.split(",");
            String nameS = values2[0];
            for (int i = nameS.length(); i < name; i++) nameS+=" ";
            String countS = values2[1];
            for (int i = countS.length(); i < count; i++) countS+=" ";
            String costS = values2[2];
            for (int i = costS.length(); i < cost; i++) costS+=" ";
            System.out.printf("%s  %s  %s\n", nameS, countS, costS);
        }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество записей:");
        int n = Integer.parseInt(scanner.nextLine());
        String[] values = new String[n];
        for (int i=0; i<n; ++i)
            values[i] = scanner.nextLine();
        printCheck(values);
    }
}