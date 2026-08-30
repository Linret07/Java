package hw.hw1;

class Book {
    private String title;
    private int id;
    private int number_of_pages;
    private String author;
    private int year;

    public Book(String title, int year, String author, int number_of_pages, int id) {
        this.title = title;
        this.year = year;
        this.author = author;
        this.number_of_pages = number_of_pages;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getNumber_of_pages() {
        return number_of_pages;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumber_of_pages(int number_of_pages) {
        this.number_of_pages = number_of_pages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", id=" + id +
                ", number_of_pages=" + number_of_pages +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }
}
class BookTest {
    public static void main(String[] args) {
        Book book = new Book("The Great Gatsby", 1925, "F. Scott Fitzgerald", 180, 1);
        System.out.println(book);
    }
}
