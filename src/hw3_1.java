import java.util.Scanner;

public class hw3_1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // read input
        String input = in.nextLine();

        // eliminate all non-alphanumeric characters
        input = input.replaceAll("[^a-zA-Z0-9]", "");

        // change all letters to same case
        input = input.toLowerCase();

        // check palindrome with recursive function
        if (checkPalindrome(input)) {
            System.out.println("TRUE");
        }
        else {
            System.out.println("FALSE");
        };

        in.close();
    }

    static boolean checkPalindrome(String str) {

        // if length is 0 or 1 then true
        if (str.length() == 0 || str.length() == 1) {
            return true;
        }

        // If first and last characters match, recursively do the next pair
        if(str.charAt(0) == str.charAt(str.length()-1)) {
            return checkPalindrome(str.substring(1, str.length()-1));
        }

        // otherwise no good
        return false;
    }
}
