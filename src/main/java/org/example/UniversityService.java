package org.example;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@NoArgsConstructor
@Data
public class UniversityService {
    Map<String, Student> students;
    Map<String, Course> courses;

    public float averageGradeByCourse(Course course){
        int sum = 0;
        for(int i=0;i<course.getStudents().size();i++){
            sum += course.getStudents().get(i).getGrade();
        }
        float avg = (float) sum /course.getStudents().size();
        return avg;
    }



}
