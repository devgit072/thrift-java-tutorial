package bookClient;

import com.devraj.thrift.impl.Book;
import com.devraj.thrift.impl.BookService;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

public class BookClient {

    public static void main(String[] args) throws TException {
        TTransport tt = new TSocket("localhost", 9090);
        tt.open();

        TProtocol protocol = new TBinaryProtocol(tt);
        BookService.Client bookClient = new BookService.Client(protocol);

        Book book = new Book();
        book.name = "Deep Work";
        book.author = "Cal Newport";
        book.price = 9.7;
        book.totalPages = 314;
        Book savedBook = bookClient.saveBook(book);
        System.out.println("Book is created successfully: " +  savedBook.toString());
    }
}
