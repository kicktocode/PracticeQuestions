package com.example.conceptTryOut.Interface;

public class MethodWithFunctionalParam {

    private static InterestCalculator simpleInterestCalculator = (p, r, t) -> {
        return (p*r*t)/100;
    };

    private static InterestCalculator compoundInterestCalculator = (p, r, t) -> {
      return Math.pow(p*(1+(r/100)), t);
    };

    public static void main(String[] args) {
        computeInterestForNextXYears(100.0, 10.0, 1.0, 4, simpleInterestCalculator);
        computeInterestForNextXYears(100.0, 10.0, 1.0, 4, new SimpleInterestCalculator());
        computeInterestForNextXYears(100.0, 10.0, 1.0, 4, compoundInterestCalculator);
    }

    static double computeInterestForNextXYears(double principalAmount, double rateOfInterest, double time,
                             int nY,
                             InterestCalculator interestFunction) {
        double amount = principalAmount;
        for (int i = 0; i < nY; i++) {
            amount = amount + interestFunction.calculate(amount, rateOfInterest, time);
            System.out.println("Final amount at " + (i+1) + " year = " + amount);
        }
        return amount;
    }
}


@FunctionalInterface
interface InterestCalculator {

    double calculate(double principalAmount, double rateOfInterest, double time);
}

class SimpleInterestCalculator implements InterestCalculator {

    @Override
    public double calculate(double principalAmount, double rateOfInterest, double time) {
        return (principalAmount * rateOfInterest * time) / 100;
    }
}

