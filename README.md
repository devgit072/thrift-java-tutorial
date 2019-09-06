<h4>What is Apache Thrift</h4>
It is RPC framework which can be used to create cross platform client-server applications. Cross platform is achieved by 
Thrift IDL(Interface Definition Language). IDL is used as common language which is used for communnication 
between client and server which are implemented in different language.IDL are defined in .thrift file.  </br>  
In IDL(i.e .thrift file) we mention: List of functions and variable type.
Client will know what are list of functions available and Server will have to implement those functions.
IDL can be best understood as contract file.
Thrift was first developed by Facebook and later adopted by Apache.</br>
Alternative of Thrift is Protobuf which has become quite popular and should be preferred on Apache Thrift
</br></br>

We are going to create client-server example in Java and Thrift. We will put ample comments to make code self-documenting.
</br>
Now lets get practical</br>
<h5>How to install thrift</h5>
Simple!!
<code> brew install thrift </code> </br>

 