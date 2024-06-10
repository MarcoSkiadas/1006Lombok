package org.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Student {
    private int id;
    private String name;
    private String address;
    private int grade;


}
