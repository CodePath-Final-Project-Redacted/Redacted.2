package com.codepath.rkpandey.a651615651.Models;

public class Users {

    String profilepic, UserName, mail, password, userId, lastMessage;

    public Users(String profilepic, String userName, String mail, String password, String userId, String lastMessage) {
        this.profilepic = profilepic;
        UserName = userName;
        this.mail = mail;
        this.password = password;
        this.userId = userId;
        this.lastMessage = lastMessage;
    }

    public Users(){}

    // SignUp Constructors
    public Users(String profilepic, String userName, String password) {
        this.profilepic = profilepic;
        UserName = userName;
        this.password = password;
    }

    public String getProfilepic() {
        return profilepic;
    }

    public String getUserName() {
        return UserName;
    }

    public String getMail() {
        return mail;
    }

    public String getPassword() {
        return password;
    }

    public String getUserId() {
        return userId;
    }

    public String getLastMessage() {
        return lastMessage;
    }
}
