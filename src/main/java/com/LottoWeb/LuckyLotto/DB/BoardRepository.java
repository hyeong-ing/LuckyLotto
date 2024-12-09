package com.LottoWeb.LuckyLotto.DB;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface BoardRepository extends JpaRepository<Comment, Long> {
    Page<Comment> findAllByOrderByIdDesc(Pageable pageable);
}
