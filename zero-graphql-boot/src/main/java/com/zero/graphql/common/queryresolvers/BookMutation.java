package com.zero.graphql.common.queryresolvers;

import com.zero.graphql.common.model.Book;
import com.zero.graphql.common.repository.BookRepository;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class BookMutation implements GraphQLMutationResolver {

    @Autowired
    BookRepository bookRepository;

    public Book newBook(String name, String pageCount){
        Book book =  new Book();
        book.setName(name);
        book.setPageCount(pageCount);
        return bookRepository.save(book);
    }

    public Book deleteBook(Integer id){
        Book deleteBook = new Book();
        Optional<Book> findBook =  bookRepository.findById(id);
        if(findBook.isPresent()){
            bookRepository.delete(findBook.get());
            deleteBook = findBook.get();
        }
        return deleteBook;
    }
}
