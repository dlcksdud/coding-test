package com.code.test.service;

import com.code.test.mapper.BoardMapper;
import com.code.test.vo.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardMapper boardMapper;


    @Override
    public ResponseEntity<?> saveBoard(Board board) {
        if(boardMapper.saveBoard(board) < 0) {
            return ResponseEntity.status(400).body(boardMapper.saveBoard(board));
        }
        return ResponseEntity.ok(boardMapper.saveBoard(board));
    }

    @Override
    public ResponseEntity<?> editBoard(HashMap<String, Object> map, String num) {
        String title = (String) map.get("title");
        String content = (String) map.get("content");

        if(boardMapper.editBoard(title, content, num) < 0) {
            return ResponseEntity.status(400).body(boardMapper.editBoard(title, content, num));
        }
        return ResponseEntity.ok(boardMapper.editBoard(title, content, num));
    }
}
