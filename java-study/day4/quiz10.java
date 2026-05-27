import java.util.Scanner;

public class quiz10 {
    public static void main(String[] args) {
        // 정수 한 개를 입력 받아서, 그 수가 50 이상의 수인지 50 미만의 수인지 판단
        System.out.println("숫자를 입력하세요! : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number >= 50) {
            System.out.println("입력하신 숫자는 50 이상의 수입니다.");
        } else {
            System.out.println("입력하신 숫자는 50 미만의 수입니다.");
        }

    }    
}
