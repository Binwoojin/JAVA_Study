import java.util.Scanner;

public class ArrayQuiz8 {
    public static void main(String[] args) {
        // 사용자로부터 국어 성적 10개를 입력받아 총점과 평균을 출력하는 코드 (배열사용)
        Scanner sc = new Scanner(System.in);
        int[] score = new int[10];
        int total = 0;
        double avg = 0;

        // 국어 성적 입력 받아서 score 배열에 입력(10변 입력받아야함)
        for(int i = 0; i < score.length; i++) {
            System.out.println((i+1) + " 번째 국어 점수를 입력하세요. : ");
            score[i] = sc.nextInt();
            total += score[i]; 
        }

        avg = (double)total / score.length; // 소숫점 표현을 위해 avg를 double형으로 선언 후 total를 double로 형변환

        System.out.println("총점 : " + total);
        System.out.println("평균 : " + avg);
        
    }
}
