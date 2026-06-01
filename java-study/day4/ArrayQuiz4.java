public class ArrayQuiz4 {
    public static void main(String[] args) {
        int[] k = {13, 7, 12, 9, 10}; // 배열 선언
        int max = k[0]; // 최대값 저장 변수
        int index = 0; // 최대값 위치 저장 변수

        for (int i = 0; i < k.length; i++) {
            if(k[i] > max) {
                max = k[i]; // 최대값 변경
                index = i; // 인덱스값 변경
            }
        }

        System.out.println("최대값이 위치한 위치값 : k[" + index + "]");
        System.out.println("k[" + index + "]의 값 : " + max);
    }
}
