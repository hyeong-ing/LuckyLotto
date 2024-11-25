package com.LottoWeb.LuckyLotto.DB;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

public interface BoardRepository extends JpaRepository<Comment, Long> {

    List<Comment> findAllByOrderByIdDesc(Pageable pageable);

}
