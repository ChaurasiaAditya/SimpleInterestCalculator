/*
 * Author Name: Aditya Chaurasia
 * Date: 01-09-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.aditya;

import java.util.Scanner;

public class SimpleInterestCalculator {

    /**
     * This method calculates the simple interest based on the following formula.
     *
     * @param principleAmount   the principal amount in rupees (₹).
     * @param interestRate      the interest rate.
     * @param timePeriodInYears the time period for the loan.
     * @return the calculated simple interest.
     */
    public float calculateSimpleInterest(float principleAmount, float interestRate, float timePeriodInYears) {
        return (principleAmount * interestRate * timePeriodInYears / 100);
    }
}

