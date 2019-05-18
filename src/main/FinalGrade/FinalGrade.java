/*
 * Your prof gives 3 exams.
 * They are 150 questions on each exam.
 * Your final grade in the course is the sum of the number of questions
 * you got right on each of exam1, exam2 and exam3 divided by 450 (the
 * maximum possible points)
 *
 * Given 3 exam scores display your total of all 3
 * exam scores and percentage (as a whole number)
 *
 * SAMPLE RUN:
 *  Exam 1 Score : 120
 *  Exam 2 Score : 135
 *  Exam 3 Score : 130
 *  Total points : 385
 *  Percentage : 85
 *
 */

package FinalGrade;

import java.util.Scanner;

public class FinalGrade {

    public static void main(String[] args) {
        int exam1, exam2, exam3, total, pct;
        Scanner input = new Scanner(System.in);
        System.out.print("Exam 1 Score : ");
        exam1 = input.nextInt();
        System.out.print("Exam 2 Score : ");
        exam2 = input.nextInt();
        System.out.print("Exam 3 Score : ");
        exam3 = input.nextInt();
        total = exam1 + exam2 + exam3;
        pct = 100 * total / 450;
        System.out.printf("Total points : %d\n", total);
        System.out.printf("Percentage : %d\n", pct);

    }
}
