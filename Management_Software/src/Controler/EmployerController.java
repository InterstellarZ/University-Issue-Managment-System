package Controler;

import Models.Employer;
import Models.Employer.Myissues;
import Models.Employer.AllissuesEmployer;
import Models.Employer.ManagecoursesEmployer;
import DatabaseAccessLayer.EmployerAccessLogic;

public class EmployerController {

    Employer objEmployer;
    Employer.Myissues objMyissues;
    Employer.AllissuesEmployer objAllissuesEmployer;
    Employer.ManagecoursesEmployer objManagecoursesEmployer;
    Employer.MonthlyHistoryOfIssuesEmployer objMonthlyHistoryOfIssuesEmployer;
    Employer.HelpEmployer objHelpEmployer;
    
    EmployerAccessLogic deshan;
    
    public EmployerController()
    {
        deshan = new EmployerAccessLogic();
    }

    public Employer addEmployer() {
        objEmployer = new Employer();
        return objEmployer;
    }

    public Employer.Myissues addMyissues(String typecomment, String email, String phone, String degree, String registerdyear,
            String year, String batch, String semester,String subject,String exam,String date,String time,String details, String comment) {
        objMyissues = objEmployer.new Myissues(typecomment,email,phone,degree,registerdyear,year,batch,semester,subject,exam,date,time,details,comment);
        
        return objMyissues;
    
    }
     public boolean insertEmployerToDB(Employer.Myissues objEmployerMyissues)
    {
      boolean result =deshan.addMyissuesTODB(objMyissues);
      return result;
    }
   

    public Employer.AllissuesEmployer addAllissuesEmployer(String email, String phone, String degree, String registerdyear, String year, String batch, String semester,
                String subject,String exam,String date,String time,String details) {
        objAllissuesEmployer = objEmployer.new AllissuesEmployer(email,phone,degree,registerdyear,year,batch,semester,subject,exam,date,time,details);

        return objAllissuesEmployer;
    }
    
    

    public Employer.ManagecoursesEmployer addManagecoursesEmployer(String degreetype, String uniname, String cuntry, String degreename, String degreeid, String faculty,
                String entryreqirements,String programmeduration,String programmeschedule,String intake,String coursefee,String dean) {

        objManagecoursesEmployer = objEmployer.new ManagecoursesEmployer(degreetype,uniname,cuntry,degreename,degreeid,faculty,entryreqirements,programmeduration,programmeschedule,intake,coursefee,dean);

        return objManagecoursesEmployer;
    }
    
     public boolean insertManagecoursesEmployerToDB(Employer.AllissuesEmployer objEmployerAllissuesEmployer)
    {
      boolean result =deshan.addManagecoursesEmployerTODB(objManagecoursesEmployer);
      return result;
    }

    public Employer.MonthlyHistoryOfIssuesEmployer addMonthlyHistoryOfIssuesEmployer() {
        return null;
    }
    
    public Employer.HelpEmployer addHelpEmployer() {
        return null;
    }

}
