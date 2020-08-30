/*  Created by IntelliJ IDEA.
 *  User: Kinjal Varshney
 *  Date: 29/08/20
 *  Time: 9:18 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Library;
import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    private static final int ISSUE_NEW_BOOK = 1;
    private static final int RETURN_ISSUED_BOOK = 2;
    private static final int SHOW_ALL_ISSUED_BOOKS = 3;
    private static final int EXIT = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String firstName = scanner.nextLine();
        String middleName = scanner.nextLine();
        String lastName = scanner.nextLine();
        System.out.println("Enter your Roll Number: ");
        long universityRollNo = scanner.nextLong();
        System.out.println("Enter number of Books issued: ");
        int numberOfBooksIssued = scanner.nextInt();
        int studentInput;
        Student myDetails = new Student(firstName, middleName, lastName, universityRollNo, numberOfBooksIssued);
        Library libraryDetails = new Library();
        do {
            System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-");
            System.out.println("How may I help you today?");
            System.out.println("1. Issue a new book for me.");
            System.out.println("2. Return a previously issues book for me.");
            System.out.println("3. Show me all my issues books.");
            System.out.println("4. Exit.");
            System.out.println("Enter your choice (1...4): ");
            studentInput = scanner.nextInt();
            switch (studentInput) {
                case ISSUE_NEW_BOOK -> {
                    System.out.println("Enter the name of the book you want to issue: ");
                    scanner.nextLine();
                    String bookName = scanner.nextLine();
                    libraryDetails.issueBook(bookName);
                }
                case RETURN_ISSUED_BOOK -> {
                    System.out.println("Enter the number of books you have issued: ");
                    scanner.nextInt();
                    System.out.println("Enter the name of the book you want to return: ");
                    scanner.nextLine();
                    String bookName = scanner.nextLine();
                    myDetails.showNamesOfBooksIssued();
                    libraryDetails.returnBook(bookName);
                }
                case SHOW_ALL_ISSUED_BOOKS -> {
                    System.out.println("Show all the issued books: ");
                    scanner.nextLine();
                    String bookName = scanner.nextLine();
                    myDetails.showNamesOfBooksIssued();
                }
            }
        } while (studentInput != EXIT);
        scanner.close();
    }
}
