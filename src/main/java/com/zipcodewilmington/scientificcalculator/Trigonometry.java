package com.zipcodewilmington.scientificcalculator;

public class Trigonometry {
    /**
     * @param angle --> If TrigUnits is set to radians then angle is presumed to be in radians
     *              if TrigUnits is set to degrees (else statement) it first converts to radians.
     * @return -> returns sine of angle in radians.
     */
    public static double sine(double angle) {
        if (TrigUnits.radians) {
            return Math.sin(angle);
        } else {
            return Math.sin(Math.toRadians(angle));
        }
    }

    /**
     * @param angle --> If TrigUnits is set to radians then angle is presumed to be in radians
     *              if TrigUnits is set to degrees (else statement) it first converts to radians.
     * @return -> returns cosine of angle in radians.
     */
    public static double cosine(double angle) {
        if (TrigUnits.radians) {
            return Math.cos(angle);
        } else {
            return Math.cos(Math.toRadians(angle));
        }    }

    /**
     * @param angle --> If TrigUnits is set to radians then angle is presumed to be in radians
     *              if TrigUnits is set to degrees (else statement) it first converts to radians.
     * @return -> returns tangent of angle in radians.
     */
    public static double tangent(double angle) {
        if (TrigUnits.radians) {
            return Math.tan(angle);
        } else {
            return Math.tan(Math.toRadians(angle));
        }    }

    /**
     * @param opp --> opposite side of angle
     * @param hyp -->  hypotenuse of triangle
     *
     * @return  -> returns inverse sine as double.
     */
    public static double invSine(double opp, double hyp) {
        double sinRatio = opp/hyp;
        return Math.asin(sinRatio);
    }


    /**
     * @param adj --> adjacent side of angle
     * @param hyp -->  hypotenuse of triangle
     *
     * @return  -> returns inverse cosine as double.
     */
    public static double invCosine(double adj, double hyp) {
        double cosRatio = adj/hyp;
        return Math.acos(cosRatio);
    }

    /**
     * @param opp --> opposite side of angle
     * @param adj -->  adjacent of triangle
     *
     * @return  -> returns inverse tangent as double.
     */
    public static double invTangent(double opp, double adj) {
        double tanRatio = opp/adj;
        return Math.atan(tanRatio);
    }
}
