package com.company;
public class Task2 {
    public static void main(String[] args) {
        for(int i=2;i<1000;i++){
            int sum=0;
            for(int j=2;j<i-1;j++) {
                if (i % j == 0) {
                    sum++;
                }
            }
            if (sum == 0) {
                System.out.print(i);
                System.out.print(' ');
                }
            }
        }
        

    }

