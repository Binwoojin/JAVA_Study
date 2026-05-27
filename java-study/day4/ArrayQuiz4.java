public class ArrayQuiz4 {
    public static void main(String[] args) {
        int[] k = {13, 7, 12, 9, 10};
        int max = k[0];
        int index = 0;

        for (int i = 0; i < k.length; i++) {
            if(k[i] > max) {
                max = k[i];
                index = i;
            }
        }

        System.out.println("최대값이 위치한 위치값 : k[" + index + "]");
        System.out.println("k[" + index + "]의 값 : " + max);
    }
}
