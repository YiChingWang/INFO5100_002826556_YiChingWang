public class Main {
    public static void main(String[] args) {
        Session session = new Session();

        for (int i = 1; i <= 10; i++) {
            PartTime ptStudent = new PartTime("PartTimeStudent" + i);
            for (int j = 0; j < 15; j++) {
                ptStudent.addQuizScore((int) (Math.random() * 100));
            }
            session.addStudent(ptStudent);
        }

        for (int i = 1; i <= 10; i++) {
            FullTime ftStudent = new FullTime("FullTimeStudent" + i, (int) (Math.random() * 100), (int) (Math.random() * 100));
            for (int j = 0; j < 15; j++) {
                ftStudent.addQuizScore((int) (Math.random() * 100));
            }
            session.addStudent(ftStudent);
        }

        session.printAverageQuizScores();
        System.out.println("------------------------------------------------");
        session.printQuizScoresInAscendingOrder();
        System.out.println("------------------------------------------------");
        session.printPartTimeStudents();
        System.out.println("------------------------------------------------");
        session.printFullTimeStudentsExamScores();
    }
}
