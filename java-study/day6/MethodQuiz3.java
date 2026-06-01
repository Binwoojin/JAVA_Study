public class MethodQuiz3 {

    static void printGuGuDan(int num1, int num2) {
        for(int i = num1; i <= num2; i++) {
            for(int j = 1; j <= 9; j++) {
            System.out.println(i + " x " + j + " = " + i*j);
            }
        }
    }

    public static void main(String[] args) {
        // 구구단 2단부터 6단까지 출력하는 메서드를 구현
        // printGuGuDan(2,6)
        printGuGuDan(2,6);
        
    }
}
