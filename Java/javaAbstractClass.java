/*You have to create another class that extends the abstract class. Then you can create an instance of the new class.
Notice that setTitle method is abstract too and has no body. That means you must implement the body of that method in the child class.
In the editor, we have provided the abstract Book class and a Main class. In the Main class, we created an instance of a class called MyBook. Your task is to write just the MyBook class.
Your class mustn't be public.

Sample Input:
    A tale of two cities

Sample Output:
    The title is: A tale of two cities
*/

import java.util.*;

abstract class Book {

    String title;

    abstract void setTitle(String s);
    String getTitle(){ return title; }
}

class MyBook extends Book {

    void setTitle(String s) {
        title = s;
    }
}

public class javaAbstractClass {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        String title = leia.nextLine();
        MyBook new_novel = new MyBook();
        new_novel.setTitle(title);

        System.out.println("The title is: "+new_novel.getTitle());

        leia.close();
    }
}