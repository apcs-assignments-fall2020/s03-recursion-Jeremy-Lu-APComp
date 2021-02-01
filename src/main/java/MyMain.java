public class MyMain {
    // This method adds up the values of all digits
    // in x, recursively
    public static int addDigits(int x) { 
        // YOUR CODE HERE
        return -1;
    }


    // This method checks if a String is a palindrome
    // (e.g. "racecar", "madam"), recursively
    public static boolean isPalindrome(String str) { 
        if(str.length() == 0){
            return true;
        }
        else if(str.charAt(0) == str.charAt(str.length()-1)){
            return isPalindrome(str.substring(1, str.length()-1));
        }
        else
        {
            return false;
        }
    }

    // This method returns the orignal string reversed;
    // this method should be written using recursion
    public static String reverse(String str) { 
        // YOUR CODE HERE
        return "";
    }

    public static void main(String[] args) {
        System.out.println("True case (Palindrome): " + isPalindrome("racecar"));
        System.out.println("False case (Palindrome): " + isPalindrome("running"));
    }
}
