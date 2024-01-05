package com.myblog3.myblog3.service.impl;

import com.myblog3.myblog3.entity.Worker;
import com.myblog3.myblog3.payload.WorkerDto;
import com.myblog3.myblog3.repository.WorkerRepository;
import com.myblog3.myblog3.service.WorkerService;
import org.springframework.stereotype.Service;

@Service
public class WorkerServiceImpl implements WorkerService {

    private WorkerRepository workerRepository;

    public WorkerServiceImpl(WorkerRepository workerRepository) {
        this.workerRepository = workerRepository;
    }

    @Override
    public WorkerDto createWorkerSalary(WorkerDto workerDto) {
        Worker workers= new Worker();
        workers.setAttendence(workerDto.getAttendence());
        workers.setWagesPerday(workerDto.getWagesPerday());
        workers.setOvertime(workerDto.getOvertime());
        Worker savedetailes = workerRepository.save(workers);

        WorkerDto dto= new WorkerDto();
        dto.setAttendence(savedetailes.getAttendence());
        dto.setWagesPerday(savedetailes.getWagesPerday());
        dto.setOvertime(savedetailes.getOvertime());

        return dto;
    }
}
