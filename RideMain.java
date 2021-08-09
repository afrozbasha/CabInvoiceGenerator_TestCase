package com.CabInvoiceGenerator;

import java.util.Scanner;

public class RideMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The Cab Service");
        System.out.println("Enter the how much distance to travel: ");
        double d = sc.nextDouble();
        System.out.println("Enter the how much time to travel: ");
        int t = sc.nextInt();

        Ride user = new Ride(d, t);

        double a = user.CalculateFare();
        System.out.println("Total Cab fare is : Rs:"+a);
    }
}
