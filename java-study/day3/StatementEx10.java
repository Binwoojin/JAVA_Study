import java.util.Scanner;

public class StatementEx10 {
    public static void main(String[] args) {
        
        System.out.println("성적 입력 : ");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        if (score >= 90) {
            System.out.println("당신의 점수는 : " + score + " (A학점)");
        } else if (score >= 80) {
            System.out.println("당신의 점수는 : " + score + " (B학점)");
        } else if (score >= 70) {
            System.out.println("당신의 점수는 : " + score + " (C학점)");
        } else if (score >= 60) {
            System.out.println("당신의 점수는 : " + score + " (D학점)");
        } else {
            System.out.println("당신의 점수는 : " + score + " (F학점)");
        }
    }    
}
