package com.manish;

public class Ride {
    public double distance;
    public int time;
    public PremiumRides cabRide;
/*
crating constructor having field distance time and cab ride in it
 */
    public Ride(double distance, int time, PremiumRides cabride) {
        this.distance = distance;
        this.time = time;
        this.cabRide = cabride;
    }
}
