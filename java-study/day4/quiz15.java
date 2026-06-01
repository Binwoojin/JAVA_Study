import java.util.Scanner;

public class quiz15 {
    public static void main(String[] args) {
        // 사용자로부터 초를 입력 받은 후
        // 일 | 시간 | 분 | 초 단위별로 정리해서 결과값이 나오도록 출력

        Scanner sc = new Scanner(System.in);
        System.out.println("계산할 초를 적어주세요 : ");
        int seconds = sc.nextInt();

        int years = seconds / 31536000; // 1년 = 31,536,000초
        seconds %= 31536000;

        int day = seconds / 86400; // 1일 = 86,400초
        seconds %= 86400;

        int hours = seconds / 3600; // 1시간 = 3,600초
        seconds %= 3600;

        int minutes = seconds / 60; // 1분 = 60초
        seconds %= 60;

        int sec = seconds;

        System.out.println(years + "년 " + day + "일 " + hours + "시간 " + minutes + "분 " + sec + "초");



    }
}
