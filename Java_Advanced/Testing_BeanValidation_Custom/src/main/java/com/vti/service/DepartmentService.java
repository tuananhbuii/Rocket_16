package com.vti.service;

import java.util.List;

import com.vti.entity.Department;
import com.vti.repository.DepartmentRepository;

public class DepartmentService {
	private DepartmentRepository DepRepository;

	public DepartmentService() {
		DepRepository = new DepartmentRepository();
	}

	public List<Department> getAllDepartmentAccounts() {

		return DepRepository.getAllDepartment();
	}

}

