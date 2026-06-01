import java.util.Scanner;

public class StatementEx13 {
    public static void main(String[] args) {
        
        System.out.println("태어난 년도 4자리를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        year %= 12; // year = year % 12 

        if (year == 4) {
            System.out.println("쥐띠입니다.");
        } else if (year == 5) {
            System.out.println("소띠입니다.");
        } else if (year == 6) {
            System.out.println("호랑이띠입니다.");
        } else if (year == 7) {
            System.out.println("토끼띠입니다.");
        } else if (year == 8) {
            System.out.println("용띠입니다.");
        } else if (year == 9) {
            System.out.println("뱀띠입니다.");
        } else if (year == 10) {
            System.out.println("말띠입니다.");
        } else if (year == 11) {
            System.out.println("양띠입니다.");
        } else if (year == 0) {
            System.out.println("원숭이띠입니다.");
        } else if (year == 1) {
             System.out.println("닭띠입니다.");
        } else if (year == 2) {
            System.out.println("개띠입니다.");
        } else {
            System.out.println("돼지띠입니다.");
        }
    }
}
