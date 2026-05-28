public class ArrayQuiz7 {
    public static void main(String[] args) {
        int [][] m = new int[5][5];
        int num = 0; // 배열 m에 들어갈 정수를 담을 임시변수

        for(int j = 0; j < m.length; j++) {
            for(int k = 0; k < m[j].length; k++) {
                m[j][k] += num + 1;
                if (k == 4) {
                    System.out.print(m[j][k] + "\n");    
                } else {
                    System.out.print(m[j][k] + "\t");
                }
                num++; // 출력이 끝나면 1씩 더하기
            }
        }
    }    
}
