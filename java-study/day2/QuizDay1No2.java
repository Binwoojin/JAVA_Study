import java.io.IOException;

public class QuizDay1No2 {
    public static void main(String[] args) throws IOException {
        // 1부터 입력받은 숫자끼리 누적합을 구하기
        System.out.println("원하시는 숫자를 입력하세요.");
        int sum1 = System.in.read();
        int sum2 = 0;
        sum1 -= 48;

        for(int i = 1; i<=sum1; i++) {
            sum2 += i;
        }

        System.out.println(sum2);
    }
}
