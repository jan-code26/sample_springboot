package com.example.demos.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "position")
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "position_id_seq")
    @Column(name = "id")
    private Integer id;

    @Column(name = "position_name", nullable = false)
    private String position_name;

    @Column(name = "position_summary", nullable = false, length = 1000)
    private String position_summary;

    @Column(name = "start_date", nullable = false)
    private String start_date;

    @Column(name = "end_date", nullable = false)
    private String end_date;

}
