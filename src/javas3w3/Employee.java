package javas3w3;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author User1
 */
public abstract class Employee {
    
    private String firstName,lastName, socialInsuranceNum, position;
    private LocalDate dateOfBirth, startDate, endDate;
    private boolean administrator;

    public Employee(String firstName, String lastName,String socialInsuranceNum, LocalDate dateOfBirth) {
        //checks validation of firstName/lastName before setting it
        setFirstName(firstName);
        setLastName(lastName);
        this.dateOfBirth = dateOfBirth;
        this.socialInsuranceNum = socialInsuranceNum; 
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        
        if (firstName.matches("[A-Z][a-zA-Z]*"))
        
        this.firstName = firstName;
        else
            throw new IllegalArgumentException("First name must start with an upper  "+ "Case letter and only contain letterr");
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
       if (lastName.matches("[A-Z][a-zA-z]*[-//s]?[[A-Z][a-zA-Z]*]?"))
        this.lastName = lastName;
             else
            throw new IllegalArgumentException("First name must start with an upper  "+ "Case letter and only contain letterr");
    }

    public String getSocialInsuranceNum() {
        return socialInsuranceNum;
    }

    public void setSocialInsuranceNum(String socialInsuranceNum) {
        if(socialInsuranceNum.matches("\\d{3}\\s\\d{3}\\s\\d{3}"))
         this.socialInsuranceNum = socialInsuranceNum;         
        else
            throw new IllegalArgumentException("Social Insurance blahblha");
     
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        
        int age = Period.between(LocalDate.now(), dateOfBirth).getYears();
        if (age <= 100 && age >= 10)
        this.dateOfBirth = dateOfBirth;
            else
            throw new IllegalArgumentException("Employees can not be more then 100 years");
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        if (startDate.isAfter(LocalDate.now()) || startDate.isEqual(LocalDate.now()))
            this.startDate = startDate;
        else
            throw new IllegalArgumentException("Must be less then");
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public boolean isAdministrator() {
        return administrator;
    }

    public void setAdministrator(boolean administrator) {
        this.administrator = administrator;
    }
    
    public abstract double calculatePay();
    
}//end of employee 
