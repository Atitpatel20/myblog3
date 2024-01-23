package com.myblog3.myblog3.controller;

import com.myblog3.myblog3.payload.WorkerDto;
import com.myblog3.myblog3.service.WorkerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/workers")
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
    // http://localhost:8080/api/workers?pageNo=0&pageSize=3&sortBy=name&sortDir=Desc
    @GetMapping
    public List<WorkerDto> getAllWorkers(
            @RequestParam(name="pageNo",required = false,defaultValue = "0")int pageNo,
            @RequestParam(name="pageSize",required = false,defaultValue = "0")int pageSize,
            @RequestParam(name="sortBy",required = false,defaultValue = "id")String sortBy,
            @RequestParam(name="sortDir",required = false,defaultValue = "id")String sortDir
    ){
        List<WorkerDto> workerDtos=workerService.getAllWorkers(pageNo,pageSize,sortBy,sortDir);
        return workerDtos;
    }
}
