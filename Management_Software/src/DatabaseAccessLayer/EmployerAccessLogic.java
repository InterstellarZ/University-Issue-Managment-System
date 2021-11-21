
package DatabaseAccessLayer;
import DatabaseLayer.DatabaseConnection;
import Models.Employer;
public class EmployerAccessLogic {
 


    private final DatabaseConnection singleConn;

    public EmployerAccessLogic() {
        singleConn = DatabaseConnection.getSingleInstace();
    }

    public boolean addMyissuesTODB(Employer.Myissues objEmployer) {
        try {

            String query = "insert into studentregistration values;";
            boolean result = singleConn.ExecuteQuery(query);
            return result;
        } catch (Exception ex) {
            return false;
        }
    }
        
    public boolean addManagecoursesEmployerTODB(Employer.ManagecoursesEmployer objEmployer) {
        try {

            String query = "insert into studentregistration values;";
            boolean result = singleConn.ExecuteQuery(query);
            return result;
        } catch (Exception ex) {
            return false;
        }
    }
}


