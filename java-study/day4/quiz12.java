import java.util.Scanner;

public class quiz12 {
    public static void main(String[] args) {
        // 정수 한 개를 입력 받아, 입력받은 수가 양수, 0, 음수인지 판단
        System.out.println("숫자를 입력하세요! : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("입력하신 숫자는 양수입니다.");
        } else if (num == 0) {
            System.out.println("입력하신 숫자는 0 입니다.");
        } else {
            System.out.println("입력하신 숫자는 음수입니다.");
        }
    }    
}
