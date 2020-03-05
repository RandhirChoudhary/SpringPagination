package com.spring.PaginationApplication.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.spring.PaginationApplication.entity.EmployeeEntity;
import com.spring.PaginationApplication.repo.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;
	@Override
	public List<EmployeeEntity> getAllEmployees(Integer pageNo, Integer pageSize, String sortBy) {
		Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));
		
		//Sorting
		/*Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by("email").ascending()); 
		 
		Page<EmployeeEntity> pagedResult = employeeRepository.findAll(paging);*/
		
		Page<EmployeeEntity> pagedResult = employeeRepository.findAll(paging);
        
        if(pagedResult.hasContent()) {
            return pagedResult.getContent();
        } else {
            return new ArrayList<EmployeeEntity>();
        }
	}

}
