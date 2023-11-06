package com.example.webmvc_employee.dto;

import com.example.webmvc_employee.entity.EmpType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeCreateDto {
    private String empId;

    private String EmpName;
    private EmpType empType;
    private String joinDate;
    private Long salary;

    private int deptId;
    private String FamilyName;
    private String FamilyType;
}
