package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.printf("Plz Enter 1st Number:-");
        int a = input.nextInt();
        System.out.printf("plz Enter 2nd Number:-");
        int b = input.nextInt();
        int sum = a+b;
        System.out.println("SUM:-"+sum);
    }
}
