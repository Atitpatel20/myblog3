package com.myblog3.myblog3.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorkerDto {
    private long id;
    private double Attendence;
    private double overtime;
    private double wagesPerday;
}
