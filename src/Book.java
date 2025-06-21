public class Book {
    private String name;
    private Author author;
    private int releaseYear;

    public Book(String name, Author author, int releaseYear) {
        this.name = name;
        this.author = author;
        this.releaseYear = releaseYear;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return name + " " + author.toString() + " (" + releaseYear + ")";
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }

        Book b2 = (Book) other;
        return (name.equals(b2.name) && author.equals(b2.author) && releaseYear == b2.releaseYear);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, author, releaseYear);
    }
}
