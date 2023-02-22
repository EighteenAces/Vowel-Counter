/**********************************************************************************
 * Java Course 2 Module 3
 * 
 * Counting the total numbers of vowels, the uppercase vowels, and lowercase
 * vowels
 * 
 * @author: Jellie Mae Ortiz
 *          Date Created: May 20, 2022
 **********************************************************************************/

public class VowelCounter {

    int vowelCount = 0; // initialize vowel counter
    int[][] vowelArray = new int[5][2]; // declare 2D array

    public void processLine(String str) {

        for (int i = 0; i < str.length(); i++) { // checks if the input data/string is still not equal to its length

            // checks for the lower case and uppercase vowels
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' ||
                    str.charAt(i) == 'i' || str.charAt(i) == 'o' ||
                    str.charAt(i) == 'u' || str.charAt(i) == 'A' ||
                    str.charAt(i) == 'E' || str.charAt(i) == 'I' ||
                    str.charAt(i) == 'O' || str.charAt(i) == 'U') {
                vowelCount++;

                switch (str.charAt(i)) { // stores the vowel count of the upper case & lower case vowels to the array
                    case 'a':
                        vowelArray[0][0]++;
                        break;
                    case 'A':
                        vowelArray[0][1]++;
                        break;
                    case 'e':
                        vowelArray[1][0]++;
                        break;
                    case 'E':
                        vowelArray[1][1]++;
                        break;
                    case 'i':
                        vowelArray[2][0]++;
                        break;
                    case 'I':
                        vowelArray[2][1]++;
                        break;
                    case 'o':
                        vowelArray[3][0]++;
                        break;
                    case 'O':
                        vowelArray[3][1]++;
                        break;
                    case 'u':
                        vowelArray[4][0]++;
                        break;
                    case 'U':
                        vowelArray[4][1]++;
                        break;
                }
            }
        }

    }

    public void printSummary() { // displays the result

        try {
            
            String[] str = { "A", "E", "I", "O", "U" }; // initialize 1D array for the string/label

            for (int i = 0; i < str.length; i++) { // iterates to the number of vowel labels

                System.out.println(str[i] + ": " + vowelArray[i][0] + " lowercase, " + vowelArray[i][1] +
                        " uppercase, " + (vowelArray[i][0] + vowelArray[i][1] + " total"));
            }

            System.exit(0);

        } catch (Exception e) {

            System.out.println("Something's wrong! Please try again!");
            System.exit(0);

        }
    }
}
