package Interfaces;


import java.util.List;

import javax.ejb.Remote;

import Entities.Employee;


@Remote
public interface InterfaceUser{
	List<Employee> getAllUsers();
	public Employee getUserId(int idU);
}

