import java.util.ArrayList;
import java.util.List;

public class Student {
    protected String name;
    protected List<Integer> quizScores;

    public Student(String name) {
        this.name = name;
        this.quizScores = new ArrayList<>();
    }

    public String getName() {

        return name;
    }

    public void addQuizScore(int score) {

        quizScores.add(score);
    }
    public List<Integer> getQuizScores() {

        return quizScores;
    }

    public int totalScore() {
        int sum = 0;
        for (int i = 0; i < quizScores.size(); i++) {
            sum += quizScores.get(i);
        }
        return sum;
    }

    public double calculateAverageForEveryStudent() {
        if (quizScores.isEmpty()) {
            return 0.0;
        }
        double average = (double) totalScore() / quizScores.size();
        return average;
    }



}

