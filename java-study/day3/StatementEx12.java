public class StatementEx12 {
    public static void main(String[] args) {
        System.out.println("화요일은 \n 야구 \t 하는 날");

        int year = 2026;
        int month = 5;
        int day = 26;

        System.out.println("오늘은" + year + "년 " + month + "월 " + day +"일 입니다.");
        System.out.printf("오늘은 %d년 %d월 %d일 입니다.\n", year, month, day);

        String country = "한국";
        int hours = 14;
        int minutes = 13;
        int seconds = 50;

        System.out.println(country + " 시간은 " + hours + "시 " + minutes + "분 " + seconds + "초 입니다.");
        System.out.printf("%s 시간은 %d시 %d분 %d초 입니다.", country, hours, minutes, seconds);

    }
}
