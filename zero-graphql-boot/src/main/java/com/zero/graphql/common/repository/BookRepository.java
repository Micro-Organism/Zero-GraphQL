package com.zero.graphql.common.repository;

import com.zero.graphql.common.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface BookRepository extends CrudRepository<Book, Integer> {
    Book findBookByName(String name);
}
