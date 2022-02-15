/*In this problem, you have to add and multiply huge numbers! These numbers are so big that you can't contain them in any ordinary data types like a long integer.
Use the power of Java's BigInteger class and solve this problem.

Input Format:
There will be two lines containing two numbers,  and .

Constraints:
A and B are non-negative integers and can have maximum 200 digits.

Output Format::
Output two lines. The first line should contain A + B, and the second line should contain A x B. Don't print any leading zeros.

Sample Input:
    1234
    20

Sample Output:
    1254
    24680
*/

import java.util.*;
import java.math.*;

public class javaBigInteger {
    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        BigInteger a = leia.nextBigInteger();
        BigInteger b = leia.nextBigInteger();
        
        BigInteger c, d;
        
        c = a.add(b);
        d = a.multiply(b);
        
        System.out.println(c);
        System.out.println(d);
        
        leia.close();
        
    }
}
