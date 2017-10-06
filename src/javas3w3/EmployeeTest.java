package javas3w3;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author User1
 */
public class EmployeeTest {
    
    public static void main(String args)
    {
      Employee emp1 = new Employee("Joe", "Smith", "978 345 348", LocalDate.of(1956, Month.MARCH, 14)) {
          @Override
          public double calculatePay() {
              throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          }
      };
      Employee emp2 = new Employee("Bob", "futherthere", "978 345 348", LocalDate.of(1956, Month.MARCH, 14)) {
          @Override
          public double calculatePay() {
              throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          }
      };
    }
    
}//end of EmployeeTest
