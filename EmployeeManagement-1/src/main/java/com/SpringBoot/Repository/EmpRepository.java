package com.SpringBoot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBoot.Entity.Employee;

public interface EmpRepository extends JpaRepository<Employee, Integer> {

}