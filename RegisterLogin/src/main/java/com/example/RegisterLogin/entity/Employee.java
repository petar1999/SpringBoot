package com.example.RegisterLogin.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="employee")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @Column(name = "employee_id", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int employeeid;


    @Column(name = "employee_name", length = 255)
    private String employeename;


    @Column(name = "email", length = 255)
    private String email;


    @Column(name = "password", length = 255)
    private String password;

}
