package com.code.test.controller;

import com.code.test.service.BoardService;
import com.code.test.vo.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RequestMapping("/test/board")
@RestController
public class BoardController {

    @Autowired
    private BoardService boardService;

    @PostMapping("/save")
    public ResponseEntity<?> saveBoard(@RequestBody Board board) {

        return boardService.saveBoard(board);
    }

    @PutMapping("/edit/{num}")
    public ResponseEntity<?> editBoard(@PathVariable("num") String num, @RequestBody HashMap<String, Object> map) {

        return boardService.editBoard(map, num);
    }
}
