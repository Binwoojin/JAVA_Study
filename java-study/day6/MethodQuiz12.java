import java.util.Scanner;

public class MethodQuiz12 {

    static boolean isPrime(int num) { // Question No.1 : isPrime 메서드 안에 있는 조건문들은 전부 소수가 아닌 것을 걸러내기 위한 조건문으로만 써야하는 이유
        if(num <= 1) { // 1은 소수가 아니기 때문에
            return false; // false로 반환
        }

        // 2부터 num-1까지 반복
        for(int i = 2; i < num; i++) {  // Question No.2 : for문에서 주석 달아둔 부분에 "2부터 num-1까지 나누어보기"라고 적었던데 왜 for문의 조건식에는 i < num 인건지?
            if(num % i == 0) { // 나누어 떨어지는 수가 존재하면
                return false; // 소수가 아니기 때문에 false로 반환
            }
        }

        return true;
    }

    // Question No.1에 대한 답변 (Q. 조건문이 소수가 아닌 경우만 검사하는 이유)
    // 소수는 "약수가 없는 수"이며, 반복문을 돌면서 약수(나누어 떨어지는 수)가 하나라도 발견되면 즉시 false를 반환
    // 또한 반복문이 끝날 때까지 약수가 발견되지 않으면 소수이므로 true를 반환

    // Question No.2에 대한 답변 (Q. 반복문의 조건식을 i < num으로 작성해야 하는 이유)
    // 자기 자신(num)은 항상 num % num = 0이므로 검사 대상에 포함하게될 경우 모든 수가 소수가 아닌 것으로 판정된다.
    // 따라서 2부터 num-1까지만 검사해야 하므로 조건식을 "i < num"으로 해야 한다.
    
    public static void main(String[] args) {
        // 주어진 정수가 소수인지 아닌지 판별하는 메서드를 구현
        // 소수이면 true, 아니면 false
        // 추가로 주어진 정수가 아닌 값을 입력받아 입력받은 정수값이 소수인지 아닌지 판별하는 것으로 작업

        Scanner sc = new Scanner(System.in);

        System.out.println("아무 숫자를 입력하세요 : ");
        int num = sc.nextInt();

        System.out.println(isPrime(num));

        
    }
    

}
