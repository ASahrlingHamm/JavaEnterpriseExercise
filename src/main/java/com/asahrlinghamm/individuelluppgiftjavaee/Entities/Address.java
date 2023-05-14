package com.asahrlinghamm.individuelluppgiftjavaee.Entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="address")
public class Address {


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int addressId;

    @Column(length = 45, nullable = false)
    private String street;
    @Column(length = 45, nullable = false)
    private String city;
    @Column(length = 5, nullable = false)
    private int postalCode;

    public Address() {
    }


    public Address(String street, int postalCode, String city) {
        this.street = street;
        this.postalCode = postalCode;
        this.city = city;
    }


    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

   /* public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }*/

}
