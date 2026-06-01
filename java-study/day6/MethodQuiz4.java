public class MethodQuiz4 {

// 1형식의 메서드
static void hello() {
    System.out.println("안녕하세요");
}

// 2형식 메서드
static void printName(String name) {
    System.out.println(name);
}

// 3형식 메서드
static int getNumber() {
    return 100;
}

// 4형식 메서드
static int add(int a, int b) {
    return a+b;
}

    public static void main(String[] args) {
        // Method 호출 방법에 따른 분류는?

        // 1형식 ~ 4형식은 메서드의 형태를 분류한 것

        // 1형식 (매개변수 X, 반환값 X)
        hello();

        // 2형식 (매개변수 O, 반환값 X)
        printName("Woojin");

        // 3형식 (매개변수 X, 반환값 O)
        int result = getNumber();
        System.out.println(result);

        // 4형식 (매개변수 O, 반환값 O)
        int result2 = add(10, 20);
        System.out.println(result2);

        System.out.println("메서드의 형식 분류는 매개변수와 반환값의 유무에 따라 나눈 것이다\n Call by Value와 Call by Reference는 메서드 호출 시 데이터를 전달하는 방식을 의미하며\n자바는 기본적으로 Call by Value 방식을 사용하며\b매개변수에 전달된 값은 복사되어 전달된다.");
        System.out.println("======================================");
        System.out.println("Call by Value : 메서드 호출 시 값 전달 방식\n Call by Reference : 메서드 호출 시 참조 전달 방식.");
        
    }
}
