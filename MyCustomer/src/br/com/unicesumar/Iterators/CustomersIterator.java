package br.com.unicesumar.Iterators;

import java.util.ArrayList;

import br.com.unicesumar.Model.Customer;
import br.com.unicesumar.Model.CustomerNull;

public class CustomersIterator {
	private ArrayList<Customer> listCustomers;
	private int actual;
	private int last;
	
	public CustomersIterator(){
		this.actual = 0;
		this.last = this.listCustomers.size();
	}
	
	public Customer getNext(){
		Customer customer = listCustomers.get(actual);
		this.actual++;
		return customer;
	}
	
	public void addCustomer(Customer c){
		this.listCustomers.add(c);
	}
	
	public void removeCustomer(Customer c){
		this.listCustomers.remove(c);
	}
	
	public int getIndexAtual(){
		return this.actual;
	}
	
	public int getSize(){
		return this.last;
	}
	
	public Object searchId(int id){
		for(int i = 0; i < this.getSize(); i++){
			Customer c = this.listCustomers.get(i);
			if(c.getId() == id){
				return c;
			}
		}
		return new CustomerNull();
	}
}
