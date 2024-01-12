package com.myblog3.myblog3.service;

import com.myblog3.myblog3.payload.WorkerDto;

public interface WorkerService  {
    WorkerDto createWorkerSalary(WorkerDto workerDto);

    WorkerDto getWorkerById(long id);
}
