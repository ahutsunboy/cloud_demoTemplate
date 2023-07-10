package com.test.service;

import com.test.vo.UserBorrowDetail;

/**
 * @Author : Scott Chen
 * @create 2023/7/10 19:31
 */

public interface BorrowService {
    UserBorrowDetail  getUserBorrowDetailByUid(Integer uid);
}
