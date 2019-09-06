package com.devraj.thrift.impl;

import org.apache.thrift.TException;

public class BookServiceImpl implements BookService.Iface {

    public Book saveBook(Book book) throws InvalidBookException, TException {
        System.out.println("Saved book succesfully");
        return book;
    }
}
