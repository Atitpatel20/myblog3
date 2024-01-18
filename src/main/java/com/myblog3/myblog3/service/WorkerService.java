package com.myblog3.myblog3.service;

import com.myblog3.myblog3.payload.WorkerDto;

import java.util.List;

public interface WorkerService  {
    WorkerDto createWorkerSalary(WorkerDto workerDto);

    WorkerDto getWorkerById(long id);

    List<WorkerDto> getAllWorkers(int pageNo, int pageSize);
}
