package com.example.webmvc_employee.repository;

import com.example.webmvc_employee.entity.EmployeeFamily;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class FamilyRepository {
    @PersistenceContext
    private EntityManager em;
    public EmployeeFamily findById(String id) {
        return em.find(EmployeeFamily.class, id);
    }
    public void save(EmployeeFamily family) {
        em.persist(family);
    }
    public void delete(EmployeeFamily family) {
        em.remove(family);
    }
}
