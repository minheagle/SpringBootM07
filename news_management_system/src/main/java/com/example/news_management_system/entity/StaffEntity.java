package com.example.news_management_system.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "staffs")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StaffEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "staff_id")
    private long staffId;

    @Column(name = "staff_name")
    private String staffName;

    @Column(name = "staff_address")
    private String staffAddress;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;
}
