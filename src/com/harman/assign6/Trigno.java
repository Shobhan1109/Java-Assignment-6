package com.harman.assign6;


import java.util.Scanner;

class tri extends Thread{
    int a;

    public tri(int a) {
        this.a = a;
    }

    @Override
    public void run() {
        try {
            System.out.println("COSINE value of "+a+": "+Math.cos(a));
            System.out.println("TAN value of "+a+": "+Math.tan(a));
            System.out.println("SIN value of "+a+": "+Math.sin(a));
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
public class Trigno {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value:");
        int a = s.nextInt();
        tri t=new tri(a);
        t.start();
    }
}
