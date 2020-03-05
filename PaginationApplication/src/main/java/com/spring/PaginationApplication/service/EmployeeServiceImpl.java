package com.spring.PaginationApplication.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.PaginationApplication.entity.EmployeeEntity;
import com.spring.PaginationApplication.repo.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	EmployeeRepository employeeRepository;
	@Override
	public List<EmployeeEntity> getAllEmployees(Integer pageNo, Integer pageSize, String sortBy) {
		// TODO Auto-generated method stub
		return null;
	}

}
