
package DatabaseAccessLayer;
import DatabaseLayer.DatabaseConnection;
import Models.Guest;
public class GuestAccessLogic {
 


    private final DatabaseConnection singleConn;

    public GuestAccessLogic() {
        singleConn = DatabaseConnection.getSingleInstace();
    }

    public boolean addStudentregistrationGuestTODB(Guest.StudentRegisrationGuest objGuest) {
        try {

            String query = "insert into studentregistration values";
            boolean result = singleConn.ExecuteQuery(query);
            return result;
        } catch (Exception ex) {
            return false;
        }
    }
    
    public boolean addForgotpasswordTODB(Guest.Forgotpassword objGuest) {
        try {

            String query = "insert into studentregistration values";
            boolean result = singleConn.ExecuteQuery(query);
            return result;
        } catch (Exception ex) {
            return false;
        }
    }
}


