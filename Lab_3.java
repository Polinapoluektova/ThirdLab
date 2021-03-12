package com.company;
import java.util.Scanner;

public class Lab_3 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter n (amount people): ");
        int n = num.nextInt();
        System.out.println("Enter t (time, min): ");
        int t = num.nextInt();
        int[] Array = new int[n];
        for (int s=1; s < Array.length + 1; ++s) {
            int Ci = t*s;
            System.out.println(s + "-th person in the queue will pass it for " + Ci);
        }
    }
}