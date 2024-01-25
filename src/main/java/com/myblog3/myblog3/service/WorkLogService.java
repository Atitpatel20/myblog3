package com.myblog3.myblog3.service;

import com.myblog3.myblog3.payload.WorkLogDto;

public interface WorkLogService {
    WorkLogDto createWorklogs(WorkLogDto workLogDto,long workerId);
}
