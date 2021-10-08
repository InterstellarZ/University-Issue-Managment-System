package Controler;

import Models.Student;
import Models.Student.StudentRegisration;

public class StudentController {

    Student objStudent;
    Student.StudentRegisration objRegistration;

    public Student addStudent(String name, String email, String phone) {
        objStudent = new Student(name, email, phone);
        return objStudent;
    }

    public Student.StudentRegisration addRegistration(String degreeType, String degree, int registerYear, String intake, int year, int semester, String batch, String id, String details) {
        objRegistration = objStudent.new StudentRegisration(degreeType, degree, registerYear, intake, year, semester, batch, id, details);
        return objRegistration;
    }

}
