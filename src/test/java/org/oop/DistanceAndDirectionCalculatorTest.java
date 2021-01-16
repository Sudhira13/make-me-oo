package org.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class DistanceAndDirectionCalculatorTest {

    @Test
    void twoPointsWithSameXAndYCoordinatesShouldHaveADistanceOfZero() {
        DistanceAndDirectionCalculator origin = new DistanceAndDirectionCalculator(0, 0);

        double distance = origin.distance(origin);

        Assertions.assertEquals(0, distance);
    }

    @Test
    void distanceBetweenOriginAndPointsOnUnitCircleShouldBeOne() {
        DistanceAndDirectionCalculator origin = new DistanceAndDirectionCalculator(0, 0);
        DistanceAndDirectionCalculator point1 = new DistanceAndDirectionCalculator(1, 0);
        DistanceAndDirectionCalculator point2 = new DistanceAndDirectionCalculator(0, 1);
        
       double distance1 = origin.distance(point1);
       double distance2 = origin.distance(point2);

       Assertions.assertEquals(1, distance1);
       Assertions.assertEquals(1, distance2);
    }

    @Test
    void distanceBetweenTwoOppositePointsOnUnitCircleShouldBeTwo() {
        DistanceAndDirectionCalculator point1 = new DistanceAndDirectionCalculator(1, 0);
        DistanceAndDirectionCalculator point2 = new DistanceAndDirectionCalculator(-1, 0);

        double distance = point1.distance(point2);

        Assertions.assertEquals(2, distance);
    }

    @Test
    void originAndPointOnPostiveXAxisShouldBeZeroRadiansAway() {
        DistanceAndDirectionCalculator origin = new DistanceAndDirectionCalculator(0, 0);
        DistanceAndDirectionCalculator point1 = new DistanceAndDirectionCalculator(1, 0);
        DistanceAndDirectionCalculator point2 = new DistanceAndDirectionCalculator(3, 0);

        double direction1 = origin.direction(point1);
        double direction2 = origin.direction(point2);

        Assertions.assertEquals(0, direction1);
        Assertions.assertEquals(0, direction2);
    }

    @Test
    void originAndPointOnNegativeXAxisShouldBePiRadiansAway() {
        DistanceAndDirectionCalculator origin = new DistanceAndDirectionCalculator(0, 0);
        DistanceAndDirectionCalculator point1 = new DistanceAndDirectionCalculator(-1, 0);
        DistanceAndDirectionCalculator point2 = new DistanceAndDirectionCalculator(-3, 0);

        double direction1 = origin.direction(point1);
        double direction2 = origin.direction(point2);

        Assertions.assertEquals(Math.PI, direction1);
        Assertions.assertEquals(Math.PI, direction2);
    }

    @Test
    void originAndPointOnYAxisShouldBeHalfPiRadiansAway() {
        DistanceAndDirectionCalculator origin = new DistanceAndDirectionCalculator(0, 0);
        DistanceAndDirectionCalculator point1 = new DistanceAndDirectionCalculator(0, 1);
        DistanceAndDirectionCalculator point2 = new DistanceAndDirectionCalculator(0, 3);

        double direction1 = origin.direction(point1);
        double direction2 = origin.direction(point2);

        Assertions.assertEquals(Math.PI / 2, direction1);
        Assertions.assertEquals(Math.PI / 2, direction2);
    }
}
