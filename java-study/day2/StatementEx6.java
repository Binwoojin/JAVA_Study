public class StatementEx6 {
    public static void main(String[] args) {
        // for문은 횟수가 명확할 떄 쓰면 좋음
        for (int i = 1; i <= 9; i++) {
            System.out.println("3 * " + i + " = " + (3*i));
        }
        System.out.println("---------------------------------");

        // while문은 사용자가 계속 버튼을 누른 상황에서 쓰면 좋음 while(조건) { 문장1; 문장2; }
        int j = 1; // 우선 변수를 선언해야함
        while(j <= 9) { // while의 조건 부분에는 for문에 작성했던 조건식을 넣어준다
            System.out.println("3 x " + j + " = " + (3 * j)); // 출력값은 동일함
        }

        System.out.println("---------------------------------");

        // do while문은 초기화작업을 반드시 한 번 수행해야 하는 경우에 쓰면 좋음 do { 문장1; 문장2; } while(조건문);

        int k = 1; // 앞에서 while문에서도 따로 변수를 선언해주었듯이 do while문에서도 사용하기 전에 변수를 선언해줘야 한다.
        do {
            System.out.println("3 x " + k + " = " + (3 * k));
            k++;

            // 출력값
            // 증감식

        } while(k <= 9); // while의 조건에는 조건식을 넣어준다.
    }
}
