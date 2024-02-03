package com.myblog3.myblog3.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Table(name="workerinfo")
@AllArgsConstructor
@NoArgsConstructor
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private double attendance;
    private double overtime;
    private double wagesPerDay;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "worker")
    private List<WorkLog> workLogs;
}
