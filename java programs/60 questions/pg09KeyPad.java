// Program 9

// Given a string of alphabets find its corresponding number represented in a peypad

import java.util.Scanner;

public class pg09KeyPad {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String result = "";

        for(int i = 0; i < str.length();i++) {

            if(str.charAt(i) == 'a' || str.charAt(i) == 'b' || str.charAt(i) == 'c') 
	            result+= Integer.toString(2);

            else if(str.charAt(i) == 'd' || str.charAt(i) == 'e' || str.charAt(i) == 'f') 
	            result += Integer.toString(3);

            else if(str.charAt(i) == 'g' || str.charAt(i) == 'h' || str.charAt(i) == 'i') 
        	    result += Integer.toString(4);

            else if(str.charAt(i) == 'j' || str.charAt(i) == 'k' || str.charAt(i) == 'l') 
	            result += Integer.toString(5);

            else if(str.charAt(i) == 'm' || str.charAt(i) == 'n' || str.charAt(i) == 'o') 
	            result += Integer.toString(6);

            else if(str.charAt(i) == 'p' || str.charAt(i) == 'q' || str.charAt(i) == 'r' || str.charAt(i) == 's') 
	            result += Integer.toString(7);

            else if(str.charAt(i) == 't' || str.charAt(i) == 'u' || str.charAt(i) == 'v') 
	            result += Integer.toString(8);

            else if(str.charAt(i) == 'w' || str.charAt(i) == 'x' || str.charAt(i) == 'y' || str.charAt(i) == 'z') 
	            result += Integer.toString(9);
        }

        System.out.println(result);
 
       s.close();
    }
}