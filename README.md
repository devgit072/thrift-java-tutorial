<h4>What is Apache Thrift</h4>
Apache Thrift is RPC framework which can be used to create cross platform client-server applications. Cross platform is achieved by 
Thrift IDL(Interface Definition Language). IDL is used as common language which is used for communnication 
between client and server which are implemented in different language.IDL are defined in .thrift file.  </br>  
In IDL(i.e .thrift file) we mention: Service and List of functions inside that service and all variable members.
Variable members can struct(similar like class) or primitive types.
Client will know what are list of functions available and Server will have to implement those functions.
IDL can be best understood as contract file.</br>
Thrift was first developed by Facebook and later adopted by Apache.</br>
Alternative of Thrift is Protobuf which has become quite popular and should be preferred over Apache Thrift
</br></br>

We are going to create client-server example in Java and Thrift.We will create a thrift based server which will do CRUD operation of Book. We will put ample comments to make code self-documenting. 
</br>
Now lets get practical</br>
#### Here are the steps how to create a thrift based RPC server and client call those RPC functions in Java:
1. How to install thrift on mac: Simple!! <code> brew install thrift </code> Check thrift version: `thrift --version` </br> 
2. Create Book.thrift file and define the BookService and list of function that will be implemented in that service. Also Book struct.
3. Generate the Java code corresponding to Book.thrift: `thrift -r -out src/main/data --gen java src/main/data/BookService.thrift` . src/main/data is out directory. This step will create all necessary server code and interface class. You only need to add the business logic for RPC functions.
4. Create a class: StartServer.java. Write the code for start and stop the server. Mention the port that you want your server to run on. Now call the start server function from any main function. Server is running now....
5. Create a client for BookService. Call the RPC function present in that service.

Thats it!!. You can go inside the code and try to understand how it is implemented.