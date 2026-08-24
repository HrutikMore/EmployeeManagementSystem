package com.example.employeemanagement.service;

import com.example.employeemanagement.dto.EmployeeRequest;
import com.example.employeemanagement.dto.EmployeeResponse;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EmployeeService {

    EmployeeResponse createEmployee(EmployeeRequest request);

    EmployeeResponse getEmployeeById(Long id);

    Page<EmployeeResponse> getAllEmployees(
            int page,
            int size,
            String sortBy,
            String direction
    );

    EmployeeResponse updateEmployee(
            Long id,
            EmployeeRequest request
    );

    void deleteEmployee(Long id);

    Page<EmployeeResponse> searchEmployees(
            String name,
            int page,
            int size
    );

    List<EmployeeResponse> getEmployeesByDepartment(
            String department
    );
}