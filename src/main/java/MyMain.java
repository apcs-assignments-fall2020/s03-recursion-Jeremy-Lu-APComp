public class MyMain {
    // This method adds up the values of all digits
    // in x, recursively
    public static int addDigits(int x) { 
        int sol = 0;
        if(x == 0){
            return 0;
        }
        else{
            sol = sol + (x%10);
            x = addDigits(x/10);
            sol = sol + x;
        }
        return sol;
    }


    // This method checks if a String is a palindrome
    // (e.g. "racecar", "madam"), recursively
    public static boolean isPalindrome(String str) { 
        if(str.length() == 0 || str.length() == 1){
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
        if(str.length()<=1){
            return str;
        }
        else{
            String reversed = reverse(str.substring(1, str.length())) + str.charAt(0);
            return reversed;
        }
    }

    public static void main(String[] args) {
        System.out.println("True case (Palindrome): " + isPalindrome("racecar"));
        System.out.println("False case (Palindrome): " + isPalindrome("running"));
        System.out.println("Sum digits: " + addDigits(39));
        System.out.println("Reverse: " + reverse("String"));
    }
}
