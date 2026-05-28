public class ArrayQuiz11 {
    public static void main(String[] args) {
        // arr2 배열 중에서 50인 곳의 인덱스 값을 출력

        int[] arr2 = {10, 50, 60, 30, 12};
        int index = 0;

        for(int i = 0; i < arr2.length; i++) {
            if (arr2[i] == 50) {
                index += i;
            }
        }

        System.out.println("arr2 배열에서 값이 50인 곳의 인덱스는 " + index + "번입니다.");

    }
}
