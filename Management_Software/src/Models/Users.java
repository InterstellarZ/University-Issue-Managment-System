package Models;

public class Users {

    private String userID;      
    private String password;
    private String type;

    
    //constructor of Users class
    
    public Users(String userID, String password, String type) {      
        this.userID = userID;
        this.password = password;
        this.type = type;
    }

    
    //getter and setter of the above variables
    
    public String getUserID() {  
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
