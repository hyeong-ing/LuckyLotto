package com.LottoWeb.LuckyLotto.DB;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor (access = AccessLevel.PROTECTED)
@Table(name = "Comment_List")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 25)
    private String content;

    public Comment(String content) {
        this.content = content;
    }

    @Builder
    public Comment(Long id, String content) {
        this.id = id;
        this.content = content;
    }


}
