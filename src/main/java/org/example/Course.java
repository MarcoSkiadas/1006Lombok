package org.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Value;

import java.util.List;

@Builder
@Value

public class Course {
    private int id;
    private String name;
    private Teacher teacher;
    private String course;
    private List<Student> students;

}
