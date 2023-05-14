package com.asahrlinghamm.individuelluppgiftjavaee.Entities;

import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;

@Entity
@Table(name="member")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 5, nullable = false)
    private int id;
    @Column(length = 25, nullable = false)
    private String firstName;
    @Column(length = 25, nullable = false)
    private String lastName;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "addressId")
    private Address address;
    @Column(length = 45, nullable = false)
    private String email;
    @Column(length = 20, nullable = true)
    private String phoneNumber;
   @DateTimeFormat(pattern = "yyyy-mm-dd")
   @Column(length=10, nullable = false)
    private String dateOfBirth;

    public Member() {
    }

    public Member(String firstName, String lastName, Address address, String email, String phoneNumber, String dateOfBirth) {
        //this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }




}
