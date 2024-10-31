package com.zero.graphql.common.repository;

import com.zero.graphql.common.model.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface AuthorRepository extends CrudRepository<Author, Integer> {
    Author findAuthorByBookId(Integer bookId);
}