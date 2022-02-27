package com.zipcodewilmington.scientificcalculator;

public class Trigonometry {

    public static double sine(double angle) {
        if (TrigUnits.radians) {
            return Math.sin(angle);
        } else {
            return Math.sin(Math.toRadians(angle));
        }
    }
    // Takes radian x and returns cos(x)
    public static double cosine(double angle) {
        if (TrigUnits.radians) {
            return Math.cos(angle);
        } else {
            return Math.cos(Math.toRadians(angle));
        }    }
    // Takes radian x and returns tan(x)
    public static double tangent(double angle) {
        if (TrigUnits.radians) {
            return Math.tan(angle);
        } else {
            return Math.tan(Math.toRadians(angle));
        }    }

    // Takes params opp and hyp and divides
    // to get ratio and returns inverse sin
    public static double invSine(double opp, double hyp) {
        double sinRatio = opp/hyp;
        return Math.asin(sinRatio);
    }
    // Takes params adj and hyp and divides
    // to get ratio and returns inverse cos
    public static double invCosine(double adj, double hyp) {
        double cosRatio = adj/hyp;
        return Math.acos(cosRatio);
    }
    // Takes params opp and adj and divides
    // to get ratio and returns inverse tan
    public static double invTangent(double opp, double adj) {
        double tanRatio = opp/adj;
        return Math.atan(tanRatio);
    }
}
