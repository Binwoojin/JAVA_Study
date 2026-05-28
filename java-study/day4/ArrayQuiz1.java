public class ArrayQuiz1 {
    public static void main(String[] args) {
        // 배열의 합 구하기
        // 정수형 배열 k 13,7,12,9,10 의 모든 값을 더하여 합계 출력
        // 정수형 배열 k 13,7,12,9,10 의 평균값 출력

        int[] k = {13, 7, 12, 9, 10};
        int total = 0;
        int avg = 0;


        // 1번 
        for (int i = 0; i < k.length; i++) {
            total += k[i];
        }
        System.out.println("정수형 배열 k의 합 : " + total);

        System.out.println("------------------------");

        // 2번
        for (int i = 0; i < k.length; i++) {
            total += k[i];
        }
        avg = total / k.length;
        System.out.println("정수형 배열 k의 평균값 : " + avg);
    }
}
