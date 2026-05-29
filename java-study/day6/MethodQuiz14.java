import java.util.Scanner;

public class MethodQuiz14 {

    static int sumEvenNumber(int a, int b) {
        int sum = 0;
        for(int i = a; i <= b; i++) {
            if ( i % 2 == 0 ) {
                sum += i;
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        // 두 개의 정수를 입력받아, 그 범위 내에 있는 모든 짝수의 합을 반환하는 메서드를 구현

        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 정수값을 입력하세요 : ");
        int a = sc.nextInt();
        System.out.println("두 번째 정수값을 입력하세요 : ");
        int b = sc.nextInt();

        int result = sumEvenNumber(a,b);
        System.out.println("result = " + result);
    }
}
