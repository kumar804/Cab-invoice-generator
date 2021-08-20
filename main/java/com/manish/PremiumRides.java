package com.manish;

public enum PremiumRides {
    //created enum for different ride according to cost depend on the ride chose by customer
    NORMAL(10.0, 1.0, 5.0),
    PREMIUM(15.0, 2.0, 20.0);

    private final double costPerKm;
    private final double costPerMin;
    private final double minFarePerRide;
/*
constructor having costperkm and cost permin and minimum fare
to calulate cost of perimium ride
 */
    PremiumRides(double costPerKm, double costPerMin, double minFarePerRide) {
        this.costPerKm = costPerKm;
        this.costPerMin = costPerMin;
        this.minFarePerRide = minFarePerRide;
    }
    /*
    created a mrthod to calculate the
    cost of cab ride
     */
    public double calculateCostOfCabRide(Ride ride) {
        double rideCost = ride.distance * costPerKm + ride.time * costPerMin;
        return Math.max(rideCost, minFarePerRide);
    }
}
