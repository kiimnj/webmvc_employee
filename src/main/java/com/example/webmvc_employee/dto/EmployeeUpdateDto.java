package com.example.webmvc_employee.dto;

import com.example.webmvc_employee.entity.EmpType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeUpdateDto {
    private String empId;
//    @Enumerated(value = EnumType.STRING)
//    @Column(name = "emp_type",length = 10) entity가 아니므로 쓰면 X (테이블 매핑 정보이므로)
    private EmpType empType;
    private Long salary;
}
