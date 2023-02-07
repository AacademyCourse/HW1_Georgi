package com.example.user_list.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity(name = "address")

public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "Country", nullable = false)
    private String country;
    @Column(name = "Sity", nullable = false)
    private String city;
    @Column(name = "Street", nullable = false)
    private String street;
    @Column(name = "Street number", nullable = false)
    private String street_number;

}
