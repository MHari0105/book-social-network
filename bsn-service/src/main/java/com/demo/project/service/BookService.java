package com.demo.project.service;

import com.demo.project.dto.BookRequest;
import com.demo.project.dto.BookResponse;
import org.springframework.security.core.Authentication;

public interface BookService {

    Integer saveBook(BookRequest request, Authentication connectedUser);
    BookResponse findById(Integer bookId);

}
