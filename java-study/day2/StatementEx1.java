public class StatementEx1 {
    public static void main(String[] args) {
        // System.out.println("1111111");
        // System.out.println("2222222");
        // System.out.println("3333333");


        // 제어문과 반복문

        // 반복문(for)
        // for(초기식; 조건식; 증감식) { 반복실행될 코드; }

        for(int i = 1; i<10; i++) {
            System.out.println("3 x "+ i + " = " + (3*i));
        }
        System.out.println("반복문 탈출~");

        // 초기식 : for문에서 사용될 변수에 초기값을 할당 (int i = 1;)
        // 조건식 : 조건식의 결과값은 논리값 (i<10)
                // 조건식의 결과값이 true일 경우, { 실행될 코드 } 를 진행
                // 조건식의 결과값이 false일 경우, 완전히 빠져 나감
        // 증감식 : (i++)

        // System.out.println("3 x 1 = " + a);
        // System.out.println("3 x 2 = " + (a*2));
        // System.out.println("3 x 3 = " + (a*3));
        // System.out.println("3 x 4 = " + (a*4));
        // System.out.println("3 x 5 = " + (a*5));
        // System.out.println("3 x 6 = " + (a*6));
        // System.out.println("3 x 7 = " + (a*7));
        // System.out.println("3 x 8 = " + (a*8));
        // System.out.println("3 x 9 = " + (a*9));
    }
}
