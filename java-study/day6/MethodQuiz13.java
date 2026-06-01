import java.util.Scanner;

public class MethodQuiz13  {

    static int power(int a, int b) {
        int result = 1; // 결과값 반환을 위한 임시 변수 선언
        for(int i = 1; i <= b; i++) {
            result *= a;
        }

        return result;
    }

    public static void main(String[] args) {
        // 두 개의 정수를 입력받아, 첫 번째 수를 두 번째 수만큼 제곱한 결과를 반환하는 메서드를 구현
        // power(2,3)은 8을 반환 2의 3승
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 정수를 입력하세요 : ");
        int a = sc.nextInt();
        System.out.println("두 번째 정수를 입력하세요 : ");
        int b = sc.nextInt();
        
        System.out.println(power(2,3));
    }
}
