package com.test.controller;

import com.test.service.BorrowService;
import com.test.vo.UserBorrowDetail;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author : Scott Chen
 * @create 2023/7/10 19:27
 */
@RestController
public class BorrowController {

    @Resource
    private BorrowService borrowService;

    @GetMapping("/borrow/{uid}")
    public UserBorrowDetail getUserBorrowDetail(@PathVariable("uid") Integer uid){
        return borrowService.getUserBorrowDetailByUid(uid);
    }

}
