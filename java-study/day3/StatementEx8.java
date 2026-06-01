import java.io.IOException;

public class StatementEx8 {
    public static void main(String[] args) throws IOException {
        System.out.println("숫자입력 : ");
        int value = System.in.read();
        value -= 48;

        int result = value % 2;
        System.out.println("result : " + result);
        if (result == 0) {
            System.out.println(value + "는 짝수");
        } else {
            System.out.println(value + "는 홀수");
        }
    }
}