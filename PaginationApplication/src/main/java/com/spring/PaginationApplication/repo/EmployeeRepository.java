package com.spring.PaginationApplication.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.spring.PaginationApplication.entity.EmployeeEntity;
@Repository
public interface EmployeeRepository extends PagingAndSortingRepository<EmployeeEntity, Long> {

}
