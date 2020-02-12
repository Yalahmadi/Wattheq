package com.ELM.stProject.Wattheq.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Organizations")
@Table
public class Orga {

    @Id
    @Column(name = "OrganizationID")
    private int orgaID;
    @Column(name = "OrganizationName")
    private String orgaName;
    @Column(name = "OrganizationAddress")
    private String orgaAddress;
    @Column(name = "OrganizationContactNumber")
    private String orgaContactNumber;

    public Orga() {}

    public Orga(int orgaID, String orgaName, String orgaAddress, String orgaContactNumber) {
        this.orgaID = orgaID;
        this.orgaName = orgaName;
        this.orgaAddress = orgaAddress;
        this.orgaContactNumber = orgaContactNumber;
    }

    public int getOrganizationID() {
        return orgaID;
    }

    public void setOrganizationID(int orgaID) {
        this.orgaID = orgaID;
    }

    public String getOrganizationName() {
        return orgaName;
    }

    public void setOrganizationName(String orgaName) {
        this.orgaName = orgaName;
    }

    public String getOrganizationAddress() {
        return orgaAddress;
    }

    public void setOrganizationAddress(String orgaAddress) {
        this.orgaAddress = orgaAddress;
    }

    public String getOrganizationContactNumber() {
        return orgaContactNumber;
    }

    public void setOrganizationContactNumber(String orgaContactNumber) {
        this.orgaContactNumber = orgaContactNumber;
    }
}
