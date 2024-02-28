package com.example.asso.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name = "app_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    @Size(max = 100)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    @Size(max = 100)
    private String lastName;

    @Column(name = "admin")
    private Boolean admin;

    @Column(nullable = false)
    @Size(max = 100)
    private String email;

    @Column(nullable = false)
    @Size(max = 100)
    private String password;

//    @Column(name = "phone", nullable = false)
//    @Size(max = 100)
//    private String phone;
//
//    @Column(name = "address", nullable = false)
//    @Size(max = 100)
//    private String address;
}
