package StringEasy;
//An anagram of a string is another string
// that contains the same characters, only the
// order of characters can be different. For example
// , “abcd” and “dabc” are an anagram of each other.

import java.util.Arrays;

//1. by sorting
public class Anagram {
    public static void main(String[] args) {
     String s1 = "mace";
     String s2 = "came";
     // convert the both string to lowercase
     s1 = s1.toLowerCase();
     s2 = s2.toLowerCase();
     // check if length is same or not
        if(s1.length()==s2.length()){
            // convert string to char array
            char[] ch1 = s1.toCharArray();
            char[] ch2 = s2.toCharArray();

            // sort the char array
            Arrays.sort(ch1);
            Arrays.sort(ch2);
        // if sorted array are same then anagram
            boolean res = Arrays.equals(ch1,ch2);
             if(res){
                 System.out.println("Both are anagram");
             }else {
                 System.out.println("Both are not anagram");
             }
        }
        else{
            System.out.println("Are not anagram");
        }
    }
}
