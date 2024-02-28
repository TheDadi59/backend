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
@Table(name = "contacts")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, updatable = false)
    private String id;

    @Column(name = "title", nullable = false)
    @Size(max = 100)
    private String title;

    @Column(name = "price", nullable = true, columnDefinition = "DECIMAL(10,2)")
    private double price;

    @Column(name = "enable", nullable = false)
    private String enable;

    @Column(name = "photoProduitUrl", nullable = false)
    @Size(max = 200)
    private String photoProduitUrl;
}
