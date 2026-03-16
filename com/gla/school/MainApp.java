import com.gla.school.Student;
import com.gla.school.Analyzer;

public class MainApp {
    public static void main(String[] args) {
        Student s = new Student("Rahul",85,90,80);
        Analyzer a = new Analyzer();
        double avg = a.calculateAverage(s);
        String grade = a.findGrade(avg);

        System.out.println(s);
        System.out.println("Average: " + avg);
        System.out.println("Grade: " + grade);
    }
}