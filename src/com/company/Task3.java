package com.company;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char plus='+';
        char minus='-';
        char multiply='*';
        char divide='/';
        char c = sc.next().charAt(0);
        int b = sc.nextInt();
        if (c==plus)
            System.out.print(a+b);
        if (c==minus)
            System.out.print(a-b);
        if (c==multiply)
            System.out.print(a*b);
        if (c==divide)
            System.out.print(a/b);

    }
}
