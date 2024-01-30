package com.myblog3.myblog3.controller;

import com.myblog3.myblog3.payload.WorkLogDto;
import com.myblog3.myblog3.service.WorkLogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/worklog")
public class WorkLogController {
    private WorkLogService workLogService;

    public WorkLogController(WorkLogService workLogService) {
        this.workLogService = workLogService;
    }

    // http://localhost:8080/api/worklog?workerId=1
    @PostMapping
    public ResponseEntity<WorkLogDto>createWorklogs(
            @RequestBody WorkLogDto workLogDto,
            @RequestParam long workerId
    ){
        WorkLogDto worklogs = workLogService.createWorklogs(workLogDto, workerId);
        return new ResponseEntity<>(worklogs, HttpStatus.CREATED);
    }

    // http://localhost:8080/api/worklog/2
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteWorklogById(@PathVariable long id) {
        workLogService.deleteWorklogById(id);
        return new ResponseEntity<>("Record is deleteed!!", HttpStatus.OK);
    }
    //http://localhost:8080/api/worklog/2
    @PutMapping("/{id}")
    public ResponseEntity<WorkLogDto> updateWorkLogById(@PathVariable long id, @RequestBody WorkLogDto workLogDto) {
        WorkLogDto workLogDtos = workLogService.updateWorkLogById(id, workLogDto);
        return new ResponseEntity<>(workLogDtos, HttpStatus.OK);
    }
}
