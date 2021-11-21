package DatabaseAccessLayer;

import DatabaseLayer.DatabaseConnection;
import Models.Student;

public class StudentAccessLogic {

    private final DatabaseConnection singleConn;

    public StudentAccessLogic() {
        singleConn = DatabaseConnection.getSingleInstace();
    }

    public boolean addStudentregistrationTODB(Student.StudentRegisration objstudent) {
        try {

            String query = "insert into studentregistration values('" + objstudent.getName() + "','" + objstudent.getID() + "','" + objstudent.getEmail() + "','" + objstudent.getPhone() + "','"
                    + objstudent.getDegreeType() + "','" + objstudent.getDegreeName() + "','" + objstudent.getRegisterYear() + "','" + objstudent.getIntake() + "','" + objstudent.getYear() + "','"
                    + objstudent.getSemester() + "','" + objstudent.getBatch() + "','" + objstudent.getStudentIssue() + "');";
            boolean result = singleConn.ExecuteQuery(query);
            return result;
        } catch (Exception ex) {
            return false;
        }
    }
}
