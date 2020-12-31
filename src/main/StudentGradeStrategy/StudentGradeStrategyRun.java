package StudentGradeStrategy;

import java.util.ArrayList;

public class StudentGradeStrategyRun {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Kelly", 78, new LetterGradeStrategy()));
        students.add(new Student("Tommy", 50, new PassFailStrategy()));
        students.add(new Student("Chuck", 92, new LetterGradeStrategy()));
        students.add(new Student("Sarah", 85, new PassFailStrategy()));

        System.out.printf("NAME\tGRADE\tDISTRIBUTION\n");
        for(Student s : students) {
            System.out.printf("%s\t%d\t%s\n", s.getName(), s.getGrade(), s.getDistribution());
        }
    }
}
