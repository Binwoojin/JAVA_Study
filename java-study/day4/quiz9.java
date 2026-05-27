public class quiz9 {
    public static void main(String[] args) {
        // 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력 (이중 for문을 활용)
        for (int i = 1; i <= 6; i++) { // 주사위 1의 1부터 6 반복
            for (int j = 1; j <= 6; j++) { // 주사위 2의 1부터 6 반복
                if (i + j == 6) { // 주사위 1의 눈과 주사위 2의 눈의 합이 6이면
                    System.out.println("주사위 1 : " + i + " , 주사위 2 : " + j); // 경우의 수 출력
                }
            }
        }
    }    
}
