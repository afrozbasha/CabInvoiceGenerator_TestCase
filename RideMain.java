package com.CabInvoiceGenerator;

import java.util.ArrayList;
import java.util.Scanner;

public class RideMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Ride> cab = new ArrayList<>();
        System.out.println("Enter how many ride's want to travel");
        int n = sc.nextInt();
        int temp = n;
        while (temp!=0) {
            System.out.println("Enter the how much distance to travel: ");
            double distance = sc.nextDouble();
            System.out.println("Enter the how much time to travel: ");
            int time = sc.nextInt();
            Ride userCab = new Ride(distance, time);
            cab.add(userCab);
            temp--;
        }
        double totalFare = 0;
        for (Ride r: cab){
            totalFare +=  (r.distance * r.MinimumCostPerKM) + (r.time * r.CoastPerMinute);
        }

        System.out.println("The total Fare "+totalFare+" for "+n+ " no.of ride's");
    }
}
