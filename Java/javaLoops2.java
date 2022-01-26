/*We use the integers a, b, and n, to create the followin series: 
    (a + 2^0 . b), (a + 2^0 . b + 2^1 . b),...., (a + 2^0 . b), (a + 2^0 . b + 2^1 . b + ... + 2^n-1 . b)
You are given  queries in the form of a, b, and n. For each query, print the series corresponding to the given a, b, and n values as a single line of n space-separated integers.

Input Format:
The first line contains an integer, q, denoting the number of queries.
Each line i of the q subsequent lines contains three space-separated integers describing the respective a, b, and n values for that query.

Output Format:
For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of  space-separated integers.

Sample Input:
    2
    0 2 10
    5 3 5

Sample Output:
    2 6 14 30 62 126 254 510 1022 2046
    8 14 26 50 9
*/

import java.util.*;

public class javaLoops2 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int t = leia.nextInt();

        for(int i = 0; i < t; i++){

            int a = leia.nextInt();
            int b = leia.nextInt();
            int n = leia.nextInt();
            int c = a;

            for(int j = 0; j < n; j++){

                c += Math.pow(2, j) * b;

                System.out.printf("%s ",c);

            }
            System.out.println();
        }
        leia.close();
    }
}
