package javabase.lab1;

import java.util.Scanner;

public class PensionContributionCalculator {
    public static final int SALARY_CEILING = 6000;
    public static final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
    public static final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
    public static final double EMPLOYEE_RATE_55_TO_60 = 0.13;
    public static final double EMPLOYER_RATE_55_TO_60 = 0.13;
    public static final double EMPLOYEE_RATE_60_TO_65 = 0.075;
    public static final double EMPLOYER_RATE_60_TO_65 = 0.09;
    public static final double EMPLOYEE_RATE_65_ABOVE = 0.05;
    public static final double EMPLOYER_RATE_65_ABOVE = 0.05;

    public static double calcEmployeeContribution(int contributableSalary, int age){
        double contribution ;
        if (age <= 55) {
            contribution = contributableSalary * EMPLOYEE_RATE_55_AND_BELOW;
        } else if (age <= 60) {
            contribution = contributableSalary * EMPLOYEE_RATE_55_TO_60;
        } else if (age <= 65) {
            contribution = contributableSalary * EMPLOYEE_RATE_60_TO_65;
        } else {
            contribution = contributableSalary * EMPLOYEE_RATE_65_ABOVE;
        }
        return contribution;
    }

    public static double calcEmployerContribution(int contributableSalary, int age){
        double contribution;
        if (age <= 55) {
            contribution = contributableSalary * EMPLOYER_RATE_55_AND_BELOW;
        } else if (age <= 60) {
            contribution = contributableSalary * EMPLOYER_RATE_55_TO_60;
        } else if (age <= 65) {
            contribution = contributableSalary * EMPLOYER_RATE_60_TO_65;
        } else {
            contribution = contributableSalary * EMPLOYER_RATE_65_ABOVE;
        }
        return contribution;
    }

    public static double calcTotalContribution(int contributableSalary, int age){
        return calcEmployeeContribution(contributableSalary, age) + calcEmployerContribution(contributableSalary,age);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int monthSalary = sc.nextInt();
        int age = sc.nextInt();

        int contributableSalary;

        if (monthSalary > SALARY_CEILING) {
            contributableSalary = 6000;
        } else {
            contributableSalary = monthSalary;
        }

        System.out.printf("The employee's contribution is: %.2f$%n",calcEmployeeContribution(contributableSalary, age));
        System.out.printf("The employee's contribution is:%.2f$%n",calcEmployerContribution(contributableSalary, age));
        System.out.printf("The total contribution: %.2f$%n",calcTotalContribution(contributableSalary, age));
    }
}
