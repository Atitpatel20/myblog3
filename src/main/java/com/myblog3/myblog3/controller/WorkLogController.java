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
}
