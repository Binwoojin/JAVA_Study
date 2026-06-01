import java.io.IOException; // 이건 throws IOException 작성 시 자동으로 써짐


public class StatementEx7 {
    public static void main(String[] args) throws IOException {
        // 사용자로부터 값을 입력받아서 출력
        // System.in.read(); // 이걸 사용하려면 메인 메소드 뒤에 "throws IOException"을 적어줘야 사용 가능

        System.out.println("입력(숫자만)");
        int dan = System.in.read(); // 여기에 입력한 값이 println으로 출력 시, ASCII 코드로 나옴

        dan -= 48; // 내가 원하는 숫자로 만들기 위해서
        System.out.println("dan : " + dan);


        // dan의 값을 받아서 for 문을 이용해 구구단 양식폼 출력
        
        for(int i =1; i<10; i++) {
            System.out.println(dan + " x " + i + " = " + (dan * i));
        }


        // 표준입력장치(키보드)로부터 입력받은 값의 ASCII 코드를 반환해주는 메서드가 "read()"

    
    }
}
