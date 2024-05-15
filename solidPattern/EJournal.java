package solidPattern;

public class EJournal implements LibraryResource{
    private String title;

    public EJournal(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void borrow() {
        System.out.println("Borrowing e-journal: " + title);
    }
}
