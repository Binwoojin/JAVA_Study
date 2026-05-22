public class VarEx1 {
    public static void main (String[] args) {
        byte b1; // 자료형 변수명;
        b1 = 10; // b1이라는 변수에 10이라는 값을 할당 , = : 대입연산자(할당연산자)

        System.out.println(b1);
        // byte
        byte c1;
        c1 = -128;

        System.out.println(c1);

        // short
        short m1;
        m1 = -32768;

        System.out.println(m1);

        System.out.println("---------------------------");
        int age = 33; // 초기값 설정 | 반드시 값을 부야해서 초기값을 설정해야 한다
        // System.out.println(age);
        System.out.println("나의 나이는 " + age + "살 입니다."); // 여기서 사용된 +는 연결 연산자

        System.out.println("-----------------------------");
        int n = 30;
        System.out.println("10년 후에 나이는 " + (n + 10) +"입니다"); // 수식이 들어간 부분에 반드시 ( ) 괄호를 써서 수식을 넣어줘야 수식에 대한 결과값이 출력됨

    }
}