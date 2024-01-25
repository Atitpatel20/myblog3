package com.myblog3.myblog3.service.impl;

import com.myblog3.myblog3.entity.Worker;
import com.myblog3.myblog3.exception.ResourceNotFoundException;
import com.myblog3.myblog3.payload.WorkerDto;
import com.myblog3.myblog3.repository.WorkerRepository;
import com.myblog3.myblog3.service.WorkerService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
        Worker worker = workerRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No worker found with id: " + id));
        WorkerDto dto = mapToDto(worker);
        return dto;
    }

    @Override
    public List<WorkerDto> getAllWorkers(int pageNo, int pageSize, String sortBy, String sortDir) {
        Sort sort = sortDir.equalsIgnoreCase("asc") ? Sort.by(sortBy) : Sort.by(sortBy).descending();
        Pageable pageable = PageRequest.of(pageNo,pageSize,sort);
        Page<Worker> pageWorker = workerRepository.findAll(pageable);
        List<Worker> workers = pageWorker.getContent();
        List<WorkerDto> workerDtos = workers.stream().map(w -> mapToDto(w)).collect(Collectors.toList());
        return workerDtos;
    }

    WorkerDto mapToDto(Worker worker) {
        WorkerDto dto = new WorkerDto();
        dto.setId(worker.getId());
        dto.setName(worker.getName());
        dto.setAttendence(worker.getAttendance());
        dto.setWagesPerday(worker.getWagesPerDay());
        dto.setOvertime(worker.getOvertime());
        return dto;
    }

    Worker mapToEntity(WorkerDto workerDto) {
        Worker workers = new Worker();
        workers.setId(workerDto.getId());
        workers.setName(workerDto.getName());
        workers.setAttendance(workerDto.getAttendence());
        workers.setWagesPerDay(workerDto.getWagesPerday());
        workers.setOvertime(workerDto.getOvertime());
        return workers;
    }
}
