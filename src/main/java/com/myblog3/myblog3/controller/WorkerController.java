package com.myblog3.myblog3.controller;

import com.myblog3.myblog3.payload.WorkerDto;
import com.myblog3.myblog3.service.WorkerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/worker")
public class WorkerController {

    private WorkerService workerService;

    public WorkerController(WorkerService workerService) {
        this.workerService = workerService;
    }

    @PostMapping
    public ResponseEntity<WorkerDto>createWorkerSalary(@RequestBody WorkerDto workerDto){
        WorkerDto workerSalary = workerService.createWorkerSalary(workerDto);
        return new ResponseEntity<>(workerSalary, HttpStatus.CREATED);
    }
    @GetMapping("/persnolize")
    public ResponseEntity<WorkerDto> getWorkerById(@RequestParam long id){
        WorkerDto dto = workerService.getWorkerById(id);
        return new ResponseEntity<>(dto,HttpStatus.OK);
    }
    @GetMapping
    public List<WorkerDto> getAllWorkers(){
        List<WorkerDto> workerDtos=workerService.getAllWorkers();
        return workerDtos;
    }
}
