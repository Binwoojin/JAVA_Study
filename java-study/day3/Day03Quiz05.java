public class Day03Quiz05 {
    public static void main(String[] args) {
        int i = 0; // 시작 값 (for문에서 초기식에 해당)

        while( i < 10 ) { // 10 미만까지 반복 (for문에서 조건식에 해당)
            if ( i % 2 == 0) { // 짝수인지 검사
                System.out.println(i); // 짝수일 경우 출력 (for문에서 실행문에 해당)
            }
    
            i++; // 1씩 증가 (for문에서 증감식에 해당)
        }
    }
}
