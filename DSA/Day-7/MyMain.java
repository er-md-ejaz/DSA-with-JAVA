// package com.college;

// import com.college.student.MyStudent;
// import com.college.teacher.MyTeacher;
// import com.college.student.studentdetails.StudentDetails;
// import com.college.teacher.teacherdetails.TeacherDetails;

public class MyMain {
    public static void main(String[] args) {
        System.out.println("I'm main");
        
        MyStudent student = new MyStudent();
        student.print();

        MyTeacher teacher = new MyTeacher();
        teacher.print();

        StudentDetails studentDetails = new StudentDetails();
        studentDetails.print();

        TeacherDetails teacherDetails = new TeacherDetails();
        teacherDetails.print();

    }
}
