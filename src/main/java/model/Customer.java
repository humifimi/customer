package model;


import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

@Component
public class Customer {

	@NotEmpty
	@Size(min = 1, max = 20, message="name should be between 1 and 20 characters")
	private String username;
	
	@NotEmpty
	@Size(min = 6, max = 50, message="password should be between 6 and 50 characters")
	private String password;
	
	@NotNull
	@Past(message="must be in past date")
	private Date birthdate;
	
	private String address;
	
	@NotEmpty(message="Sex may not be empty")
	private String sex;
	
	public Customer(){
		
	}
	public Customer(String username, String password, Date birthdate,
			String address, String sex) {
		super();
		this.username = username;
		this.password = password;
		this.birthdate = birthdate;
		this.address = address;
		this.sex = sex;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
	
	
}
