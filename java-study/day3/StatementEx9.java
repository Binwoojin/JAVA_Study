public class StatementEx9 {
    public static void main(String[] args) {
        int kor = 55;
        int eng = 90;
        int math = 70;
        
        int tot = kor + eng + math;
        float avg = tot / 3;

        System.out.println("당신의 총점은 " + tot);
        System.out.println("평균 점수는 " + avg + "입니다.");

        // 학점 출력

        if (avg >= 90) {
            System.out.println("A학점");
        } else if (avg >= 80) {
            System.out.println("B학점");
        } else if (avg >= 70) {
            System.out.println("C학점");
        } else if (avg >= 60) {
            System.out.println("D학점");
        } else if (avg >= 50) {
            System.out.println("E학점");
        } else {
            System.out.println("F학점");
        }
}
}
