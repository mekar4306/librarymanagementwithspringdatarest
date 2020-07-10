package com.karadayi.librarymanagement.repos;

import java.util.List;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.karadayi.librarymanagement.entities.Book;

public interface BookRepository extends PagingAndSortingRepository<Book, Long> {

	
			List<Book> findByName(@Param("name") String name);
}
