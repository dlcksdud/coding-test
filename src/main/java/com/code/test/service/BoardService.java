package com.code.test.service;

import com.code.test.vo.Board;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;


public interface BoardService {

    ResponseEntity<?> saveBoard(Board board);

    ResponseEntity<?> editBoard(HashMap<String, Object> map, String num);
}
