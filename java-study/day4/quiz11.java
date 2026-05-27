import java.util.Scanner;

public class quiz11 {
    public static void main(String[] args) {
        // 정수 한 개를 입력받아서, 그 수가 3의 배수인지 출력
        System.out.println("숫자를 입력하세요! : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 3 == 0) {
            System.out.println("입력하신 숫자는 3의 배수입니다.");
        } else {
            System.out.println("입력하신 숫자는 3의 배수가 아닙니다.");
        }
    }    
}
