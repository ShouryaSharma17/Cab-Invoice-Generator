package com.invoice;

public class CabOperations {
    private static final double FARE_PER_KM = 10;
    private static final double FARE_PER_MINUTE = 1;
    private static final double MINIMUM_FARE = 5;
    private Object CabRide;

    public double calculateCostOfRide(double totalRidingDistance, double totalRidingTimeInHours){
        double totalRidingTimeInMin = totalRidingTimeInHours * 60;
        double totalFare = totalRidingDistance * FARE_PER_KM + totalRidingTimeInMin * FARE_PER_MINUTE;

        return Math.max(totalFare, MINIMUM_FARE);
    }

    public double calculateMultipleRideCost(CabRide[] multipleRides){
        double totalRideCost = 0;
        for (CabRide ride :multipleRides) {
            totalRideCost += calculateCostOfRide(ride.RideDistance,ride.timeInMin);
        }
        return totalRideCost;
    }
}
