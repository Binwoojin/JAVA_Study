public class MethodQuiz6 {
    
    static int findMax(int[] m) {
        int max = m[0];
        for(int i = 0; i < m.length; i++) {
            if(max < m[i]) {
                max = m[i];
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        // 배열 요소 중 가장 큰 값을 리턴하는 메서드를 구현
        int[] m = { 21, 32, 31, 14, 51, 26, 37, 82, 19 };
        int result = findMax(m);
        System.out.println("result : "+result);


    }
}
