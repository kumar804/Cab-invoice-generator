package com.manish;

public class CabService {
    private static final int COST_PER_TIME = 1;
    private static final double MINIMUM_COST_PER_KILOMETER = 10;
    private static final double MINIMUM_FARE = 5;
    private final RideRepository rideRepository;

    public CabService() {
        this.rideRepository = new RideRepository();
    }
/*
created a method to calcolate minimum cost
*of cab ride according to cost and distance of ride in km
 */
    public double calculateFare(double distance, int time) {
        double totalFare = (distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME);
        return Math.max(totalFare, MINIMUM_FARE);
    }

    public InvoiceSummary calculateFare(Ride[] rides) {
        double totalFare = 0;
        for (Ride ride : rides) {
            totalFare += ride.cabRide.calculateCostOfCabRide(ride);
        }
        return new InvoiceSummary(rides.length, totalFare);
    }

    public InvoiceSummary getInvoiceSummary(String userId) {
        return this.calculateFare(rideRepository.getRides(userId));
    }

    public void addRides(String userId, Ride[] rides) {
        rideRepository.addRides(userId, rides);
    }
}
