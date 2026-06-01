public class MethodQuiz7 {

static int findMin(int[] m) {
    int min = m[0];
    for(int i = 0; i < m.length; i++) {
        if(min > m[i]) {
            min = m[i];
        }
    }

    return min;
}

    public static void main(String[] args) {
        // 배열 요소 중 가장 작은 값을 리턴하는 메서드를 구현하세요
        int[] m = { 21, 32, 31, 14, 51, 26, 37, 82, 19 };
        int result = findMin(m);
        System.out.println("result : " +result);
    }
}
