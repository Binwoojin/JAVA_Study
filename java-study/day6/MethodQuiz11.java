public class MethodQuiz11 {

    static int factorial(int n) { // 팩토리얼 계산 메서드
        int result = 1; // 결과 저장 변수. Question No.1 : 왜 result 값을 1로 하는 이유가 있나요?

        for(int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;

    }

    // Question No.1 답변
    // 곱샘의 초기값을 0으로 설정했기 때문이다. 0에 어떤 수를 곱해도 결과는 항상 0이 되기 때문에
    // 팩토리얼과 같은 누적 곱셈은 1로 초기화 해야 한다.


    public static void main(String[] args) {
        // 팩토리얼 구하기
        int result = factorial(5);
        System.out.println("result : " + result);

    }
}
