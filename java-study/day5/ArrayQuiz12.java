public class ArrayQuiz12 {
    public static void main(String[] args) {
        // 4*4 배열에서 가로의 합과 세로의 합을 구하시오 (기존 4*4 배열 + 총합이 같이 들어간 5*5 배열로 출력)
        int[][] a = {
            {1,4,5,10}, {3,2,6,11}, {4,1,2,7}, {8,7,13,28}
        };
        int[][] tot = new int[5][5];

        // tot 배열에 기존 배열 a의 값은 동일하게 출력 | 
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a.length; j++) {
                tot[i][j] = a[i][j]; // 기존 a 배열의 값 대입
                tot[i][4] += a[i][j]; // 가로행 총합
                tot[4][j] += a[i][j]; // 세로열 총합
                tot[4][4] += a[i][j]; // 전체 총합
            }
        }

        // 결과 출력
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++) {
                System.out.print(tot[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
