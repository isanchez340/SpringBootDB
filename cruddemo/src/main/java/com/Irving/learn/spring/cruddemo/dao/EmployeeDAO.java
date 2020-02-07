package com.Irving.learn.spring.cruddemo.dao;

import java.util.List;
import com.Irving.learn.spring.cruddemo.entity.Employee;

public interface EmployeeDAO {

	public List<Employee> findAll();
}
