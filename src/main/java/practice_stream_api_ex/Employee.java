package practice_stream_api_ex;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor

@Data
public class Employee {
    private int id;
    private String name;
    private int salary;
    private int age;

}
