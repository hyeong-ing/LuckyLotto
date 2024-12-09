package com.LottoWeb.LuckyLotto.Service;

import com.LottoWeb.LuckyLotto.DB.BoardRepository;
import com.LottoWeb.LuckyLotto.DB.Comment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    private final BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    public void saveComment(String content) {
        if( content.length() >= 1 && content.length() <= 25 )
            boardRepository.save(new Comment(content));
    }


    public Page<Comment> get10Comments() {
        Pageable pageable = PageRequest.of(0,10);
        return boardRepository.findAllByOrderByIdDesc(pageable);
    }
}
