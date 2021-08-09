package com.CabInvoiceGenerator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RideMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ride userCab = new Ride();

        ArrayList<Ride> cab = new ArrayList<>();
        System.out.println("Enter how many ride's want to travel");
        int n = sc.nextInt();
        String userId = "";
        int temp = n;
        while (temp!=0) {
            System.out.println("Enter user Id : ");
            userId = sc.next();
            System.out.println("Enter the how much distance to travel: ");
            double distance = sc.nextDouble();
            System.out.println("Enter the how much time to travel: ");
            int time = sc.nextInt();
            userCab = new Ride(distance, time, userId);
            cab.add(userCab);
            temp--;
        }

        System.out.println("Enter which service want to use 1:Normal 2:Premium 3:exit");
        int opt = sc.nextInt();
        boolean con = true;
        double totalFare = 0;
        float avg = 1;
        double v = 0;
        ArrayList<Invoice> invoices = new ArrayList<Invoice>();
        while (con){
            switch (opt){
                case 1:
                    for (Ride r: cab){
                        v += (r.distance * r.MinimumCostPerKM) + (r.time * r.CoastPerMinute);
                        totalFare += Math.max(userCab.MinimumCostPerKM, v);
                        avg = (float) totalFare / n;
                        invoices.add(new Invoice(r.userId , totalFare, avg, n));
                    }
                    con = false;
                    break;
                case 2:
                    for (Ride r: cab){
                        v += (r.distance * r.PremiumMinimumCostPerKM) + (r.time * r.PremiumCoastPerMinute);
                        totalFare += Math.max(userCab.MinimumCostPerKM, v);
                        avg = (float) totalFare / n;
                        invoices.add(new Invoice(r.userId , totalFare, avg, n));
                    }
                    con = false;
                    break;
                case 3:
                    con = false;

            }
        }

        Iterator<Invoice> invoiceIterator = invoices.iterator();
        while (invoiceIterator.hasNext()){
            Invoice s = invoiceIterator.next();

            System.out.println("User Is is : "+s.uderId);
            System.out.println("The total Fare is :"+s.totalFare);
            System.out.println("No.of ride's is : "+s.noOfRides);
            System.out.println("Average fare for each ride is : "+s.avg);

        }
    }
}
