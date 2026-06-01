public class ArrayQuiz6 {
    public static void main(String[] args) {
        int[][] a = {
            {3,2,3}, {4,5,6}, {1,4,9}
        };

        int[][] b = {
            {1,8,7}, {6,4,4}, {3,2,3}
        };

        int add = 0; // 두 개의 배열의 합한 값을 넣어줄 정수형 변수
        int[][] c = new int[3][3]; // a배열과 b배열의 값을 합한 값을 넣을 배열

        // a배열
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                add += a[i][j] + b[i][j]; // int add값에는 a배열의 0번쨰 행, 0번째 열에 있는 값과 b배열의 0번째 행, 0번째 열에 있는 값을 더한 값을 대입
                c[i][j] += add; // add값을 c배열에 대입
                if (j == 2) { // j값이 2이면
                    System.out.print(c[i][j] + "\n");    // 줄바꿈
                } else {
                    System.out.print(c[i][j] + "\t"); // 탭
                }
                
                add = 0; // 누적으로 더해지는 것을 방지하기 위해 add 값을 0으로 초기화
            }
        }
    }
}
