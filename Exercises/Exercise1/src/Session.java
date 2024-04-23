import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Session {
    private List<Student> students;

    public Session() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }
    public void printAverageQuizScores() {
        for(int i = 0; i < students.size(); i++){
            //get student name
            Student student = students.get(i);
            System.out.println(student.getName() + "'s average quiz score: " + student.calculateAverageForEveryStudent());
        }
    }

    public void printQuizScoresInAscendingOrder() {
        for(int i = 0; i < students.size(); i++){
            Student student = students.get(i);
            List<Integer> sortedScores = new ArrayList<>(student.getQuizScores());
            Collections.sort(sortedScores);
            System.out.println(student.getName() + "'s quiz scores in ascending order: " + sortedScores);
        }
    }

    public void printPartTimeStudents() {
        for (Student student : students) {
            if (student instanceof PartTime) {
                System.out.println("Part-time student: " + student.getName());
            }
        }
    }
    public void printFullTimeStudentsExamScores() {
        for (Student student : students) {
            if (student instanceof FullTime) {
                FullTime ft = (FullTime) student;
                System.out.println("------------------------------------------------");
                System.out.println("Full-time student: " + ft.getName() + "\n" +
                        "Extra Exam Score 1: " + ft.getExamScore1() + "\n" +
                        "Extra Exam Score 2: " + ft.getExamScore2()
                );

            }
        }
    }
}
