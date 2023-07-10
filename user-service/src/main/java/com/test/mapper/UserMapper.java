package com.test.mapper;

import com.test.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author : Scott Chen
 * @create 2023/7/10 18:12
 */
@Mapper
public interface UserMapper {

    User getUserbyId(Integer uid);
}
