public class Main {
    public static void main(String[] args) {
       var author = new Author("Ivan", "Ivanov");
       var author1 = new Author("Ivan1", "Ivanov1");
       var author2 = new Author("Ivan2", "Ivanov2");
       var book1 = new Book("Book1", author, 1951);
       var book2 = new Book("Book2", author1, 1952);
       var book3 = new Book("Book3", author2, 1953);

        System.out.println(author);
        System.out.println(book1);
    }
}