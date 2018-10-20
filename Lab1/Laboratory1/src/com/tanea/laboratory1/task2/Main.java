package com.tanea.laboratory1.task2;

public class Main {

    public static void main(String[] args) {

        University university1 = new University();
        university1.nameUniversity = "UTM";
        university1.foundationYear = 1964;

        University university2 = new University();
        university2.nameUniversity = "USM";
        university2.foundationYear = 1946;

        University university3 = new University();
        university3.nameUniversity = "ASEM";
        university3.foundationYear = 1991;


        Student studentUTM1 = new Student() ;
        studentUTM1.name = "Tanea";
        studentUTM1.age = 20;
        studentUTM1.averageMark = 9.20d;

        Student studentUTM2 = new Student() ;
        studentUTM2.name = "Cristi";
        studentUTM2.age = 20;
        studentUTM2.averageMark = 9.79d;

        Student studentUSM1 = new Student() ;
        studentUSM1.name = "Ana";
        studentUSM1.age = 22;
        studentUSM1.averageMark = 9.55d;

        Student studentUSM2 = new Student() ;
        studentUSM2.name = "Ion";
        studentUSM2.age = 21;
        studentUSM2.averageMark = 8.00d;

        Student studentASEM1 = new Student() ;
        studentASEM1.name = "Alexandru";
        studentASEM1.age = 23;
        studentASEM1.averageMark = 8.00d;

        Student studentASEM2 = new Student() ;
        studentASEM2.name = "Irina";
        studentASEM2.age = 25;
        studentASEM2.averageMark = 9.35d;


        Student[] studentiLaUTM = {studentUTM1,studentUTM2};
        university1.listStudent = studentiLaUTM;

        Student[] studentiLaUSM = {studentUSM1,studentUSM2};
        university2.listStudent = studentiLaUSM;

        Student[] studentiLaASEM = {studentASEM1,studentASEM2};
        university3.listStudent = studentiLaASEM;


        double averageUTM, averageUSM, averageASEM, totalAverage;
        averageUTM = university1.getAverageMark(studentiLaUTM);
        averageUSM = university2.getAverageMark(studentiLaUSM);
        averageASEM = university3.getAverageMark(studentiLaASEM);
        totalAverage = (averageUTM + averageUSM + averageASEM )/3;


        System.out.println("Average mark for UTM students is "+ averageUTM);
        System.out.println("Average mark for USM students is "+ averageUSM);
        System.out.println("Average mark for ASM students is "+averageASEM);
        System.out.println("Average mark for all students is " +totalAverage);


    }

}
