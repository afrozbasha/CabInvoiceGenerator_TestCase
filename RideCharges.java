package com.CabInvoiceGenerator;

public class RideCharges {
    public static int MinimumCostPerKM = 10;
    public static int CoastPerMinute = 1;
    public static int MinimumFare = 5;
}

class Ride extends RideCharges {
    public double distance;
    public int time;

    public Ride(double distance, int time) {
        this.distance = distance;
        this.time = time;
    }

    public double CalculateFare() {
        double totalFare = (distance * MinimumCostPerKM) + (time * CoastPerMinute);
        return Math.max(MinimumFare, totalFare);
    }

}

