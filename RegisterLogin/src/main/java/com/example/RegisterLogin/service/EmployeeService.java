package com.example.RegisterLogin.service;

import com.example.RegisterLogin.dtos.EmployeeDTO;
import com.example.RegisterLogin.dtos.LoginDTO;
import com.example.RegisterLogin.response.LoginResponse;

public interface EmployeeService {
    String addEmployee(EmployeeDTO employeeDTO);

    LoginResponse loginEmployee(LoginDTO loginDTO);

}
