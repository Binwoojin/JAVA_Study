public class ArrayQuiz5 {
    public static void main(String[] args) {
        int[] k = {13, 7, 12, 9, 10};
        int total = 0;
        int count = 0;
        boolean found = false;

        for(int i = 0; i<k.length; i++) {
            if(i % 2 == 0) {
                total += k[i];
            }
        }

        for(int i = 0; i < k.length; i++) {
            if(k[i] % 2 == 1) {
                count++;
            }
        }

        for(int i = 0; i < k.length; i++) {
            if(k[i] == 9) {
                found = true;
            }
        }

        System.out.println("짝수번째 요소의 합계 : " + total);
        System.out.println("홀수번째 요소의 개수 : " + count);

        if(found) {
            System.out.println("해당 배열에 9가 존재합니다.");
        } else {

            System.out.println("해당 배열에 9가 존재하지 않습니다.");
        }

        for(int i = k.length-1; i >= 0; i--) {
            System.out.print(k[i] + ", ");
        }
        System.out.println();
    }
}
