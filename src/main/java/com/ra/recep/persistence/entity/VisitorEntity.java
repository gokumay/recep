package com.ra.recep.persistence.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "visitors")
@Data
public class VisitorEntity {
    @Id
    @GenericGenerator(name = "hibernate-uuid", strategy = "org.hibernate.id.UUIDGenerator")
    @GeneratedValue(generator = "hibernate-uuid")
    @Column(name = "visitor_id")
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "phone")
    private String phone;
    @Column(name = "company")
    private String company;
    @Column(name = "purpose")
    private String purpose;
    @Column(name = "category_id")
    private String category_id;
    @Column (name = "check_in_time")
    private String check_in_time;
}
