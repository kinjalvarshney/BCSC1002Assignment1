/*  Created by IntelliJ IDEA.
 *  User: Kinjal Varshney
 *  Date: 29/08/20
 *  Time: 9:18 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Student;

public class FrontDesk {
    public static void main(String[] args) {

        Student student = new Student();
        Student student1 = new Student("kinjal", "n", "varshney", 148724, 1);
        //   System.out.println(student.getFirstName() + student.getMiddleName() + "\n" + Arrays.toString(student.getNamesOfBooksIssued()) + "\n" + student.getNumberOfBooksIssued());
        // student1.showNamesOfBooksIssued();
        //  System.out.println(student1);
    }
}
