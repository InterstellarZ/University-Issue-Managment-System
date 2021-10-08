package Models;

public class Student {

    String name;
    String email;
    String phone;

    public class StudentRegisration {  //for the student registration panal

        String degreeType;
        String degree;
        int registerYear;
        String intake;
        int year;
        int semester;
        String batch;
        String id;
        String details;

        public StudentRegisration(String degreeType, String degree, int registerYear, String intake, int year, int semester, String batch, String id, String details) {
         
            this.degreeType = degreeType;
            this.degree = degree;
            this.registerYear = registerYear;
            this.intake = intake;
            this.year = year;
            this.semester = semester;
            this.batch = batch;
            this.id = id;
            this.details = details;
        }

    }

    public class GenaralExamIssue {   //for the general examination issues

    }

    public class OtherExamIssue {     //for other examination related issues

    }

    public class Course {         //for the course details

    }

    public class Help {

    }

    public Student(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
    
   
    
    
}
