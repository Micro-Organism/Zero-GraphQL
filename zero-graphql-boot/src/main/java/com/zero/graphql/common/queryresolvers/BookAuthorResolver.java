package com.zero.graphql.common.queryresolvers;

import com.zero.graphql.common.model.Author;
import com.zero.graphql.common.model.Book;
import com.zero.graphql.common.repository.AuthorRepository;
import graphql.kickstart.tools.GraphQLResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookAuthorResolver implements GraphQLResolver<Book> {

    @Autowired
    AuthorRepository authorRepository;

    public Author getAuthor(Book book){

        return authorRepository.findAuthorByBookId(book.getId());
    }
}
