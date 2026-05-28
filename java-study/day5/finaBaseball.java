import java.util.Scanner;

public class finaBaseball {
    public static void main(String[] args) {
        // 배열을 활용한 야구게임 만들기 (오늘까지 배운 내용으로 활용!)
        Scanner sc = new Scanner(System.in);
        int[] com = new int[3]; // 컴퓨터가 숫자 저장 배열

        // 컴퓨터 숫자 배열에 랜덤값 저장
        for(int i = 0; i < com.length; i++) {
            int random = (int)(Math.random() * 9) + 1; // 1~9 랜덤 숫자 생성
            boolean duplicate = false; // 랜덤값 중복 확인

            // 중복 검사
            for(int j = 0; j < i; j++) {
                if(com[j] == random) { // 이미 같은 숫자가 존재한다면
                    duplicate = true; // 중복 상태로 변경
                }
            }

            if(duplicate) { // 랜덤값이 중복이라면
                i--; // 다시뽑기 (현재 index를 다시 실행해서 새로운 랜덤값을 생성)
            } else {
                com[i] = random; // random으로 뽑은 값을 com 배열에 저장
            }
            
        }
 
        int[] user = new int[3]; // 사용자 입력 배열
        int count = 0; // 카운트

        while(true) {

            count++; // 카운트 증가

            // 사용자 입력
            for(int i = 0; i < user.length; i++) {
                System.out.println((i + 1) + "번째 숫자 입력 : "); // 첫번쨰, 두번쨰, 세번째 숫자 입력
                user[i] = sc.nextInt(); // 입력된 값을 user 배열에 대입
            }

            // strike | ball 체크
            int strike = 0; // 스트라이크 변수 선언
            int ball = 0; // 볼 변수 선언

            for(int i = 0; i < com.length; i++) { // com 배열
                for(int j = 0; j < user.length; j++) {
                    if(com[i] == user[j]) { // com 배열 값과 user 배열 값이 같다면
                        if (i == j) { // 숫자도 같고 위도 같다면
                            strike++; // 스트라이크 증가
                        } else { // 숫자는 같은데 위치가 다르면
                            ball++; // 볼 증가
                        }            
                    }
                        
                }
            }

            // 결과 출력

            System.out.println("Strike : " + strike);
            System.out.println("Ball : " + ball);

            if(strike == 3) { // 스트라이크 값이 3이면 아래 출력
                System.out.println(count + "번 만에 맞추셨습니다! 축하합니다!");
                break; // 종료
            }
        }
        
        
        
    }
}
