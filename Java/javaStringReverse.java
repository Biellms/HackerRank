/* Given a string A, print Yes if it is a palindrome, print No otherwise.

Constraints:
* A will consist at most 50 lower case english letters.


Sample Input:
    madam

Sample Output:
    Yes
*/

import java.util.*;

public class javaStringReverse {
    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        String A = leia.next();

        String R = new StringBuilder(A).reverse().toString();

        if (A.equals(R)) {
            System.out.println("The word '"+A+"' is a palindrome!"); // The HackerRank Sample Output expected is "Yes"
        } else {
            System.out.println("The word '"+A+"' is not a palindrome!"); // The HackerRank Sample Output expected is "No"
        }

        leia.close();
    }
}
