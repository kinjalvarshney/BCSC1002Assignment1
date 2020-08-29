/*  Created by IntelliJ IDEA.
 *  User: Kinjal Varshney
 *  Date: 29/08/20
 *  Time: 9:18 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Book;

public class FrontDesk {
    public static void main(String[] args) {

        Book book1 = new Book();
        Book book2 = new Book("harry potter", "jk rowling", "1475245224453");
        Book book3 = new Book("twilight", "1421584751247");

        // System.out.println("1-" + book1.getBookName() + "\n2-" + book1.getAuthorName() + "\n3-" + book1.getIsbnBookNumber());
        // System.out.println(book2.getBookName() + "\t" + book2.getAuthorName() + "\t" + book2.getIsbnBookNumber());
        System.out.println(book1);

    }
}
