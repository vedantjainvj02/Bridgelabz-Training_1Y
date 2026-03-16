import com.gla.library.Book;
import com.gla.library.Member;
import com.gla.library.Transaction;

public class MainApp {
    public static void main(String[] args) {
        Book b = new Book();
        Member m = new Member();
        Transaction t = new Transaction();

        b.addBook();
        m.registerMember();
        t.issueBook();
    }
}