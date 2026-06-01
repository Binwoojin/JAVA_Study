public class quiz2 {
    public static void main(String[] args) {
        // 1부터 10까지 값 누적 출력
        int sum = 0;

        for(int i = 1; i<=10; i++) {
            sum = sum + i;
            System.out.println(sum);
        }

        System.out.println("-------------------------");

        // 디버거를 사용해서 i가 어떻게 변화되는지 확인
        for (int k = 1; k<=5; k++) {
            System.out.println(111*k);
        }
    }
}
