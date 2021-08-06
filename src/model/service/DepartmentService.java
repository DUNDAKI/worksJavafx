package model.service;

import java.util.ArrayList;
import java.util.List;

import model.entities.Department;

public class DepartmentService {

	public List<Department> findAll(){
		List<Department>  list = new ArrayList<>();
		list.add(new Department(1, "Ana"));
		list.add(new Department(2, "Paula"));
		list.add(new Department(3, "Pedro"));
		list.add(new Department(4, "Favinha"));
		
		return list;
	}
}
