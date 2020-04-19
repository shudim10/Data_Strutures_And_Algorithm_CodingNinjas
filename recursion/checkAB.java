/*Suppose you have a string made up of only 'a' and 'b'. Write a recursive function that checks if the string was generated using the following rules:
a. The string begins with an 'a'
b. Each 'a' is followed by nothing or an 'a' or "bb"
c. Each "bb" is followed by nothing or an 'a'
If all the rules are followed by the given string, return true otherwise return false.*/

public class Solution {

    public static boolean checkAB(String input) {
        // Write your code here
        boolean smallAnswer = false;
        if (input.length() == 0) {
            return true;
        }
        if (input.length() == 1) {
            if (input.charAt(0) == 'a') {
                smallAnswer = true;
                input = input.substring(1);
            }
        } else if (input.length() == 2) {
            if (input.charAt(0) == 'a' && input.charAt(1) == 'a') {
                smallAnswer = true;
                input = input.substring(2);
            }
        } else if (input.length() >= 3) {
            if (input.charAt(0) == 'a' && input.substring(1, 3).equals("bb")) {
                smallAnswer = true;
                input = input.substring(3);
            } else if (input.charAt(0) == 'a' && input.charAt(1) == 'a') {
                smallAnswer = true;
                input = input.substring(1);
            }
        }
        return smallAnswer && checkAB(input);
} 
    
    
}
