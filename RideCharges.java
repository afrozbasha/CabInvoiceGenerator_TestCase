package com.CabInvoiceGenerator;

public class RideCharges {
    public int MinimumCostPerKM = 10;
    public int CoastPerMinute = 1;
    public int MinimumFare = 5;
}

class Ride extends RideCharges {
    public double distance;
    public int time;
    public String userId;
    public Ride(double distance, int time, String userId) {
        this.distance = distance;
        this.time = time;
        this.userId = userId;
    }
    public  Ride(){};
}


