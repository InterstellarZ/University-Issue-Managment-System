package Controler;

import Models.Admin;
import Models.Admin.Adduser;
import Models.Admin.AllissuesAdmin;
import Models.Admin.ManagecoursesAdmin;
import DatabaseAccessLayer.AdminAccessLogic;
import java.util.List;

public class AdminController {

    Admin objAdmin;
    Admin.Adduser objAdduser;
    Admin.AllissuesAdmin objAllissuesAdmin;
    Admin.ManagecoursesAdmin objManagecoursesAdmin;
    Admin.MonthlyHistoryOfIssuesAdmin objMonthlyHistoryOfIssuesAdmin;
    Admin.HelpAdmin objHelpAdmin;
    
    AdminAccessLogic deshan;
    
    public AdminController()
    {
        deshan = new AdminAccessLogic();
    }

    public Admin addAdmin() {
        objAdmin = new Admin();
        return objAdmin;
    }

    public  Admin.Adduser addAdduser(String usertype,String name,String userid,String email,String password,String phoneNo,String reenterpassword,String address) {
       objAdduser = objAdmin.new Adduser(usertype, name, userid, email, password, phoneNo, reenterpassword, address);
        return objAdduser;
    
    }
     public boolean insertAdminToDB(Admin.Adduser objAdminAdduser)
    {
      boolean result =deshan.addAdduserTODB(objAdminAdduser);
      return result;
    }
     
     
     
       public List<Admin.Adduser> GetAddUsers(String searchText)
    {
        List<Admin.Adduser> result= deshan.GetAddUsser(searchText);
        
        return result;
    }
     
     
     
     
     
     
     
     
     
     
     
     
   /*  
   

    public Admin.AllissuesAdmin addAllissuesAdmin(String email, String phone, String degree, String registerdyear, String year, String batch, String semester,
                String subject,String exam,String date,String time,String details) {
        objAllissuesAdmin = objAdmin.new AllissuesAdmin(email,phone,degree,registerdyear,year,batch,semester,subject,exam,date,time,details);

        return objAllissuesAdmin;
    }
    
    

    public Admin.ManagecoursesAdmin addManagecoursesAdmin(String degreetype, String uniname, String cuntry, String degreename, String degreeid, String faculty,
                String entryreqirements,String programmeduration,String programmeschedule,String intake,String coursefee,String dean) {

        objManagecoursesAdmin = objAdmin.new ManagecoursesAdmin(degreetype,uniname,cuntry,degreename,degreeid,faculty,entryreqirements,programmeduration,programmeschedule,intake,coursefee,dean);

        return objManagecoursesAdmin;
    }
    
     public boolean insertManagecoursesAdminToDB(Admin.AllissuesAdmin objEmployerAllissuesAdmin)
    {
      boolean result =deshan.addManagecoursesAdminTODB(objManagecoursesAdmin);
      return result;
    }

    public Admin.MonthlyHistoryOfIssuesAdmin addMonthlyHistoryOfIssuesAdmin() {
        return null;
    }
    
    public Admin.HelpAdmin addHelpAdmin() {
        return null;
    }
*/
}
