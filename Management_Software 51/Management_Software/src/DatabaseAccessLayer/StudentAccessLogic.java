package DatabaseAccessLayer;

import DatabaseLayer.DatabaseConnection;
import Models.Admin;
import Models.Student;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Models.Student.StudentRegisration;

public class StudentAccessLogic {

    private final DatabaseConnection singleConn;
    Student.StudentRegisration objStudentRegistration;
    Student objStudent;

    public StudentAccessLogic() {
        singleConn = DatabaseConnection.getSingleInstace();
        objStudent = new Student();
    }

    public boolean addStudentregistrationTODB(Student.StudentRegisration objstudent) {
        try {

            String query = "insert into notcomplitedallissues values('" + 0 + "','" + "Student Registration Issues" + "','" + null+ "','" + objstudent.getName() + "','" + objstudent.getID() + "','" + objstudent.getEmail() + "','" + objstudent.getPhone() + "','"
                    + objstudent.getDegreeType() + "','" + objstudent.getDegreeName() + "','" + objstudent.getRegisterYear() + "','" + objstudent.getIntake() + "','" + objstudent.getYear() + "','"
                    + objstudent.getSemester() + "','" + objstudent.getBatch() + "','" + null+ "','" + null+ "','" + null+ "','" + null+ "','" + null+ "','" + objstudent.getStudentIssue() + "');";
            boolean result = singleConn.ExecuteQuery(query);
            return result;
        } catch (Exception ex) {
            return false;
        }
    }

//getting data from database to load for a combox
    //update combox
    public List<Student.StudentRegisration> updatacombox(String searchID) {
        try {

            List<Student.StudentRegisration> adduser = new ArrayList<Student.StudentRegisration>();

            String query = " SELECT  * FROM coursedetails where degreetype ='" + searchID + "'";

            ResultSet result = singleConn.ExecuteQueryResultSet(query);

            while (result.next()) {
                Student.StudentRegisration adm = objStudent.new StudentRegisration(
                        result.getString("degreetype"),
                        result.getString("uniname"),
                        result.getString("cuntry"),
                        result.getString("degreename"),
                        result.getString("degreeid"),
                        result.getString("faculty"),
                        result.getString("entryreqirements"),
                        result.getString("programmeduration"),
                        result.getString("programmeschedule"),
                        result.getString("intake"),
                        result.getString("coursefee"),
                        result.getString("coursefee")
                );

                adduser.add(adm);
                //System.out.println(result.getString("ID"));
            }

            return adduser;

        } catch (Exception ex) {

            return null;
        }

    }

    /*  
     //update combox
     public List<Student.StudentRegisration> updatacombox2(String searchID) {
        try {

            List<Student.StudentRegisration> employees = new ArrayList<Student.StudentRegisration>();

           String query = " SELECT * FROM studentregistration ";
            // String query = " SELECT * FROM studentregistration where degreeType ='" + searchID + "'";
           
            ResultSet result = singleConn.ExecuteQueryResultSet(query);

            while (result.next()) {
                Student.StudentRegisration emp = objStudent.new StudentRegisration(
                        result.getString("name"),
                        result.getString("ID"),
                        result.getString("email"),
                        result.getString("phone"),
                        result.getString("degreeType"),
                        result.getString("degreeName"),
                        result.getString("registerYear"),
                        result.getString("intake"),
                        result.getString("year"),
                        result.getString("semester"),
                        result.getString("batch"),
                        result.getString("batch")
                );

           

                employees.add(emp);
            }

            return employees;

        } catch (Exception ex) {
            return null;//
        }

    }


     */
}
