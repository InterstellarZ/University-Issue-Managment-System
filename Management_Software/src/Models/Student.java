package Models;




//----------------------------------------------------------------------------------------------------------

public class Student {

 
    public class StudentRegisration {  //for the student registration panal

        String name;
        String ID;
        String email;
        String phone;
        String degreeType;
        String degreeName;
        String registerYear;
        String intake;
        String year;
        String semester;
        String batch;
        String studentIssue;

        public StudentRegisration(String name, String ID, String email, String phone, String degreeType, String degreeName, String registerYear, String intake, String year, String semester, String batch,String studentIssue) {
            this.name = name;
            this.ID = ID;
            this.email = email;
            this.phone = phone;
            this.degreeType = degreeType;
            this.degreeName = degreeName;
            this.registerYear = registerYear;
            this.intake = intake;
            this.year = year;
            this.semester = semester;
            this.batch = batch;
            this.studentIssue= studentIssue;
        }

        public String getName() 
        {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getID() {
            return ID;
        }

        public void setID(String ID) {
            this.ID = ID;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getDegreeType() {
            return degreeType;
        }

        public void setDegreeType(String degreeType) {
            this.degreeType = degreeType;
        }

        public String getDegreeName() {
            return degreeName;
        }

        public void setDegreeName(String degreeName) {
            this.degreeName = degreeName;
        }

        public String getRegisterYear() {
            return registerYear;
        }

        public void setRegisterYear(String registerYear) {
            this.registerYear = registerYear;
        }

        public String getIntake() {
            return intake;
        }

        public void setIntake(String intake) {
            this.intake = intake;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public String getSemester() {
            return semester;
        }

        public void setSemester(String semester) {
            this.semester = semester;
        }

        public String getBatch() {
            return batch;
        }

        public void setBatch(String batch) {
            this.batch = batch;
        }

        public String getStudentIssue() {
            return studentIssue;
        }

        public void setStudentIssue(String studentIssue) {
            this.studentIssue = studentIssue;
        }
        
        

    }

    //--------------------------------------------------------------------------------------------
    
    public class GeneralExamIssue {   //for the general examination issues

        String name;
        String ID;
        String email;
        String phone;
        String degreeType;
        String degreeName;
        String registerYear;
        String intake;
        String year;
        String semester;
        String batch;
        String subjectName;
        String Examtype;
        String examinationIssue_general;

        public GeneralExamIssue(String name, String ID, String email, String phone, String degreeType, String degreeName, String registerYear, String intake, String year, String semester, String batch, String subjectName, String Examtype, String examinationIssue_general) {
            this.name = name;
            this.ID = ID;
            this.email = email;
            this.phone = phone;
            this.degreeType = degreeType;
            this.degreeName = degreeName;
            this.registerYear = registerYear;
            this.intake = intake;
            this.year = year;
            this.semester = semester;
            this.batch = batch;
            this.subjectName = subjectName;
            this.Examtype = Examtype;
            this.examinationIssue_general = examinationIssue_general;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getID() {
            return ID;
        }

        public void setID(String ID) {
            this.ID = ID;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getDegreeType() {
            return degreeType;
        }

        public void setDegreeType(String degreeType) {
            this.degreeType = degreeType;
        }

        public String getDegreeName() {
            return degreeName;
        }

        public void setDegreeName(String degreeName) {
            this.degreeName = degreeName;
        }

        public String getRegisterYear() {
            return registerYear;
        }

        public void setRegisterYear(String registerYear) {
            this.registerYear = registerYear;
        }

        public String getIntake() {
            return intake;
        }

        public void setIntake(String intake) {
            this.intake = intake;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public String getSemester() {
            return semester;
        }

        public void setSemester(String semester) {
            this.semester = semester;
        }

        public String getBatch() {
            return batch;
        }

        public void setBatch(String batch) {
            this.batch = batch;
        }

        public String getSubjectName() {
            return subjectName;
        }

        public void setSubjectName(String subjectName) {
            this.subjectName = subjectName;
        }

        public String getExamtype() {
            return Examtype;
        }

        public void setExamtype(String Examtype) {
            this.Examtype = Examtype;
        }

        public String getExaminationIssue_general() {
            return examinationIssue_general;
        }

        public void setExaminationIssue_general(String examinationIssue_general) {
            this.examinationIssue_general = examinationIssue_general;
        }

    }
    
        
//---------------------------------------------------------------------------------------------------------------------------------
    public class ExamInquiries {     //for other examination related issues
        
        String name;
        String ID;
        String email;
        String phone;
        String degreeType;
        String degreeName;
        String registerYear;
        String intake;
        String year;
        String semester;
        String batch;
        String InquirieType;
        String subjectName;
        String examType;
        String yearSubject;
        String monthSubject;
        String daySubject;
        String hourSubject;
        String minuiteSubject;
        String otherIssue;

        public ExamInquiries(String name, String ID, String email, String phone, String degreeType, String degreeName, String registerYear, String intake, String year, String semester, String batch, String InquirieType, String subjectName, String examType, String yearSubject, String monthSubject, String daySubject, String hourSubject, String minuiteSubject, String otherIssue) {
            this.name = name;
            this.ID = ID;
            this.email = email;
            this.phone = phone;
            this.degreeType = degreeType;
            this.degreeName = degreeName;
            this.registerYear = registerYear;
            this.intake = intake;
            this.year = year;
            this.semester = semester;
            this.batch = batch;
            this.InquirieType = InquirieType;
            this.subjectName = subjectName;
            this.examType = examType;
            this.yearSubject = yearSubject;
            this.monthSubject = monthSubject;
            this.daySubject = daySubject;
            this.hourSubject = hourSubject;
            this.minuiteSubject = minuiteSubject;
            this.otherIssue = otherIssue;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getID() {
            return ID;
        }

        public void setID(String ID) {
            this.ID = ID;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getDegreeType() {
            return degreeType;
        }

        public void setDegreeType(String degreeType) {
            this.degreeType = degreeType;
        }

        public String getDegreeName() {
            return degreeName;
        }

        public void setDegreeName(String degreeName) {
            this.degreeName = degreeName;
        }

        public String getRegisterYear() {
            return registerYear;
        }

        public void setRegisterYear(String registerYear) {
            this.registerYear = registerYear;
        }

        public String getIntake() {
            return intake;
        }

        public void setIntake(String intake) {
            this.intake = intake;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public String getSemester() {
            return semester;
        }

        public void setSemester(String semester) {
            this.semester = semester;
        }

        public String getBatch() {
            return batch;
        }

        public void setBatch(String batch) {
            this.batch = batch;
        }

        public String getInquirieType() {
            return InquirieType;
        }

        public void setInquirieType(String InquirieType) {
            this.InquirieType = InquirieType;
        }

        public String getSubjectName() {
            return subjectName;
        }

        public void setSubjectName(String subjectName) {
            this.subjectName = subjectName;
        }

        public String getExamType() {
            return examType;
        }

        public void setExamType(String examType) {
            this.examType = examType;
        }

        public String getYearSubject() {
            return yearSubject;
        }

        public void setYearSubject(String yearSubject) {
            this.yearSubject = yearSubject;
        }

        public String getMonthSubject() {
            return monthSubject;
        }

        public void setMonthSubject(String monthSubject) {
            this.monthSubject = monthSubject;
        }

        public String getDaySubject() {
            return daySubject;
        }

        public void setDaySubject(String daySubject) {
            this.daySubject = daySubject;
        }

        public String getHourSubject() {
            return hourSubject;
        }

        public void setHourSubject(String hourSubject) {
            this.hourSubject = hourSubject;
        }

        public String getMinuiteSubject() {
            return minuiteSubject;
        }

        public void setMinuiteSubject(String minuiteSubject) {
            this.minuiteSubject = minuiteSubject;
        }

        public String getOtherIssue() {
            return otherIssue;
        }

        public void setOtherIssue(String otherIssue) {
            this.otherIssue = otherIssue;
        }

    }

    //-----------------------------------------------------------------------
    public class Course {         //for the course details

    }

    //------------------------------------------------------------------
    public class HelpStudent {

     String helpStudnet;

        public HelpStudent(String helpStudnet) {
            this.helpStudnet = helpStudnet;
        }

        public String getHelpStudnet() {
            return helpStudnet;
        }

        public void setHelpStudnet(String helpStudnet) {
            this.helpStudnet = helpStudnet;
        }
     
    }

}
