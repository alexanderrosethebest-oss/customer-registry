package hu.example.customer.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
    @Column(name = "postal_code", nullable = false) private String postalCode;
    @Column(nullable = false) private String city;
    @Column(nullable = false) private String street;
    // protected no-arg konstruktor, publikus Address(postalCode, city, street), getterek
}
