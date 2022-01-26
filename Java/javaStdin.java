/*Task:
In this challenge, you must read  integers from stdin and then print them to stdout. Each integer must be printed on a new line. 
To make the problem a little easier, a portion of the code is provided for you in the editor below.

Input Format:
There are  lines of input, and each line contains a single integer.

Sample Input: 
    42
    100
    125
*/

import java.util.*;

public class javaStdin {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        int a = leia.nextInt();
        int b = leia.nextInt();
        int c = leia.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        leia.close();
    }
}
