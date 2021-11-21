package Models;




//----------------------------------------------------------------------------------------------------------

public class Employer {

 
    public class Myissues {  //for the student registration panal

        String typecomment;
        String email;
        String phone;
        String degree;
        String registerdyear;
        String year;
        String batch;
        String semester;
        String subject;
        String exam;
        String date;
        String time;
        String details;
        String comment;
        

        public Myissues(String typecomment, String email, String phone, String degree, String registerdyear, String year, String batch, String semester,
                String subject,String exam,String date,String time,String details, String comment) {
            this.typecomment = typecomment;
            this.email = email;
            this.phone = phone;
            this.degree = degree;
            this.registerdyear = registerdyear;
            this.year = year;
            this.batch = batch;
            this.semester = semester;
            this.subject = subject;
            this.exam = exam;
            this.date = date;
            this.time = time;
            this.details = details;
            this.comment = comment;     
            
        }

        public String getTypecomment() {
            return typecomment;
        }

        public void setTypecomment(String typecomment) {
            this.typecomment = typecomment;
        }
        
        public String getEmail() {
            return email;
        }

        public void setemail(String email) {
            this.email = email;
        }
        
        public String getphone() {
            return phone;
        }

        public void setphone(String phone) {
            this.phone = phone;
        }
        
        public String getdegree() {
            return degree;
        }

        public void setdegree(String degree) {
            this.degree = degree;
        }
        
        public String getregisterdyear() {
            return registerdyear;
        }

        public void setregisterdyear(String registerdyear) {
            this.registerdyear = registerdyear;
        }
        
        public String getyear() {
            return year;
        }

        public void setyear(String year) {
            this.year = year;
        }
        
        public String getbatch() {
            return batch;
        }

        public void setbatch(String batch) {
            this.batch = batch;
        }
        
        public String getsemester() {
            return semester;
        }

        public void setsemester(String semester) {
            this.semester = semester;
        }
        
        public String getsubject() {
            return subject;
        }

        public void setsubject(String subject) {
            this.subject = subject;
        }
        
        public String getexam() {
            return exam;
        }

        public void setexam(String exam) {
            this.exam = exam;
        }
        
        public String getdate() {
            return date;
        }

        public void setdate(String date) {
            this.date = date;
        }
        
        public String gettime() {
            return time;
        }

        public void settime(String time) {
            this.time = time;
        }
        
        public String getdetails() {
            return details;
        }

        public void setdetails(String details) {
            this.details = details;
        }
        
        public String getcomment() {
            return comment;
        }

        public void setcomment(String comment) {
            this.comment = comment;
        }
           
    }

    //--------------------------------------------------------------------------------------------
    
    public class AllissuesEmployer {   //for the general examination issues

        String email;
        String phone;
        String degree;
        String registerdyear;
        String year;
        String batch;
        String semester;
        String subject;
        String exam;
        String date;
        String time;
        String details;
        

        public AllissuesEmployer(String email, String phone, String degree, String registerdyear, String year, String batch, String semester,
                String subject,String exam,String date,String time,String details) {

            this.email = email;
            this.phone = phone;
            this.degree = degree;
            this.registerdyear = registerdyear;
            this.year = year;
            this.batch = batch;
            this.semester = semester;
            this.subject = subject;
            this.exam = exam;
            this.date = date;
            this.time = time;
            this.details = details;

        }
        
        public String getEmail() {
            return email;
        }

        public void setemail(String email) {
            this.email = email;
        }
        
        public String getphone() {
            return phone;
        }

        public void setphone(String phone) {
            this.phone = phone;
        }
        
        public String getdegree() {
            return degree;
        }

        public void setdegree(String degree) {
            this.degree = degree;
        }
        
        public String getregisterdyear() {
            return registerdyear;
        }

        public void setregisterdyear(String registerdyear) {
            this.registerdyear = registerdyear;
        }
        
        public String getyear() {
            return year;
        }

        public void setyear(String year) {
            this.year = year;
        }
        
        public String getbatch() {
            return batch;
        }

        public void setbatch(String batch) {
            this.batch = batch;
        }
        
        public String getsemester() {
            return semester;
        }

        public void setsemester(String semester) {
            this.semester = semester;
        }
        
        public String getsubject() {
            return subject;
        }

        public void setsubject(String subject) {
            this.subject = subject;
        }
        
        public String getexam() {
            return exam;
        }

        public void setexam(String exam) {
            this.exam = exam;
        }
        
        public String getdate() {
            return date;
        }

        public void setdate(String date) {
            this.date = date;
        }
        
        public String gettime() {
            return time;
        }

        public void settime(String time) {
            this.time = time;
        }
        
        public String getdetails() {
            return details;
        }

        public void setdetails(String details) {
            this.details = details;
        }
        
    }
    
        
//---------------------------------------------------------------------------------------------------------------------------------
    public class ManagecoursesEmployer {     //for other examination related issues
        
        String degreetype;
        String uniname;
        String cuntry;
        String degreename;
        String degreeid;
        String faculty;
        String entryreqirements;
        String programmeduration;
        String programmeschedule;
        String intake;
        String coursefee;
        String dean;
        

        public ManagecoursesEmployer(String degreetype, String uniname, String cuntry, String degreename, String degreeid, String faculty,
                String entryreqirements,String programmeduration,String programmeschedule,String intake,String coursefee,String dean) {

            this.degreetype = degreetype;
            this.uniname = uniname;
            this.cuntry = cuntry;
            this.degreename = degreename;
            this.degreeid = degreeid;
            this.faculty = faculty;
            this.entryreqirements = entryreqirements;
            this.programmeduration = programmeduration;
            this.programmeschedule = programmeschedule;
            this.intake = intake;
            this.coursefee = coursefee;
            this.dean = dean;

        }
        
        public String getdegreetype() {
            return degreetype;
        }

        public void setdegreetype(String degreetype) {
            this.degreetype = degreetype;
        }
        
        public String getuniname() {
            return uniname;
        }

        public void setuniname(String uniname) {
            this.uniname = uniname;
        }
        
        public String getcuntry() {
            return cuntry;
        }

        public void setcuntry(String cuntry) {
            this.cuntry = cuntry;
        }
        
        public String getdegreename() {
            return degreename;
        }

        public void setdegreename(String degreename) {
            this.degreename = degreename;
        }
        
        public String getdegreeid() {
            return degreeid;
        }

        public void setdegreeid(String degreeid) {
            this.degreeid = degreeid;
        }
        
        public String getfaculty() {
            return faculty;
        }

        public void setfaculty(String faculty) {
            this.faculty = faculty;
        }
        
        public String getentryreqirements() {
            return entryreqirements;
        }

        public void setentryreqirements(String entryreqirements) {
            this.entryreqirements = entryreqirements;
        }
        
        public String getprogrammeduration() {
            return programmeduration;
        }

        public void setprogrammeduration(String programmeduration) {
            this.programmeduration = programmeduration;
        }
        
        public String getprogrammeschedule() {
            return programmeschedule;
        }

        public void setprogrammeschedule(String programmeschedule) {
            this.programmeschedule = programmeschedule;
        }
        
        public String getintake() {
            return intake;
        }

        public void setintake(String intake) {
            this.intake = intake;
        }
        
        public String getcoursefee() {
            return coursefee;
        }

        public void setcoursefee(String coursefee) {
            this.coursefee = coursefee;
        }
        
        public String getdean() {
            return dean;
        }

        public void setdean(String dean) {
            this.dean = dean;
        }

    }

    //-----------------------------------------------------------------------
    public class MonthlyHistoryOfIssuesEmployer {         //for the course details

    }

    //------------------------------------------------------------------
    public class HelpEmployer {

     String helpEmployer;

        public HelpEmployer(String helpEmployer) {
            this.helpEmployer = helpEmployer;
        }

        public String getHelpEmployer() {
            return helpEmployer;
        }

        public void setHelpEmployer(String helpEmployer) {
            this.helpEmployer = helpEmployer;
        }
     
    }

}
