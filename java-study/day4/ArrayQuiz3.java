public class ArrayQuiz3 {
    public static void main(String[] args) {
        int[] k = {13, 7, 12, 9, 10}; // 배열 선언
        int max = k[0]; // 최대값 저장 변수

        for (int i = 0; i < k.length; i++) { // 배열 반복
            if(k[i] > max) { // 현재 값이 max보다 크면
                max = k[i]; // 최대값 변경
            }
        }

        System.out.println("최대값 : " + max);
    }
}
