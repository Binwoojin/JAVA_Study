public class VarEx3 {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 50;

        System.out.println("b1 : " + b1);
        System.out.println("b2 : " + (b2 - 30));

        short sh1 = 12812;

        sh1 = b2; // b2의 변수가 가지고 있는 값을 sh1 변수에 할당

        // 이와 같이 작은 자료형을 큰 자료형으로 변환하는 것을 형변환(promotion)이라고 한다.
        // 반대로 큰 자료형을 작은 자료형으로 변환하려는 것을 demention 이라고 한다. (캐스트 연산자)
        // 캐스트 연산자 형식 : (자료형) 캐스트연산자
        b1 = (byte)sh1;
        System.out.println(sh1);
        System.out.println(b1);
    }
}