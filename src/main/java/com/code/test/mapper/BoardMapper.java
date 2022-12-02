package com.code.test.mapper;

import com.code.test.vo.Board;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.http.ResponseEntity;

import javax.annotation.Resource;

@Mapper
@Resource
public interface BoardMapper {

    int saveBoard(Board board);

    int editBoard(String title, String content, String num);
}
