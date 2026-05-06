public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Quiz Console App!");
        
        QuestionService questionService = new QuestionService();
        questionService.displayQuestions();
    }
}
