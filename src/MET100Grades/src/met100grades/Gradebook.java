package MET100Grades.src.met100grades;

/**
 * This class implements a gradebook.
 * @author navdeepgill
 */
public class Gradebook {

    public final double maxPoints = 450.0; // maximum points in the course.
    private int exam1, exam2, exam3;
    private String studentName;
    
    /**
     * Creates a new gradebook object with exam scores
     * @param name the String name of the student 
     * @param exam1 the score on exam1
     * @param exam2 the score on exam2
     * @param exam3 the score on exam3
     */
    public Gradebook(String name, int exam1, int exam2, int exam3 ) {
        this.studentName = name;
        this.exam1=exam1;
        this.exam2=exam2;
        this.exam3=exam3;
    }
    
    /**
     * Gets the name of the student in this gradebook entry
     * @return name of student as String.
     */
    public String studentName() {
        // student's name
        return this.studentName;
    }
    
    /**
     * Return the total number of points for this gradebook entry
     * @return total points as integer
     */
    public int totalPoints() {
        return (this.exam1 + this.exam2 + this.exam3);
    }
    
    /**
     * Calculate the final average for the gradebook entry. Represented as
     * the total points divided by the maximum amount of points.
     * @return 
     */
    public double finalAverage() {
        return (this.totalPoints()/this.maxPoints);
    }
        
}
