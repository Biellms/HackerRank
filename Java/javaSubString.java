/*Given a string, S, and two indices, START and END, print a substring consisting of all characters in the inclusive range from START to END-1.

Input Format:
The first line contains a single string denoting S.
The second line contains two space-separated integers denoting the respective values of START and END.

Sample Input:
    Helloworld
    3 7

Sample Output:
    lowo
*/


import java.util.*;

public class javaSubString {
    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        String S = leia.next();
        int start = leia.nextInt();
        int end = leia.nextInt();

        System.out.println(S.substring(start,end));

        leia.close();
    }
}
