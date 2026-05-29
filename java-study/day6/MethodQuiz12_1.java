import java.util.Scanner;

public class MethodQuiz12_1 {

    static boolean isPrime(int num) { // 소수 판별 메서드
        if (num <= 1) { // 1은 소수가 아니기 때문에
            return false; // false로 반환
        }

        for(int i = 2; i < num; i++) { // 2 이상부터 num값의 1을 뺀 값까지 반복해서 소수 판별
            if (num % i == 0) { // 입력받은 값이 i로 나눴을 때 나머지가 없으면 소수가 아니기 때문에
                return false; // false로 반환
            }
        }

        return true; // 소수가 맞으면 true로 반환
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("숫자 입력 : ");
            int num = sc.nextInt();

            boolean result = isPrime(num);

            if(result) {
                System.out.println(num + "은(는) 소수입니다.");
                System.out.println("프로그램을 종료합니다.");

                break; // 반복 종료
            } else {
                System.out.println(num + "은(는) 소수가 아닙니다.");
                System.out.println("다시 입력하세요.");
            }
        }
    }
}
