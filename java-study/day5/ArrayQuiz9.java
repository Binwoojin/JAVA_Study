public class ArrayQuiz9 {
    public static void main(String[] args) {
        // 길이가 100개인 int 타입 배열에 정수 1~100의 값을 대입 | 문제 4번
        // index의 값이 3의 배수면 "3333", 5의 배수면 "5555", 3과 5의 공배수는 "3535"를 대입해서 출력 | 문제 5번

        int[] arr = new int[100];
        for(int i = 0; i < arr.length; i++) {
            arr[i] += i+1;
            if(arr[i] % 3 == 0 && arr[i] % 5 == 0) { // 공배수를 먼저 출력해야 함
                System.out.println(arr[i] + " (3535)");
            } else if (arr[i] % 3 == 0) {
                System.out.println(arr[i] + " (5555)");
            } else if (arr[i] % 5 == 0) { 
                System.out.println(arr[i] + " (3535)");
            } else {
                System.out.println(arr[i]);
            }
        }
        

    }
}
