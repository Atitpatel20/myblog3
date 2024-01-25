package com.myblog3.myblog3.payload;

import lombok.Data;

@Data
public class WorkLogDto {
    private long id;
    private String date;
    private double hours;
}
