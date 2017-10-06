package javas3w3;

import java.util.Scanner;

/**
 *
 * @author User1
 */
public class JavaS3W3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //this will iniate scanner and ask for area code
        System.out.print("Please enter your area code or phone number ");
        Scanner keyboard = new Scanner (System.in);
        String userInput = keyboard.nextLine();
        
        //that valid : n valid equates to an if statement, if tru valid else n valid
        System.out.printf("That is a%s code%n", checkAreaCode(userInput)? "valid" : "n invalid");
        
        System.out.printf("That is a%s phone number%n", checkPhoneNumber(userInput)? "valid" : "n invalid");
    }//end of main
    
    public static boolean checkAreaCode(String areaCode)
    {//first number can be 2-9, then anynumber 2 times
        return areaCode.matches("[2-9]\\d[2]");
    }//end of checkAreaCode
    
    public static boolean checkPhoneNumber(String phoneNum)
    {   // this gets validates the full phone number with area code, 
        //s? allows for an optional space
        
        return phoneNum.matches("\\(?[2-9]\\d{2}//?)[-.\\s]?[2-9]\\d{2}[-.\\s]?\\d{4}");
    }//end of checkPhoneNumber
}//end of class
