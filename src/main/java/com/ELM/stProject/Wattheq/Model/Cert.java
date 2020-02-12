package com.ELM.stProject.Wattheq.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Certs")
@Table
public class Cert {

    @Id
    @Column(name = "CertID")
    private int certID;
    @Column(name = "CertName")
    private String certName;
    @Column(name = "CertType")
    private String certType;
    @Column(name = "CertDescription")
    private String certDescription;
    @Column(name = "CertDate")
    private String certDate;
    @Column(name = "CertStatus")
    private String certStatus;
    @Column(name = "CertDocument")
    private String certDocument;
    @Column(name = "UserID")
    private int userID;
    @Column(name = "OrgID")
    private int orgID;

    public Cert() {}

    public Cert(int certID, String certName, String certType, String certDescription, String certDate, String certStatus, String certDocument, int userID, int orgID) {
        this.certID = certID;
        this.certName = certName;
        this.certType = certType;
        this.certDescription = certDescription;
        this.certDate = certDate;
        this.certStatus = certStatus;
        this.certDocument = certDocument;
        this.userID = userID;
        this.orgID = orgID;
    }

    public int getCertID() {
        return certID;
    }

    public void setCertID(int certID) {
        this.certID = certID;
    }

    public String getCertName() {
        return certName;
    }

    public void setCertName(String certName) {
        this.certName = certName;
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    public String getCertDescription() {
        return certDescription;
    }

    public void setCertDescription(String certDescription) {
        this.certDescription = certDescription;
    }

    public String getCertDate() {
        return certDate;
    }

    public void setCertDate(String certDate) {
        this.certDate = certDate;
    }

    public String getCertStatus() {
        return certStatus;
    }

    public void setCertStatus(String certStatus) {
        this.certStatus = certStatus;
    }

    public String getCertDocument() {
        return certDocument;
    }

    public void setCertDocument(String certDocument) {
        this.certDocument = certDocument;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getOrgID() {
        return orgID;
    }

    public void setOrgID(int orgID) {
        this.orgID = orgID;
    }
}
