package DatabaseAccessLayer;

import DatabaseLayer.DatabaseConnection;
import Models.Admin;
import Models.Admin.Adduser;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AdminAccessLogic {

    private final DatabaseConnection singleConn;
    Admin objadmin;

    public AdminAccessLogic() {
        singleConn = DatabaseConnection.getSingleInstace();
        objadmin = new Admin();
    }

    public boolean addAdduserTODB(Admin.Adduser objAdmin) {
        try {

            String query = "insert into addusers values('" + objAdmin.getusertype() + "','" + objAdmin.getuserid() + "','" + objAdmin.getname() + "','" + objAdmin.getphoneNo() + "','"
                    + objAdmin.getaddress() + "','" + objAdmin.getpassword()+ "','"  +objAdmin.getreenterpassword()+"','"+objAdmin.getemail()+ "');";
            boolean result = singleConn.ExecuteQuery(query);
            return result;
        } catch (Exception ex) {
            return false;
        }
    }

    public List<Admin.Adduser> GetAddUsser(String searchText) {
        try {

            List<Admin.Adduser> adduser = new ArrayList<Admin.Adduser>();

            String query = " SELECT * FROM addusers";
            ResultSet result = singleConn.ExecuteQueryResultSet(query);

            while (result.next()) {
                Admin.Adduser adm = objadmin.new Adduser(
                        result.getString("type"),
                        result.getString("ID"),
                        result.getString("name"),
                        result.getString("phone"),
                        result.getString("address"),
                        result.getString("password"),
                        result.getString("reenterpassword"),
                        result.getString("email")
                );
          
                
                adduser.add(adm);
            }

            return adduser;

        } catch (Exception ex) {
            return null;
        }

    }
/*
    public boolean addAllissuesAdminTODB(Admin.AllissuesAdmin objAdmin) {
        try {

            String query = "insert into studentregistration values;";
            boolean result = singleConn.ExecuteQuery(query);
            return result;
        } catch (Exception ex) {
            return false;
        }
    }

    public boolean addManagecoursesAdminTODB(Admin.ManagecoursesAdmin objAdmin) {
        try {

            String query = "insert into studentregistration values;";
            boolean result = singleConn.ExecuteQuery(query);
            return result;
        } catch (Exception ex) {
            return false;
        }
    }

    public boolean addMonthlyHistoryOfIssuesAdminTODB(Admin.MonthlyHistoryOfIssuesAdmin objAdmin) {
        try {

            String query = "insert into studentregistration values;";
            boolean result = singleConn.ExecuteQuery(query);
            return result;
        } catch (Exception ex) {
            return false;
        }
    }


*/
}
