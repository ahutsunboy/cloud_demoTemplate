package com.test.controller;

import com.test.mapper.BookMapper;
import com.test.pojo.Book;
import com.test.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author : Scott Chen
 * @create 2023/7/10 19:04
 */
@RestController
public class BookController {

    @Resource
    private BookService bookService;

    @GetMapping("/book/{bid}")
    public Book getBookById(@PathVariable("bid")Integer bid){
        return bookService.getBookById(bid);
    }
}
