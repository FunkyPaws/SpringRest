package model;

public class User {

    private Long UserID;
    private String Name;
    private String Password;
    private String Biography;
    private String Location;
    private String Website;

    public User(Long userID, String name, String password, String biography, String location, String website) {
        UserID = userID;
        Name = name;
        Password = password;
        Biography = biography;
        Location = location;
        Website = website;
    }

    public User() {
    }

    public Long getUserID() {
        return UserID;
    }

    public void setUserID(Long userID) {
        UserID = userID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getBiography() {
        return Biography;
    }

    public void setBiography(String biography) {
        Biography = biography;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getWebsite() {
        return Website;
    }

    public void setWebsite(String website) {
        Website = website;
    }

    @Override
    public String toString() {
        return "User{" +
                "UserID=" + UserID +
                ", Name='" + Name + '\'' +
                ", Password='" + Password + '\'' +
                ", Biography='" + Biography + '\'' +
                ", Location='" + Location + '\'' +
                ", Website='" + Website + '\'' +
                '}';
    }
}
