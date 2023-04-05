package StringEasy;

import java.util.Stack;

//The string inputStr only contains '[', ']', '{', '}', '(', and ')'. Our task is to determine whether the string inputStr is a valid string or not. For the string to be valid, the following criteria have to be satisfied.
//Every open bracket should be closed by the same bracket type.
//  The order in which brackets are closed must be in the correct order.
//   Each close bracket should have mapped with the corresponding open bracket of the same type. It is evident that the closing bracket should come after the opening bracket.
public class ValidParenthesis {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (char c : s.toCharArray()){
            if(c=='(')
                stack.push(')');
            else if (c=='{')
              stack.push('}');
            else if(c=='[')
                stack.push(']');
            else if(stack.isEmpty() || stack.pop()!=c)
                return false;
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        // creating an object of the class validParenthesis
        ValidParenthesis obj = new ValidParenthesis();
        String s = "((})";
        // invoking the method isValid()
        boolean isValid = obj.isValid(s);
        if(isValid){
            System.out.println("Valid string");
        }else{
            System.out.println("Not valid string");
        }
    }
}
