package com.example.RegisterLogin.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {

    private int employeeid;

    private String employeename;

    private String email;

    private String password;

}
