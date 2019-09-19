package com;

public class student {
        int studentId;
        String studentName;
        void setValues ()
        {
            studentId = 1;
            studentName = "BUSHAIR";
        }

        void display ()
        {
            System.out.println("student ID :" + studentId);
            System.out.println("student name :" + studentName);
            student s1=new student();
            s1.setValues();
            s1.display();
        }

}
