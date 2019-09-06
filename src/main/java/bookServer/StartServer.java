package bookServer;

import com.devraj.thrift.impl.BookService;
import com.devraj.thrift.impl.BookServiceImpl;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.apache.thrift.transport.TTransportException;

public class StartServer {

    private TServer server;

    public void start() throws TTransportException {
        TServerTransport serverTransport = new TServerSocket(9090);
        server = new TSimpleServer(new TServer.Args(serverTransport)
        .processor(new BookService.Processor<>(new BookServiceImpl())));

        System.out.println("Starting the book service on port 9090...");
        server.serve();
        System.out.println("BookService is running on port 9090...");
    }

    public void stop() {

        if (server != null && server.isServing()) {
            System.out.println("Stopping the server....");
            server.stop();
            System.out.println("Stopped the server....");
        }
    }

    public static void main(String[] args) throws TTransportException {
        new StartServer().start();
    }
}
