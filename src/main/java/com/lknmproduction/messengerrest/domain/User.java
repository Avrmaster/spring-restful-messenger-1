package com.lknmproduction.messengerrest.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private String username;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "photo_url")
    private String photoUrl;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "last_seen")
    private Date lastSeen;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_fk")
    private List<Device> deviceList;

}