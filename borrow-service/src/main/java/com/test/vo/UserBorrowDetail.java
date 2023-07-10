package com.test.vo;

import com.test.pojo.Book;
import com.test.pojo.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author : Scott Chen
 * @create 2023/7/10 19:23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserBorrowDetail {

    User user;
    List<Book> bookList;
}
