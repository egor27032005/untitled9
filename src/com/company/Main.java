package com.company;

import java.util.Scanner;

public class Main {

    static double power3(int n) {
        int sum=0;
        while (n>0){
            sum=sum+n;
            n-=1;
        }
        return sum;
    }

    static double factorial(int n) {
        int faktor=1;
        while (n>0){
            faktor=faktor*n;
            n-=1;
        }
        return faktor;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.printf("%.0f", power3(n));
        System.out.println("");
        System.out.printf("%.0f", factorial(n));
    }
}