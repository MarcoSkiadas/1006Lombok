package org.example;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@NoArgsConstructor
@Data
public class UniversityService {
    Map<String, Course> courses;

    public float averageGradeByCourse(Course course){
        int sum = 0;
        for(int i=0;i<course.getStudents().size();i++){
            sum += course.getStudents().get(i).getGrade();
        }
        float avg = (float) sum /course.getStudents().size();
        return avg;
    }

    public float averageGradeByUniversity(University university){
        float sum = 0.0F;
        float students = 0.0F;

        for(int n=0;n<university.courses().size();n++) {
            for (int i = 0; i < university.courses().get(n).getStudents().size(); i++) {
                sum += university.courses().get(n).getStudents().get(i).getGrade();
                students++;
            }
        }
            float avg = (float) sum /students;
        return avg;
    }

    public List<Student> getAllGoodStudents(University university){
        List<Student> students = new ArrayList<>();
        for(int i=0;i<university.courses().size();i++){
            for(int j=0;j<university.courses().get(i).getStudents().size();j++){
                if(university.courses().get(i).getStudents().get(j).getGrade()<=2){
                    students.add(university.courses().get(i).getStudents().get(j));
                }
            }

        }
        return students;
    }




}
