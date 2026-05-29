import java.util.Scanner;

public class MethodQuiz10 {

    static boolean isEven(int num) { // 짝수 판별 메서드 ( 값이 true와 false이기 때문에 반환형태를 boolean으로 설정 )
        if(num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        // 입력된 값이 해당 수가 짝수이면 true, 홀수이면 false를 반환하는 메서드를 구현

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 입력 : ");

        int num = sc.nextInt();
        System.out.println(isEven(num));

    }
}
