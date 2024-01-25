package com.myblog3.myblog3.repository;

import com.myblog3.myblog3.entity.WorkLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkLogRepository extends JpaRepository<WorkLog,Long> {
}
