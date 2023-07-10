package com.test.service.Impl;

import com.test.mapper.BorrowMapper;
import com.test.pojo.Book;
import com.test.pojo.Borrow;
import com.test.pojo.User;
import com.test.service.BorrowService;
import com.test.vo.UserBorrowDetail;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author : Scott Chen
 * @create 2023/7/10 19:31
 */

@Service
public class BorrowServiceImpl implements BorrowService {

    @Resource
    private BorrowMapper borrowMapper;

    @Override
    public UserBorrowDetail getUserBorrowDetailByUid(Integer uid) {
        List<Borrow> borrowList = borrowMapper.getBorrowsByUid(uid);
        RestTemplate restTemplate = new RestTemplate();

        List<Book> bookList = borrowList.stream()
                .map(borrow ->
                        restTemplate.getForObject("http://127.0.0.1:8201/book/" + borrow.getBid(), Book.class))
                            .collect(Collectors.toList());
        User user = restTemplate.getForObject("http://127.0.0.1:8101/user/" + uid, User.class);

        return new UserBorrowDetail(user,bookList);
    }
}
