package com.code.test.mapper;

import com.code.test.vo.User;
import org.apache.ibatis.annotations.Mapper;

import javax.annotation.Resource;

@Resource
@Mapper
public interface UserMapper {

    User selectById(String id);
}
