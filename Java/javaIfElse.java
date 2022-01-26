/*Task
Given an integer, , perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of 2 to 5, print Not Weird
If  is even and in the inclusive range of 6 to 20, print Weird
If  is even and greater than 20, print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.*/

import java.util.*;

public class javaIfElse {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        
        int n = leia.nextInt();   
                 
        String ans = "";
        
        if(n % 2 == 1){
            ans = "Weird";
        } else {
            if (n >= 2 && n <= 5) {
                ans = "Not Weird";
            } else if (n >= 6 && n <= 20) {
                ans = "Weird";
            } else {
                ans = "Not Weird";
            } 
        }
        
        System.out.println(ans);
        leia.close();
    }
}
