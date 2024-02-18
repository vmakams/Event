package com.ee.entities;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "User", schema = "EventExplorer", catalog = "")
public class UserAccountEntity {
    @Id
    @Column(name = "customerid")
    private String customerid;
    @Basic
    @Column(name = "firstname")
    private String firstname;
    @Basic
    @Column(name = "lastname")
    private String lastname;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "password")
    private String password;
    @Basic
    @Column(name = "createts")
    private Timestamp createts;
    @Basic
    @Column(name = "updatets")
    private Timestamp updatets;

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
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

    public Timestamp getCreatets() {
        return createts;
    }

    public void setCreatets(Timestamp createts) {
        this.createts = createts;
    }

    public Timestamp getUpdatets() {
        return updatets;
    }

    public void setUpdatets(Timestamp updatets) {
        this.updatets = updatets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserAccountEntity that = (UserAccountEntity) o;
        return Objects.equals(customerid, that.customerid) && Objects.equals(firstname, that.firstname) && Objects.equals(lastname, that.lastname) && Objects.equals(email, that.email) && Objects.equals(password, that.password) && Objects.equals(createts, that.createts) && Objects.equals(updatets, that.updatets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerid, firstname, lastname, email, password, createts, updatets);
    }
}
