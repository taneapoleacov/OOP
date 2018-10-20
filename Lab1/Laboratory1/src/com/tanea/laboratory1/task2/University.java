package com.tanea.laboratory1.task2;

public class University {
    String nameUniversity;
    int foundationYear;
    Student[] listStudent;

    double getAverageMark(Student[] avg){
        double average = 0;
        for(int i= 0; i< avg.length; ++i){
            average += avg[i].averageMark;
        }
        average = average/avg.length;
        return average;

    }

}
