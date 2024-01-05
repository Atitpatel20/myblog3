package com.myblog3.myblog3.repository;

import com.myblog3.myblog3.entity.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker,Long> {
}
