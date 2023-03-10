public class Book {
    private String name;

    private Author author;

    private int publishYear;

    public Book(String name, Author author, int publishYear) {
        this.name = name;
        this.author = author;
        this.publishYear = publishYear;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        if (publishYear >= 0) {
        this.publishYear = publishYear;
        }
    }
    @Override
    public String toString() {
        return "Book: " + name + " "  + author + " publishYear: " + publishYear;
    }
}
