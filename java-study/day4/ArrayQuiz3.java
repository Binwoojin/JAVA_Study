public class ArrayQuiz3 {
    public static void main(String[] args) {
        int[] k = {13, 7, 12, 9, 10};
        int max = k[0];

        for (int i = 0; i < k.length; i++) {
            if(k[i] > max) {
                max = k[i];
            }
        }

        System.out.println("최대값 : " + max);
    }
}
