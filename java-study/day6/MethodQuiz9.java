import java.util.Arrays;

public class MethodQuiz9 {

    static void sort(int[] m) {
        for(int i = 0; i < m.length - 1; i++) {
            for(int j = 0; j < m.length - 1; j++) { // Question No.1 : 이중 fo네문에 m.length 길이에서 왜 -1을 해야하는가?
                if(m[j] > m[j+1]) {
                    int temp = m[j];
                    m[j] = m[j+1];
                    m[j+1] = temp;
                }
            }
        }
    }

    // Question No.1의 답변
    // if문에 j+1을 사용하고 있기 때문에 마지막 인덱스까지 반복하게 되면 배열 범위를 벗어나게 되어 "ArrayIndexOutBoundsException"이라는 에러가 발생함
    // 따라서, m.length - 1까지만 반복해야 한다.
    
    public static void main(String[] args) {
        // 배열 요소를 정렬하는 메서드를 구현하세요 ( 버블 소트, 정렬 알고리즘 사용 )

        int[] m = { 21, 32, 31, 14, 51, 26, 37, 82, 19 };
        sort(m);
        System.out.println(Arrays.toString(m));
    }
}
