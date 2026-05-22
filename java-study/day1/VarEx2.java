public class VarEx2 {
    public static void main(String[] args) {
        double m1 = Math.PI; // Math.PI - Java에서 기본으로 제공하는 원주율 상수

        System.out.printf("화면에 원주율은 %.3f 입니다.", m1); // double 값에서 특정 자리수만 출력하고자 할 경우, printf()를 사용함
        // %.3f에서 %는 출력 형식 시작, .3은 소수점 3자리까지, f는 실수(float or double)을 뜻함

        float height = 161.5f; // float의 소수점을 입력할 경우, 반드시 끝에 f를 입력해야 한다.
        float weight = 58.7f;
        String hobby = "음악감상";

        System.out.println("나의 키는" + height + "이며, 몸무게는 " + weight + "이고 취미는 " + hobby + "입니다.");
    }
}