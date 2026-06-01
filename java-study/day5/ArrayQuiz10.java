import java.util.Scanner;

public class ArrayQuiz10 {
    public static void main(String[] args) {
        // 정수 10개를 입력 받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[10];

        for(int i = 0; i < arr1.length; i++) {
            System.out.println("아무 정수값을 입력하세요 : ");
            arr1[i] += sc.nextInt();
        }

        for(int i = 0; i < arr1.length; i++) { 
            if (arr1[i] % 3 == 0) {
                System.out.println("arr["+ i +"] = " + arr1[i] + "는 3의 배수입니다.");
            }
        }
        
    }
}
