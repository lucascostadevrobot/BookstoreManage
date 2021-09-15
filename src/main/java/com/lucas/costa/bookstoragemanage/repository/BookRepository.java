package com.lucas.costa.bookstoragemanage.repository;

import com.lucas.costa.bookstoragemanage.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface BookRepository extends JpaRepository<Book, Long> {
}
