package quiz;

public class ReverseString {
    public String reverse(String input) {
        //return new StringBuffer(input).reverse().toString();
        if(input.isEmpty()){
            return "";
        }
        //return new StringBuffer(input).reverse().toString();
        //uses recursion to reverse
        else{
            return input.charAt(input.length()-1) + reverse(input.substring(0, input.length()-1));
        }
    }
}