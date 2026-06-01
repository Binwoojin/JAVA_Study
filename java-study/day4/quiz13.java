import java.util.Scanner;

public class quiz13 {
    public static void main(String[] args) {
        // 사용자로부터 키를 입력 받고 입력받은 키가 150 이상이면 "놀이기구 이용 가능", 
        // 150 미만이면 "부모와 함께 왔는지 한 번 더 확인" -> 함께 왔다면 1번을 입력받고, 혼자 왔다면 0번을 입력받는다
        // 1번 입력시 : 좋은 시간 보내렴~ | 0번 입력 : 어른 모시고 다시 오렴~

        System.out.println("현재 키를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();

        int check;
        String upper = "";
        String under = "";

        if (width >= 150) {
            System.out.println("놀이기구 이용 가능");
        } else {
            System.out.println("부모님과 함께 왔니?");
            check = sc.nextInt();

            if (check == 0) {
                System.out.println("어른 모시고 다시 오렴~");
            } else if (check == 1) {
                System.out.println("좋은 시간 보내렴~");
            } else {
                System.out.println("0과 1 로만 적어야 합니다. 다시 입력해주세요.");
            }
        }
    }    
}
