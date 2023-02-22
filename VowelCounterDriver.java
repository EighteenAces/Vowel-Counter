
/**********************************************************************************
 * Java Course 2 Module 3
 * 
 * Counting the total numbers of vowels, the uppercase vowels, and lowercase
 * vowels
 * 
 * @author: Jellie Mae Ortiz
 *          Date Created: May 20, 2022
 **********************************************************************************/

import java.util.Scanner;

public class VowelCounterDriver {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        String str = "";

        VowelCounter vow = new VowelCounter();

        try {

            System.out.println("Enter a line of characters (press enter by itself to quit): ");
            str = stdIn.nextLine();

            while (stdIn.hasNextLine()) { // checks if there's still next line & executes the processLine and
                                          // printSummary methods

                String newStr = stdIn.nextLine(); // declare new variable for another line
                str = str + newStr; // concatenate the previous string variable to the new line variable

                vow.processLine(str);
                vow.printSummary();

            }
        } 
        
        catch (Exception e) {

            System.out.println("Something went wrong! Please try again! ");
        }

        stdIn.close();

    }
}
