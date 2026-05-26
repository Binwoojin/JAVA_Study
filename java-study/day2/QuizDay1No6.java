import java.util.Scanner; // Scanner 기능을 사용하기 위한 import

public class QuizDay1No6 {
    public static void main(String[] args) {
        // do while문을 사용해서 사용자가 5를 맞출때까지 반복
        
        Scanner sc = new Scanner(System.in); // Scanner 객체 생성 ( 키보드 입력 받기 )
        int num; // 입력한 숫자를 저장할 수 있는 변수 선언

        do {
            System.out.println("숫자를 입력하세요 : "); // 사용자에게 입력 메시지 출력
            num = sc.nextInt(); // 사용자로부터 숫자 입력 받기

            if (num != 5) { // 입력한 숫자가 5가 아닐 경우
                System.out.println("틀렸습니다."); // "틀렸습니다" 라는 메세지를 출력
            }
        } while (num != 5); // num 값이 5가 아닐 동안 계속 반복

        System.out.println("정답입니다!"); // 반복문 종료 후 정답 메시지 출력

    }


    // throws IOException과 Scanner의 차이점

    // 1. throws IOException의 경우 예외처리 관련으로 에러가 발생할 수 있으니 자바에게 미리 알려주는 것
    // 2. Scanner는 입력 받기 즉, 사용자 입력을 받는 도구로 사용하는 것 키보드, 숫자, 문자열 입력을 받는 도구로 사용
    
}
