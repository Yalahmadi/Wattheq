package com.ELM.stProject.Wattheq.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Auth")
@Table
public class Auth {

    @Id
    @Column(name = "AuthID")
    private int authID;
    @Column(name = "AuthName")
    private String authName;
    @Column(name = "AuthDescription")
    private String authDescription;

    public Auth() {}

    public Auth(int authID, String authName, String authDescription) {
        this.authID = authID;
        this.authName = authName;
        this.authDescription = authDescription;
    }

    public int getAuthID() {
        return authID;
    }

    public void setAuthID(int authID) {
        this.authID = authID;
    }

    public String getAuthName() {
        return authName;
    }

    public void setAuthName(String authName) {
        this.authName = authName;
    }

    public String getAuthDescription() {
        return authDescription;
    }

    public void setAuthDescription(String authDescription) {
        this.authDescription = authDescription;
    }

    public void setNationalID(int authID) {
    }
}


