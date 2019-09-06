namespace java com.devraj.thrift.impl

/*
A sample example can be seen here: https://github.com/apache/thrift/blob/master/tutorial/tutorial.thrift
regarding how to write a thrift file
*/

exception InvalidBookException {
    1: i32 code,
    2: string message
}

struct Book {
    1: string name
    2: i32 totalPages
    3: string author
    4: double price
    5: optional string publisher
}

/*
Mention the name of service that you gonna create.
Also mention list of RPC method that this service has implemented.
*/

service BookService {
    Book saveBook(Book book) throws (1:InvalidBookException e)
}