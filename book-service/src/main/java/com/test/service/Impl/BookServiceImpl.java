package com.test.service.Impl;

import com.test.mapper.BookMapper;
import com.test.pojo.Book;
import com.test.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author : Scott Chen
 * @create 2023/7/10 19:04
 */
@Service
public class BookServiceImpl implements BookService {
    @Resource
    private BookMapper bookMapper;

    @Override
    public Book getBookById(Integer bid) {
        return bookMapper.getBookById(bid);
    }
}
