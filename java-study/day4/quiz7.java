public class quiz7 {
    public static void main(String[] args) {
        // 1부터 20 미만의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 출력
        int total = 0; // 총합 저장 변수 선언
        for (int i = 1; i < 20; i++) { // 1부터 20 미만까지 반복
            if (i % 2 != 0 && i % 3 != 0) { // 2의 배수도 아니고 (i % 2 != 0) 3의 배수도 아닐 때 (i % 3 != 0)
                total += i; // total에 값 누적
            }
        }
        System.out.println(total); // 최종 결과 출력
    }    
}
