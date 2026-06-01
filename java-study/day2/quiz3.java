public class quiz3 {
    public static void main(String[] args) {
        // 1부터 100까지 홀수값만 누적해서 출력
        // 결과값 : 1부터 100까지 홀수의 누적합 : (결과값)

        int total = 0;
        for (int i = 1; i<=100; i += 2) { // 증감식을 대입연산자를 활용해서 홀수, 짝수 구분 가능
             total += i;
        }

        System.out.println("1부터 100까지 홀수 누적값 : " + total);

        // 조건문과 반복문을 활용한 방법
        int sum = 0;

        for(int j = 1; j <=100; j++) {
            if( j % 2 == 1) { // 홀수는 2로 나눌 떄 나머지값이 나오기 떄문에 2로 나눴을 때 값이 1이라면, 이라는 조건문임
                sum += j;
            }
        }
        System.out.println("1부터 100까지 홀수의 누적합 : (for, if문)" + sum);
    }
}
