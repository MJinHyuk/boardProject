package org.koreait.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.Data;

@Data
@Entity
@IdClass(BoardView.class)
public class BoardView {
    @Id
    private Long seq;

    @Id
    @Column(name="_uid")
    private Integer uid;
}
