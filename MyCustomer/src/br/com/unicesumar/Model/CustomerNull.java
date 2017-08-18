package br.com.unicesumar.Model;

public class CustomerNull extends Customer {
	private int id;
	private String name;
	private String email;
	private String phone;
	
	public CustomerNull(){
		super();
		this.name = null;
		this.email = null;
		this.phone = null;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public boolean isNull(){
		return true;
	}
	
	
}
