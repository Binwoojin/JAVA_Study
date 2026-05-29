public class MethodQuiz8 {

    // 첫 번째 minus
    static int minus(int a, int b) {
        return a-b;
    }

    // 두 번째 minus
    static float minus(float a, int b) {
        return a-b;
    }

    // 세 번째 minus
    static double minus(int a, double b) {
        return a-b;
    }

    // 네 번째 minus
    static float minus(float a, float b) {
        return a-b;
    }

    // 다섯 번째 minus
    static double minus(double a, float b) {
        return a-b;
    }

    public static void main(String[] args) {
        // minus method를 Overloading 시켜주세요

        System.out.println(minus(300, 100));
        System.out.println(minus(300.0f, 100));
        System.out.println(minus(300, 100.0d));
        System.out.println(minus(300.0f, 100.0f));
        System.out.println(minus(300.0d, 100.0f));
    }
}
