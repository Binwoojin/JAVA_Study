public class Book {
    String title;
    String author;
    int page;

    public Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    public void read(int pages) {
        int result = page - pages;
        System.out.println(title + "을(를) " + result + "까지 읽었습니다.");
    }
}
