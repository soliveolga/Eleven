package com.el.idea;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Первое число ");
        String first = input.nextLine();
        System.out.println("Второе число ");
        int second = input.nextInt();
        Integer f1 = new Integer(first);

        System.out.println("Большее число");
        if (f1 > second) {
            System.out.println(f1);
        }
            else {
            System.out.println(second);
        }

        double f2 = f1;
        double s2 = second;

        System.out.println("Меньшее число");
        if (f2 > s2) {
            System.out.println(s2);
        }
        else {
            System.out.println(f2);
        }
    }
}
