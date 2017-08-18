package br.com.unicesumar.Services;

import java.util.List;

import br.com.unicesumar.Dao.CustomerDAO;
import br.com.unicesumar.Model.Customer;

public class CustomerService {
private CustomerDAO dao;
	
	public CustomerService(){
		dao = new CustomerDAO();
	}
	
	public void insertCustomer(Customer c){
		this.dao.insert(c);
	}
	public List<Customer> listAll(){
		return dao.listAll();
	}
}
