
/*
PROGRAM OUTPUT:

Studnet	Total	Average
Dave	385	0.855556
Jane	420	0.933333
Test	450	1.000000
 */

package MET100Grades.src.met100grades;

public class MET100Grades {

    public static void main(String[] args) {
        Gradebook g1 = new Gradebook("Dave",120, 130, 135);
        Gradebook g2 = new Gradebook("Jane",135, 145, 140);
        Gradebook t1 = new Gradebook("Test",150,150,150);
        System.out.printf("Studnet\tTotal\tAverage\n");
        System.out.printf("%s\t%d\t%f\n"
                ,g1.studentName(), g1.totalPoints(), g1.finalAverage());
        System.out.printf("%s\t%d\t%f\n"
                ,g2.studentName(), g2.totalPoints(), g2.finalAverage());        
        System.out.printf("%s\t%d\t%f\n"
                ,t1.studentName(), t1.totalPoints(), t1.finalAverage());        
    }
}
