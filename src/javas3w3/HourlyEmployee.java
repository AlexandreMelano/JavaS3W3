package javas3w3;

import java.time.LocalDate;

/**
 *
 * @author User1
 */
public class HourlyEmployee extends Employee{

    private double payRate, hoursWorked;
    private static final double MINIMUM_WAGE = 11.40;
    
    public HourlyEmployee(String firstName, String lastName, String socialInsuranceNum, LocalDate dateOfBirth) {
        super(firstName, lastName, socialInsuranceNum, dateOfBirth);
    }

    public HourlyEmployee(double payRate, String firstName, String lastName, String socialInsuranceNum, LocalDate dateOfBirth) {
        super(firstName, lastName, socialInsuranceNum, dateOfBirth);
        setPayRate(payRate);
        this.payRate = payRate;
    }

    public void setPayRate(double payRate) {
        if (payRate >= MINIMUM_WAGE)
         this.payRate = payRate;
        else   
            throw new IllegalArgumentException("The miminum rate is " + MINIMUM_WAGE);
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public static double getMINIMUM_WAGE() {
        return MINIMUM_WAGE;
    }

    public void setHoursWorked(double hoursWorked) {
       if (hoursWorked <= 24)
        this.hoursWorked = hoursWorked;
       else throw new IllegalArgumentException("Fart");
    }

    @Override
    public double calculatePay() {
 
        return payRate * hoursWorked;
    }
    
}//end of class
