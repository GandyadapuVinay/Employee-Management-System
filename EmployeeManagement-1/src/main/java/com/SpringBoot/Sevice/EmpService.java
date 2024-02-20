package com.SpringBoot.Sevice;

import java.util.List;

import com.SpringBoot.Entity.Employee;

public interface EmpService {

	public Employee saveEmp(Employee emp);

	public List<Employee> getAllEmp();

	public Employee getEmpById(int id);

	public boolean deleteEmp(int id);

}
