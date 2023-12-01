package com.ra.model.admin;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "visitors")

@Data
public class Visitor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;
    private String email;
    private String phone;
    private String company;
    private String purpose;

    public Visitor(String name, String email, String phone, String company, String purpose) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.company = company;
        this.purpose = purpose;
    }

    public Visitor() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
}