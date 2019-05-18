/**
 * Create an ArrayList of Students, and then populate
 * the students object with 4 students.
 * <p>
 * Does the following inside the main method:
 * <p>
 * 1) Remove Ronnie... print the list of students.
 * 2) Add Ronnie back to the end of the list... print the list of students
 * 3) Change Connie's GPA to 2.0... print the list of students
 * 4) Add Bill with GPA 1.0 after Navdeep... print the list of students
 * 5) Make Connie and Navdeep swap positions... print the list of students
 * <p>
 * SAMPLE RUN:
 * #	Student	GPA
 * -	-------	-------
 * 0	John	2.900000
 * 1	Ronnie	3.200000
 * 2	Navdeep	4.000000
 * 3	Connie	3.300000
 * <p>
 * Removing student Ronnie...
 * #	Student	GPA
 * -	-------	-------
 * 0	John	2.900000
 * 1	Navdeep	4.000000
 * 2	Connie	3.300000
 * <p>
 * Adding Ronnie back to the end...
 * #	Student	GPA
 * -	-------	-------
 * 0	John	2.900000
 * 1	Navdeep	4.000000
 * 2	Connie	3.300000
 * 3	Ronnie	3.200000
 * <p>
 * Changing Connie's GPA to 2.0...
 * #	Student	GPA
 * -	-------	-------
 * 0	John	2.900000
 * 1	Navdeep	4.000000
 * 2	Connie	2.000000
 * 3	Ronnie	3.200000
 * <p>
 * Adding Bill after Navdeep...
 * #	Student	GPA
 * -	-------	-------
 * 0	John	2.900000
 * 1	Navdeep	4.000000
 * 2	Bill	1.000000
 * 3	Connie	2.000000
 * 4	Ronnie	3.200000
 * <p>
 * Make Connie and Navdeep swap positions...
 * #	Student	GPA
 * -	-------	-------
 * 0	John	2.900000
 * 1	Connie	2.000000
 * 2	Bill	1.000000
 * 3	Navdeep	4.000000
 * 4	Ronnie	3.200000
 */
package ArrayListOfStudents;

import java.util.ArrayList;

public class ArrayListOfStudentsRun {

    public static void main(String[] args) {
        // ArrayList are dynamic collections of objects (reference types only)
        ArrayList<Student> students = new ArrayList<>();
        // Adding some students
        students.add(new Student("John", 2.9));
        students.add(new Student("Ronnie", 3.2));
        students.add(new Student("Navdeep", 4.0));
        students.add(new Student("Connie", 3.3));
        printStudents(students);

        // 1) Remove Ronnie... print the list of students.
        System.out.println("Removing student Ronnie...");
        Student Ronnie = students.remove(1);
        printStudents(students);
        // 2) Add Ronnie back to the end of the list... print the list of students
        System.out.println("Adding Ronnie back to the end...");
        students.add(Ronnie);
        printStudents(students);
        // 3) Change Connie's GPA to 2.0... print the list of students 
        System.out.println("Changing Connie's GPA to 2.0...");
        students.get(2).setGPA(2.0);
        printStudents(students);
        // 4) Add Bill with GPA 1.0 after Navdeep... print the list of students 
        System.out.println("Adding Bill after Navdeep...");
        students.add(2, new Student("Bill", 1.0));
        printStudents(students);
        // 5) Make Connie and Navdeep swap positions... print the list of students 
        System.out.println("Make Connie and Navdeep swap positions...");
        Student tmp = students.get(3);
        students.set(3, students.get(1));
        students.set(1, tmp);
        printStudents(students);

    }

    public static void printStudents(ArrayList<Student> al) {
        System.out.printf("#\tStudent\tGPA\n");
        System.out.printf("-\t-------\t-------\n");
        for (int i = 0; i < al.size(); i++) {
            System.out.printf("%d\t%s\t%f\n",
                    i,
                    al.get(i).getName(),
                    al.get(i).getGPA());
        }
        System.out.println();
    }
}

