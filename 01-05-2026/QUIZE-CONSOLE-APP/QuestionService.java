
import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];

    public QuestionService() {
        questions[0] = new Question(3, 1, "Berlin", "Madrid", "Paris", "Rome", "What is the capital of France?");
        questions[1] = new Question(3, 2, "2", "3", "4", "5", "What is 2 + 2?");
        questions[2] = new Question(4, 3, "Venus", "Earth", "Mars", "Mercury", "Which planet is closest to the Sun?");
        questions[3] = new Question(2, 4, "Hemingway", "Shakespeare", "Tolstoy", "Dickens", "Who wrote 'Romeo and Juliet'?");
        questions[4] = new Question(4, 5, "K2", "Kangchenjunga", "Lhotse", "Mount Everest", "What is the highest mountain in the world?");
    }

    public void displayQuestions() {
        int score = 0;
        for (Question question : questions) {
            System.out.println(question.getQuestion());
            System.out.println("1. " + question.getOpt1());
            System.out.println("2. " + question.getOpt2());
            System.out.println("3. " + question.getOpt3());
            System.out.println("4. " + question.getOpt4());
            Scanner scanner = new Scanner(System.in);
            System.out.print("Your answer (1-4): ");
            int userAnswer = scanner.nextInt();
            if (userAnswer == question.getCorrectOption()) {
                System.out.println("Correct!");
                score+=10;
            } else {
                System.out.println("Wrong! The correct answer is: " + question.getCorrectOption());
            }

            System.out.println("-----------------------------");
        }
        System.out.println("Your final score is: " + score + " out of " + (questions.length * 10));
    }

}
