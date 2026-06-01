public class ArrayQuiz5 {
    public static void main(String[] args) {
        int[] k = {13, 7, 12, 9, 10}; // 배열 선언
        int total = 0; // 배열값의 총합 저장 변수
        int count = 0; // 홀수 개수 저장 변수
        boolean found = false; // 특정값 찾았는지 저장할 변수

        for(int i = 0; i<k.length; i++) {
            if(i % 2 == 0) { // 배열의 값을 2로 나눴을 때 나머지가 0이면 ( 짝수 )
                total += k[i]; // 해당 배열값(짝수값) 누적
            }
        }

        for(int i = 0; i < k.length; i++) {
            if(k[i] % 2 == 1) { // 현재 배열 값이 홀수이면
                count++; // 홀수 개수 증가
            }
        }

        for(int i = 0; i < k.length; i++) {
            if(k[i] == 9) { // 배열값에 9라는 값이 있으면
                found = true; // found의 값을 false에서 true로 변경
            }
        }

        System.out.println("짝수번째 요소의 합계 : " + total);
        System.out.println("홀수번째 요소의 개수 : " + count);

        if(found) { 
            System.out.println("해당 배열에 9가 존재합니다.");
        } else {

            System.out.println("해당 배열에 9가 존재하지 않습니다.");
        }

        for(int i = k.length-1; i >= 0; i--) { // 역순으로 출력 (4 -> 0 순으로 출력)
            System.out.print(k[i] + ", ");
        }
        System.out.println();
    }
}
