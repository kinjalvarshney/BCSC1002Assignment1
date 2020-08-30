/*  Created by IntelliJ IDEA.
 *  User: Kinjal Varshney
 *  Date: 29/08/20
 *  Time: 9:18 PM
 *  File Name : Student.java
 * */
package definitions;

public class Student {
    private String firstName, middleName, lastName;
    private long universityRollNumber;
    private int numberOfBooksIssued;
    private Book[] namesOfBooksIssued;

    public Student() {
        firstName = "Miley";
        middleName = "Ray";
        lastName = "Cyrus";
        universityRollNumber = 191500399L;
        numberOfBooksIssued = 1;
        namesOfBooksIssued = new Book[numberOfBooksIssued];
        for (int index = 0; index < namesOfBooksIssued.length; index++) {
            namesOfBooksIssued[index] = new Book("Book" + (index + 1), "1478524187457");
        }
    }

    public Student(String firstName, String middleName, String lastName, long universityRollNumber, int numberOfBooksIssued) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.universityRollNumber = universityRollNumber;
        this.numberOfBooksIssued = numberOfBooksIssued;
        namesOfBooksIssued = new Book[numberOfBooksIssued];
        for (int index = 0; index < namesOfBooksIssued.length; index++) {
            namesOfBooksIssued[index] = new Book("Book" + (index + 1), "Author" + (index + 1), "8754216587321");
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getUniversityRollNumber() {
        return universityRollNumber;
    }

    public void setUniversityRollNumber(long universityRollNumber) {
        this.universityRollNumber = universityRollNumber;
    }

    public int getNumberOfBooksIssued() {
        return numberOfBooksIssued;
    }

    public void setNumberOfBooksIssued(int numberOfBooksIssued) {
        this.numberOfBooksIssued = numberOfBooksIssued;
    }

    public Book[] getNamesOfBooksIssued() {
        return namesOfBooksIssued.clone();
    }

    public void setNamesOfBooksIssued(Book[] namesOfBooksIssued) {
        this.namesOfBooksIssued = namesOfBooksIssued;
    }
}
