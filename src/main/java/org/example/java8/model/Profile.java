package org.example.java8.model;

public class Profile {
    String profileId;

    public Profile(String profileId, String contactNo, String password) {
        this.profileId = profileId;
        this.contactNo = contactNo;
        this.password = password;
    }

    String contactNo;
    String password;



    public Profile(){

    }

}
