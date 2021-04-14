package com.test.aoptest.service;

import com.test.aoptest.repository.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookDao bookDao;

    public void findBookByTitle(String title) {
        System.out.println(bookDao.findBookByTitle(title));
    }
}
