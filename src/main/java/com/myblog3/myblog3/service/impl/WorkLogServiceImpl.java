package com.myblog3.myblog3.service.impl;

import com.myblog3.myblog3.entity.WorkLog;
import com.myblog3.myblog3.entity.Worker;
import com.myblog3.myblog3.exception.ResourceNotFoundException;
import com.myblog3.myblog3.payload.WorkLogDto;
import com.myblog3.myblog3.repository.WorkLogRepository;
import com.myblog3.myblog3.repository.WorkerRepository;
import com.myblog3.myblog3.service.WorkLogService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class WorkLogServiceImpl implements WorkLogService {
    private WorkerRepository workerRepository;
    private WorkLogRepository workLogRepository;
    private ModelMapper modelMapper;

    public WorkLogServiceImpl(WorkerRepository workerRepository, WorkLogRepository workLogRepository,ModelMapper modelMapper) {
        this.workerRepository = workerRepository;
        this.workLogRepository = workLogRepository;
        this.modelMapper=modelMapper;
    }

    @Override
    public WorkLogDto createWorklogs(WorkLogDto workLogDto, long workerId) {
        Worker worker = workerRepository.findById(workerId).orElseThrow(
                () -> new ResourceNotFoundException("worker not found with id:" + workerId)
        );
        WorkLog w = mapToEntity(workLogDto);
//        WorkLog workLog= new WorkLog();
//        workLog.setHours(workLogDto.getHours());
//        workLog.setDate(workLogDto.getDate());
        w.setWorker(worker);
        WorkLog saveWorkLogs = workLogRepository.save(w);
//        WorkLogDto dto = new WorkLogDto();
//        dto.setId(saveWorkLogs.getId());
//        dto.setDate(saveWorkLogs.getDate());
//        dto.setHours(saveWorkLogs.getHours());
        return mapToDto(saveWorkLogs);

    }

    @Override
    public void deleteWorklogById(long id) {
        workLogRepository.deleteById(id);
    }

    @Override
    public WorkLogDto updateWorkLogById(long id, WorkLogDto workLogDto, long workerId) {
        Worker worker = workerRepository.findById(workerId).orElseThrow(
                () -> new ResourceNotFoundException("Worker not found with id:" + workerId)
        );
        WorkLog workLog = workLogRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Worklog not found with id:" + id)
        );
        WorkLog w = mapToEntity(workLogDto);
        w.setId(workLog.getId());
        w.setWorker(worker);
//        workLog.setId(workLogDto.getId());
//        workLog.setDate(workLogDto.getDate());
//        workLog.setHours(workLogDto.getHours());
        WorkLog update = workLogRepository.save(w);
//        WorkLogDto dto= new WorkLogDto();
//        dto.setId(update.getId());
//        dto.setHours(update.getHours());
//        dto.setDate(update.getDate());
        return mapToDto(update);
    }
    WorkLogDto  mapToDto(WorkLog workLog){
        WorkLogDto dto = modelMapper.map(workLog, WorkLogDto.class);
        return dto;
    }
    WorkLog  mapToEntity(WorkLogDto workLogDto){
        WorkLog worklog = modelMapper.map(workLogDto, WorkLog.class);
        return worklog;
    }
}
