import java.io.IOException;

public class QuizDay1No4 {
    public static void main(String[] args) throws  IOException{
        // do while 문으로 하는게 좋아보임
        int num = 0;
        
        do {
            System.out.println("1. 회원가입");
            System.out.println("2. 로그인");
            System.out.println("3. 게시글 보기");
            System.out.println("0. 종료");

            System.out.println("메뉴선택:");
            num = System.in.read();
            num -= 48;
        } while (num != 0);

        System.out.println("드디어 0을 입력했꾸나!");
        
    }
}
