package com.myblog3.myblog3.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="worklog")
@AllArgsConstructor
@NoArgsConstructor
public class WorkLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String date;
    private double hours;

    @ManyToOne
    @JoinColumn(name = "worker_id")
    private Worker worker;
}
