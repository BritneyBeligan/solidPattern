package solidPattern;

public class Library {
    public static void main(String[] args) {
        Student student = new Student();

        LibraryResource book = new Book("Effective Java");
        LibraryResource journal = new Journal("IEEE Transactions on Computers");
        LibraryResource eJournal = new EJournal("Nature E-Journal");

        student.borrowResource(book);
        student.borrowResource(journal);
        student.borrowResource(eJournal);
    }
}
