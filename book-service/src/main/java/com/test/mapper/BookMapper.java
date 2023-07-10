package com.test.mapper;

import com.test.pojo.Book;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author : Scott Chen
 * @create 2023/7/10 19:02
 */
@Mapper
public interface BookMapper {
    Book getBookById(Integer bid);
}
