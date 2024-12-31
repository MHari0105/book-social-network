package com.demo.project.service;

import com.demo.project.request.BookRequest;
import com.demo.project.response.BookResponse;
import com.demo.project.response.PageResponse;
import org.springframework.security.core.Authentication;

public interface BookService {

    Integer saveBook(BookRequest request, Authentication connectedUser);
    BookResponse findById(Integer bookId);
    PageResponse<BookResponse> findAllBooks(int page, int size, Authentication connectedUser);

}
