/*  Created by IntelliJ IDEA.
 *  User: Kinjal Varshney
 *  Date: 29/08/20
 *  Time: 9:18 PM
 *  File Name : Book.java
 * */
package definitions;

public class Book {
    private String bookName;
    private String authorName;
    private String isbnBookNumber;


    public Book() {
        bookName = "A Series of Unfortunate Events";
        authorName = "Lemony Snicket";
        isbnBookNumber = "1410200110296";
    }

    public Book(String bookName, String isbnBookNumber) {
        this.bookName = bookName;
        authorName = "J.K Rowling";
        this.isbnBookNumber = isbnBookNumber;
    }

    public Book(String bookName, String authorName, String isbnBookNumber) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.isbnBookNumber = isbnBookNumber;
    }

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

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", isbnBookNumber='" + isbnBookNumber + '\'' +
                '}';
    }

}

