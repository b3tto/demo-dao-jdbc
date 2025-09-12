package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		Scanner sc = new Scanner(System.in);
		List<Department> list = new ArrayList<>();
		
		/*
		System.out.println("====== TEST 1: insert department ======");
		Department dep = new Department(null, "Music");
		departmentDao.insert(dep);
		System.out.println("Inserted departmentId id = " + dep.getId());
		*/
		
		/*
		System.out.println("====== TEST 2: findAll department ======");
		list = departmentDao.findAll();
		for (Department dep : list) {
			System.out.println(dep);
		}
		*/
		
		
		System.out.println("====== TEST 3: Update department ======");
		System.out.print("Entry with name for updating: ");
		String name = sc.next();
		List<Department> list1 = new ArrayList<>();
		list1 = departmentDao.findAll();
		for (Department dep : list1) {
			if (name.equals(dep.getName())) {
				Integer id = dep.getId();
				System.out.print("Enter with new name: ");
				String newName = sc.next();
				Department department = new Department(id, newName);
				departmentDao.update(department);
			}
		}
		System.out.println("Name entered do not exists.");
	}

}
