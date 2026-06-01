public class MethodQuiz2 {

    // 정수 2개를 더하는 메서드
    static int hap(int a, int b) {
        return a+b;
    }

    // 정수 3개를 더하는 메서드
    static int hap(int a, int b, int c) {
        return a+b+c;
    }
    public static void main(String[] args) {
        // Method Overloading이란 무엇이며, 어떤 방법으로 하는가?
        // 메서드 이름은 같지만, 매개 변수의 개수 또는 자료형을 다르게 하여 여러 개의 메서드를 만드는 것

        System.out.println(hap(10, 20)); // 2개의 매개변수를 가진 hap 호출
        System.out.println(hap(10, 20, 30)); // 3개의 매개변수를 가진 hap 호출
        System.out.println("===================");

        System.out.println("Method Overloading은 동일한 이름의 메서드를 여러 개 정의하는 기법이다.\n메서드 이름이 같아야 하며, 매개변수의 개수나 자료형을 다르게 하여 구현한다\n이를 통해 같은 기능을 다양한 형태로 사용할 수 있으며,\n반환타입만 다른 경우에는 Method Overloading이 성립하지 않는다.");
    }
    
}
