package com.example.user_list.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Data
@Getter
@Setter
@Entity(name = "users")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "First name", nullable = false)
    private String first_name;

    @Column(name = "Last name", nullable = false)
    private String last_name;

    @Column(name = "Phone number",nullable = false)
    private String phone_number;

    @Column(name = "E-mail", nullable = false)
    private String email;

    @Column(name = "Created date", nullable = false)
    private Instant createdAt;

}
