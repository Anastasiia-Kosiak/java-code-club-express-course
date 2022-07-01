package lesson.four;

public class Book {
    // конструктор -
    // дефолтний
    // поля
    // private - приватні
    private String title; // назва
    private String author; // автор
    private String genre; // жанр
    private int year; // рік, коли книжку видали

    public Book() { // конструктор
        // конструктор без параметрів
    }

    public Book(String author, String title, String genre, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
        this.genre = genre;
    }
    // гетери - get (отримувати) -
    public String getTitle() { // гетер для title
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    // сетери - set (встановлювати)

    public void setTitle(String title) {
        // this - цей
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displayBookInfo() {
        System.out.println(title + ", написана " + author + " і видана " + year);
        //
    }
}
