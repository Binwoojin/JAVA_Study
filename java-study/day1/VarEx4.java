public class VarEx4 {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = 97; // ASCII Code "a" (ASCII : American Standard Code for Information Interchange)
        char c3 = '\u0061';

        System.out.println("c1 : " + c1);

        System.out.println("c2 : " + c2);
        System.out.println("c3 : " + c3);


        System.out.println("--------------------------");

        char a1 = 'j';
        char a2 = 97;
        char a3 = '\u0076';
        char a4 = 'a';

        System.out.println(""+ a1 + a2 + a3 + a4); // 각 글자의 아스키 코드 값을 숫자로 변환한 후에 계산된 값인 418이 출력됨
        // 문자만 출력하려면 앞에 ""+ 를 적어줘야 함

        String str = "java";

        System.out.println(str);
    }
}