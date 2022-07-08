package com.tns.jpacrud.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InheritanceTest {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		System.out.println("1");
		
		
		//create one employee
		Employee employee = new Employee();  // object : employee
		employee.setName("Amit");
		employee.setSalary(50000); 
		em.persist(employee);  // insert
		System.out.println("2");
		
		
		//create one manager
		Manager manager = new Manager();
		manager.setName("Kuveskar");
		manager.setSalary(500);
		manager.setDepartmentName("Sales");
		em.persist(manager);   // insert
		
		
		System.out.println("3");
		em.getTransaction().commit();
		em.close();
		factory.close();
	}
}