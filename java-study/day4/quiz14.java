import java.util.Scanner;

public class quiz14 {

    public static void main(String[] args) {
        // 특정 범위에서의 홀수 합 구하기
        // 사용자로부터 두 개의 숫자를 입력 받은 후 해당 범위에서의 홀수를 구한 후
        // 홀수만 누적합을 구해서 출력

        // 최종 출력 값 : 5에서 10 사이의 홀수 누적합은 21 입니다.

        Scanner sc = new Scanner(System.in); // Scanner 객체 생성
        // 첫 번째 숫자 입력
        System.out.println("첫 번째 숫자를 입력하세요 : ");
        int first = sc.nextInt();

        // 두 번째 숫자 입력
        System.out.println("두 번째 숫자를 입력하세요 : ");
        int second = sc.nextInt();

        int total = 0; // 총합 저장 변수 선언

        for (int i = first; i <= second; i++) { // first부터 second가지 반복문
            if (i % 2 == 1) { // 홀수인지 검사
                total += i; // 홀수면 total에 누적
            }
        }

        System.out.println(first + "에서 " + second + "사이의 홀수 누적합은 " + total + "입니다."); // 최종 출력값 
    }
    
}
