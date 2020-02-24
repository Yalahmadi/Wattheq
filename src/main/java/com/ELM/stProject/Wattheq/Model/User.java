package com.ELM.stProject.Wattheq.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "Users")
public class User {

    @Id
    @Column(name = "UserID")
    private int userID;
    @Column(name = "FullName")
    private String fullName;
    @Column(name = "DateOfBirth")
    private String dob;
    @Column(name = "PhoneNumber")
    private int phoneNumber;
    @Column(name = "Email")
    private String email;
    @Column(name = "Password")
    private String password;
    @Column(name = "NationalID")
    private int nationalID;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "AuthID")
    private Auth auth;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "OrgID")
    private Orga userOrga;


    @OneToMany(mappedBy = "userShareds", cascade = CascadeType.ALL)
    private List<Shared> shareds = new ArrayList<>();

    public User() {}

    public User(int userID, String fullName, String dob, int phoneNumber, String email, String password, int nationalID) {
        this.userID = userID;
        this.fullName = fullName;
        this.dob = dob;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
        this.nationalID = nationalID;
    }

    public Auth getAuth() {
        return auth;
    }

    public void setAuth(Auth auth) {
        this.auth = auth;
    }

    public Orga getUserOrga() {
        return userOrga;
    }

    public void setUserOrga(Orga userOrga) {
        this.userOrga = userOrga;
    }

    public List<Shared> getShareds() {
        return shareds;
    }

    public void setShareds(List<Shared> shareds) {
        this.shareds = shareds;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public int getNationalID() {
        return nationalID;
    }

    public void setNationalID(int nationalID) {
        this.nationalID = nationalID;
    }

}
