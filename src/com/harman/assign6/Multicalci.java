package com.harman.assign6;

import java.util.Scanner;

class Calculator extends Thread{
    int a,b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        System.out.println("Sum:"+(a+b));
        System.out.println("Difference:"+(a-b));
        System.out.println("Product:"+(a*b));
        System.out.println("Ratio:"+(a/b));
    }
}

class Multicalci {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first value:");
        int a = s.nextInt();
        System.out.println("Enter the Second value:");
        int b = s.nextInt();
        Calculator c=new Calculator(a,b);
        c.start();
    }
}