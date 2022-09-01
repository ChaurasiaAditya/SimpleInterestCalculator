/*
 * Author Name: Aditya Chaurasia
 * Date: 01-09-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.aditya;

import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        // initialize the Scanner
        Scanner scanner = new Scanner(System.in);

        // prompt the user to enter the principal amount
        System.out.println("Please enter the principle amount in rupees: ₹");
        // store the principal amount in a variable
        float principleAmount = scanner.nextFloat();

        // prompt the user to enter the rate of interest
        System.out.println("Please enter the rate of interest: ");
        // store the rate of interest in a variable
        float rateOfInterest = scanner.nextFloat();

        // prompt the user to enter the time period
        System.out.println("Please enter the time period in years: ");
        // store the time period in a variable
        float timePeriod = scanner.nextFloat();

        // call the calculateSimpleInterest method and store the result in a variable
        SimpleInterestCalculator simpleInterestCalculator = new SimpleInterestCalculator();
        float simpleInterest = simpleInterestCalculator.calculateSimpleInterest(principleAmount, rateOfInterest, timePeriod);

        // print the result
        System.out.println("The calculated simple interest is ₹ " + simpleInterest);

        // close the scanner
        scanner.close();
    }

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

