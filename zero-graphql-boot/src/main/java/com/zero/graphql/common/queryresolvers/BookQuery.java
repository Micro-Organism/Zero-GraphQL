package com.zero.graphql.common.queryresolvers;

import com.zero.graphql.common.model.Author;
import com.zero.graphql.common.model.Book;
import com.zero.graphql.common.repository.AuthorRepository;
import com.zero.graphql.common.repository.BookRepository;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class BookQuery implements GraphQLQueryResolver{

    @Autowired
    BookRepository bookRepository;

    @Autowired
    AuthorRepository authorRepository;

    public Iterable<Book> allBook(){
        return bookRepository.findAll();
    }

    public Book getBookByName(String name){
        return bookRepository.findBookByName(name);
    }

    public Iterable<Author> allAuthor(){
        return authorRepository.findAll();
    }

}
