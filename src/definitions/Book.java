/*  Created by IntelliJ IDEA.
 *  User: kinjal varshney
 *  Date: 29/08/20
 *  Time: 9:18 PM
 *  File Name : Book.java
 * */
package definitions;

public class Book {
    private String bookName;
    private String authorName;
    private String isbnBookNumber;


    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getIsbnBookNumber() {
        return isbnBookNumber;
    }

    public void setIsbnBookNumber(String isbnBookNumber) {
        this.isbnBookNumber = isbnBookNumber;
    }

}

