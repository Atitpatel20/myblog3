package com.myblog3.myblog3.service.impl;

import com.myblog3.myblog3.entity.WorkLog;
import com.myblog3.myblog3.entity.Worker;
import com.myblog3.myblog3.exception.ResourceNotFoundException;
import com.myblog3.myblog3.payload.WorkLogDto;
import com.myblog3.myblog3.repository.WorkLogRepository;
import com.myblog3.myblog3.repository.WorkerRepository;
import com.myblog3.myblog3.service.WorkLogService;
import org.springframework.stereotype.Service;

@Service
public class WorkLogServiceImpl implements WorkLogService {
    private WorkerRepository workerRepository;
    private WorkLogRepository workLogRepository;

    public WorkLogServiceImpl(WorkerRepository workerRepository, WorkLogRepository workLogRepository) {
        this.workerRepository = workerRepository;
        this.workLogRepository = workLogRepository;
    }

    @Override
    public WorkLogDto createWorklogs(WorkLogDto workLogDto, long workerId) {
        Worker worker = workerRepository.findById(workerId).orElseThrow(
                () -> new ResourceNotFoundException("worker not found with id:" + workerId)
        );
        WorkLog workLog= new WorkLog();
        workLog.setHours(workLogDto.getHours());
        workLog.setDate(workLogDto.getDate());
        workLog.setWorker(worker);
        WorkLog saveWorkLogs = workLogRepository.save(workLog);
        WorkLogDto dto = new WorkLogDto();
        dto.setId(saveWorkLogs.getId());
        dto.setDate(saveWorkLogs.getDate());
        dto.setHours(saveWorkLogs.getHours());
        return dto;

    }
}
