package javas3w3;

import java.util.Scanner;

/**
 *
 * @author User1
 */
public class NewClass {
    
     public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        System.out.print("Please enter your Name ");
        
        String userInput = keyboard.nextLine();
        
        System.out.printf("Hello %s", checkName(userInput));
     }//end of main
     
     
     public static boolean checkName(String name)
     {
             return name.matches("[A-Z][a-zA-Z]*");
        
            
                     
                     
    
    
     }//end of checkName        
}//end of newlass
