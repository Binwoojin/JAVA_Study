public class MethodQuiz1 {
    public static void main(String[] args) {
        // 메서드 오버로딩 구현

        int result1 = plus(100, 400);
        System.out.println("result1 = "+result1);

        float result2 = plus(100, 200.0f, 300);
        System.out.println("result2 = "+result2);

        double result3 = plus(100, 300.0, 200);
        System.out.println("result3 = "+result3);
    }

    static int plus(int a, int b) {
        return a+b;
    }

    static float plus(int a, float b, int c) {
        return a+(int)b+c;
    }

    static double plus(int a, double b, int c) {
        return a+(int)b+c;
    }
}
