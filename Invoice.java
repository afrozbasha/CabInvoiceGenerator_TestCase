package com.CabInvoiceGenerator;

public class Invoice {
    public String uderId;
    public double totalFare;
    public float avg;
    public int noOfRides;

    public Invoice(String uderId, double totalFare, float avg, int noOfRides) {
        this.uderId = uderId;
        this.totalFare = totalFare;
        this.avg = avg;
        this.noOfRides = noOfRides;
    }

}
