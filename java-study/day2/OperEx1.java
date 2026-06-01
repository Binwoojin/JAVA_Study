public class OperEx1 {
    public static void main(String[] args) {
        // 증감연산자
        int a = 100;
        System.out.println(a);

        int b = 10;

        b++; // 동일한 표현 => b = b+1;
        b--; // 동일한 표현 => b = b-1;skawk

        System.out.println(b);

        System.out.println("-----------------");
        int c = 100;
        int d = 10;

        d = ++c;
        d = c++;

        System.out.println("c : " + c + "d : " + d);
    }
}