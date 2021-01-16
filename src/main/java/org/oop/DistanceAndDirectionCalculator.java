package org.oop;

public class DistanceAndDirectionCalculator {
    private final double x;
    private final double y;

    public DistanceAndDirectionCalculator(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(DistanceAndDirectionCalculator pointTo){
        DistanceAndDirectionCalculator pointFrom = this;
        double xDistance = pointFrom.x - pointTo.x;
        double yDistance = pointFrom.y - pointTo.y;
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    public double direction(DistanceAndDirectionCalculator pointTo){
        DistanceAndDirectionCalculator pointFrom = this;
        double xDistance = pointTo.x - pointFrom.x;
        double yDistance = pointTo.y - pointFrom.y;
        return Math.atan2(yDistance, xDistance);
    }
}
