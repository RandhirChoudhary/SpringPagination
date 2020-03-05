package com.spring.PaginationApplication.service;

import java.util.List;

import com.spring.PaginationApplication.entity.EmployeeEntity;

public interface EmployeeService {
	public List<EmployeeEntity> getAllEmployees(Integer pageNo, Integer pageSize, String sortBy);
}
