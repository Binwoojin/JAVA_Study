public class Student {
    String name;
    String major;
    int age;

    public Student(String major, String name, int age) {
        this.major = major;
        this.name = name;
        this.age = age;
    }
    

    public void introduce() {
        System.out.println("안녕하세요 저는 " + major + " " + age + "살 " + name + "이라고 합니다.");
    }
}
