public class StatementEx3 {
    public static void main(String[] args) {
        // 1부터 100까지 누적합을 화면에 출력

        int temp = 0;

        for(int i = 1; i<=100; i++) {
            temp += i;
        }
        System.out.println("1부터 100까지 누적된 값 : " + temp);
    }
}
