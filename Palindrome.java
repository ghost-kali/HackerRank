import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        String rev = "";

        // Initializing a new boolean variable for the
        // answer
        boolean ans = false;
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        // Checking if both the strings are equal
        if (str.equals(rev)) {
            ans = true;
            System.out.println("Yes");
        }

        else{
            System.out.println("No");
        }
    }

}
