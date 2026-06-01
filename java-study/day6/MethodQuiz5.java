public class MethodQuiz5 {
    static void shuffle(int[] m) { // Question No.1 : 여기서 왜 static int가 아닌 static void를 써야 하는가?

        for(int i = 0; i < 1000; i++) { // 1000번 반복

            // 랜덤 인덱스 생성
            int idx1 = (int)(Math.random() * m.length);
            int idx2 = (int)(Math.random() * m.length); //  Question No.2 : 위치 값 교환 때문에 무조건 인덱스를 2개를 설정해야 하는 것인가?

            // 두 위치의 값을 교환
            int temp = m[idx1];
            m[idx1] = m[idx2];
            m[idx2] = temp;
        }

    }

    // Quetsion No.1의 답변
    // void는 반환값이 없는 메서드에 사용함, shuffle() 메서드는 배열의 요소를 섞는 작업만 수행하며,
    // 별도의 결과값을 반환할 필요가 없기 때문에 void를 사용한다.

    // Question No.2의 답변
    // 배열의 요소를 교환(즉 Swap)하기 위해서는 두 개의 위치가 필요함
    // 따라서 shuffle 메서드에는 idx1, idx2 두 개의 랜덤 인덱스를 생성해서 서로 다른 위치의 값을 교환한다.
    // 배열의 요소를 여러 번 교환하면 배열이 무작위로 섞이게 된다.


    public static void main(String[] args) {
        // 다음 배열의 요소를 섞는 메소드를 구현
        // int[] m = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // shuffle(m) - 랜덤하게 두 요소의 값을 교환하는 코드 (1000번)
        int[] m = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        shuffle(m);

        for(int i = 0; i < m.length; i++) {
            System.out.print(m[i] + " ");
        }
    }    
}
