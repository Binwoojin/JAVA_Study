public class StatementEx9 {
    public static void main(String[] args) {
        int kor = 55;
        int eng = 90;
        int math = 70;
        
        int tot = 0;
        int avg = 0;

        tot = kor + eng + math;
        avg = tot / 3;

        System.out.println("당신의 총점은 " + tot);
        System.out.println("평균 점수는 " + avg + "입니다.");
}
}
