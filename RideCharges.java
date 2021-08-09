package com.CabInvoiceGenerator;


public class RideCharges {
    public int MinimumCostPerKM = 10;
    public int CoastPerMinute = 1;
    public int MinimumFare = 5;
    public int PremiumMinimumCostPerKM = 15;
    public int PremiumCoastPerMinute = 2;
    public int PremiumMinimumFare = 20;
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


