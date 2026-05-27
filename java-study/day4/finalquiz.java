import java.util.Scanner;

public class finalquiz {
    public static void main(String[] args) {
        // 사용자로부터 숫자를 입력 받은 후
        // 메뉴판 출력된 이후에 메뉴를 선택하고
        // 몇 개인지도 출력한 이후
        // 주문한 내용과 주문 이후의 잔돈 (만원, 오천원, 천원, 오백원, 백원) 갯수 출력 (이게 어려울 듯)

        Scanner sc = new Scanner(System.in); // Scanner 객체 생성

        // 현재 보유 금액 입력
        System.out.println("현재 보유중인 금액을 입력하세요 : "); 
        int money = sc.nextInt();

        // 메뉴판 출력
        System.out.println("메뉴판\n1. 콜라 : 1,200원\n2. 사이다 : 1,600원\n3. 맥주 : 2,500원\n");

        // 메뉴 번호 입력
        System.out.println("메뉴를 선택하세요 : ");
        int menu = sc.nextInt();

        // 구매 개수 입력
        System.out.println("몇 개를 구매하시나요? : ");
        int order = sc.nextInt();

        // 음료 이름과 가격을 저장하기 위한 변수 선언
        String drinkName = "";
        int price = 0;

        if (menu == 1) { // 메뉴 번호가 1번이면 
            drinkName = "콜라"; // 콜라 선택 ( 가격은 1200원 )
            price = 1200;
        } else if (menu == 2) { // 메뉴 번호가 2번이면
            drinkName = "사이다"; // 사이다 선택 ( 가격은 1600원 )
            price = 1600;
        } else if (menu == 3) { // 메뉴 번호가 3번이면
            drinkName = "맥주"; // 맥주 선택 ( 가격은 2500원 )
            price = 2500;
        } else { // 1, 2, 3번이 아닌 다른 번호를 입력할 경우
            System.out.println("잘못된 번호입니다.");
            return; // 프로그램 종료
        }

        int totalPrice = price * order; // 금액 * 갯수 | 총 구매 금액 계산

        if (money < totalPrice) { // 보유 금액이 총 금액보다 적을 경우
            System.out.println("금액이 부족합니다.");
            System.out.println("필요 금액 : " + totalPrice + "원");
            System.out.println("현재 금액 : " + money + "원");
            // 금액 부족 텍스트를 띄워준 후 프로그램 종료
            return;
        }

        int change = money - totalPrice;  // 최종 잔돈 계산

        System.out.println("====== 구매 결과 ======");
        System.out.println("주문 메뉴 : " + drinkName + " " + order + "개"); // 주문한 메뉴와 개수 
        System.out.println("총 구매 금액 : " + totalPrice + "원"); // 총 구매 금액값
        System.out.println("남은 잔돈 : " + change + "원"); // 잔돈

        int temp = change; // 잔돈 계산용 임시 변수

        int man = temp / 10000; // 만원 개수 계산
        temp %= 10000; // 만원 제외 후 남은 금액 저장

        int ocheon = temp / 5000; // 오천원 개수 계산
        temp %= 5000; // 오천원 제외 후 남은 금액 저장

        int cheon = temp / 1000; // 천원 개수 계산
        temp %= 1000; // 천원 제외 후 남은 금액 저장

        int obeak = temp / 500; // 오백원 개수 계산
        temp %= 500; // 오백원 제외 후 남은 금액 저장

        int beak = temp / 100; // 백원 개수 계산

        if (man > 0) { // 만원 단위가 있을 경우
            System.out.println("만원 : " + man + "장"); // 만원 개수 출력
        }
        if (ocheon > 0) { // 오천원 단위가 있을 경우
            System.out.println("오천원 : " + ocheon + "장"); // 오천원 개수 출력
        }
        if (cheon > 0) { // 천원 단위가 있을 경우
            System.out.println("천원 : " + cheon + "장"); // 천원 개수 출력
        }
        if (obeak > 0) { // 오백원 단위가 있을 경우
            System.out.println("오백원 : " + obeak + "개"); // 오백원 개수 출력
        }
        if (beak > 0) { // 백원 단위가 있을 경우
            System.out.println("백원 : " + beak + "개"); // 백원 개수 출력
        }
    }    
}
