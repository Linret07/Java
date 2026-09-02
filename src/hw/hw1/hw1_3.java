package hw.hw1;

class Book {
    private String title;
    private int id;
    private int numberOfPages;
    private String author;
    private int year;

    public Book(String title, int year, String author, int numberOfPages, int id) {
        this.title = title;
        this.year = year;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
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

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
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
                ", numberOfPages=" + numberOfPages +
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
