/*Task
Reads an integer from stdin and saves it to a variable, N, denoting some number of integers.
Reads  integers corresponding to A0,A1,...,AN-1 from stdin and saves each integer AI to a variable, VAL.
Attempts to print each element of an array of integers named .
Write the following code in the unlocked portion of your editor:

Create an array, A, capable of holding N integers.
Modify the code in the loop so that it saves each sequential value to its corresponding location in the array. For example, the first value must be stored in A0,the second value must be stored in A1, and so on.
Good luck!

Sample Input:
    5
    10
    20
    30
    40
    50

Sample Output:
    10
    20
    30
    40
    50
*/

import java.util.*;

public class java1DArray {

    public static void main(String[] args) {
	   
        Scanner leia = new Scanner(System.in);
        int n = leia.nextInt();
        int a[] = new int[n];
        
        for(int i = 0; i < n; i++) {
            a[i] = leia.nextInt();
        }
        leia.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
