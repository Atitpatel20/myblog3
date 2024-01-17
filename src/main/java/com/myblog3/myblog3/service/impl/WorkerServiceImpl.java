package com.myblog3.myblog3.service.impl;

import com.myblog3.myblog3.entity.Worker;
import com.myblog3.myblog3.exception.ResourceNotFoundException;
import com.myblog3.myblog3.payload.WorkerDto;
import com.myblog3.myblog3.repository.WorkerRepository;
import com.myblog3.myblog3.service.WorkerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class WorkerServiceImpl implements WorkerService {

    private WorkerRepository workerRepository;

    public WorkerServiceImpl(WorkerRepository workerRepository) {
        this.workerRepository = workerRepository;
    }

    @Override
    public WorkerDto createWorkerSalary(WorkerDto workerDto) {
        Worker workers = mapToEntity(workerDto);

        Worker savedetailes = workerRepository.save(workers);

        WorkerDto dto = mapToDto(savedetailes);

        return dto;
    }
    @Override
    public WorkerDto getWorkerById(long id) {
       Worker worker= workerRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("No worker found with id: "+id));
        WorkerDto dto = mapToDto(worker);
        return dto;
    }

    @Override
    public List<WorkerDto> getAllWorkers() {
        List<Worker> workers = workerRepository.findAll();
        List<WorkerDto> workerDtos = workers.stream().map(w -> mapToDto(w)).collect(Collectors.toList());
        return workerDtos;
    }
    WorkerDto mapToDto(Worker worker){
        WorkerDto dto= new WorkerDto();
        dto.setId(worker.getId());
        dto.setAttendence(worker.getAttendence());
        dto.setWagesPerday(worker.getWagesPerday());
        dto.setOvertime(worker.getOvertime());
        return dto;
    }
   Worker mapToEntity(WorkerDto workerDto){
       Worker workers= new Worker();
       workers.setId(workerDto.getId());
       workers.setAttendence(workerDto.getAttendence());
       workers.setWagesPerday(workerDto.getWagesPerday());
       workers.setOvertime(workerDto.getOvertime());
      return workers;
    }
}
