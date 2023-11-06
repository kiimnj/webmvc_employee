package com.example.webmvc_employee.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class EmployeeFamily { //한명만 등록할 수 있다고 침
    @Id
    @Column(name = "family_id",length = 6)
    private String familyId; //== empId;
    private String FamilyName;
    private String FamilyType;
}
