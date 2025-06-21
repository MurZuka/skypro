public class Main {
    public static void main(String[] args) {
        Author auth1 = new Author("Александр", "Пушкин");
        Author auth2 = new Author("Михаил", "Лермонтов");

        Book book1 = new Book("Евгений Онегин", auth1, 1829);
        Book book2 = new Book("Мцыри", auth2, 1832);

        book1.setReleaseYear(1827);
    }
}