/** Reading and Writing Students from a file
 * 
 * Methods which read / write
 * student object data to / from a file. It demonstrates the use of object
 * serialization.
 *

EXAMPLE OUTPUT FROM RUN:
Enter Student Name ==> Navdeep Gill
Enter Student GPA  ==> 3.80
Writing to student.txt...
Reading from student.txt...
Student: Navdeep Gill 3.8000
 
 * 
*/
package StudentFileIO;

import java.io.File;
import java.util.Scanner;

public class StudentFileIORun {

    public static void main(String[] args) {
       
        try {
            
            File file = new File("student.txt");
            Scanner input = new Scanner(System.in);
            Student s1 = new Student();
            Student s2 = new Student();
            System.out.print("Enter Student Name ==> ");
            s1.setName(input.nextLine());
            System.out.print("Enter Student GPA  ==> ");
            s1.setGPA(input.nextDouble());
            System.out.printf("Writing to %s...\n",file.getName());
            s1.Save(file);
            System.out.printf("Reading from %s...\n",file.getName());
            
            s2.Load(file);
            System.out.printf("Student: %s\n", s2);
            
        } catch (Exception ex) {
            System.out.printf("ERROR: %s\n", ex);
        }
        
        
        
    }
}
