package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "user_details")
public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String address;
    private String phoneNumber;

    // One-to-one relationship with User
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Constructors
    public UserDetails() {}

    public UserDetails(String address, String phoneNumber, User user) {
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.user = user;
    }

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
}

