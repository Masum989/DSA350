package StringEasy;
// Palindrome is something if we read from
// both the end then it should be same
public class ValidPalindrome {
    // method
    // returning true if string is palindrome
    static boolean isPalindrome(String s){
        // pointers pointing to the beginning
        // and the end of the string
        int i=0,j=s.length()-1;
        // while there are characters to compare
        while (i<j){
            // if there is  a mismatch
            if(s.charAt(i)!=s.charAt(j))
                return false;
            // increment first pointer and
            // decrement the other
            i++;
            j--;
        }
        // given string is a palindrom
        return true;
    }
    public static void main(String[] args) {
        String s = "abcba";
        s = s.toLowerCase();
        // passing bool function till holding true
         if(isPalindrome(s))
             // it will be palindrome
             System.out.println("YES");
         else
              // not a palindrome
             System.out.println("No");

    }
}
