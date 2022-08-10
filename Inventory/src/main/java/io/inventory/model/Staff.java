package io.inventory.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Staff")
public class Staff {


	@Id
	private String id;
	private String username;
	private String name;
	private String role;
	private String email;
	private String phoneNo;
	private String address;
	public Staff() {
		
	}
	public Staff(String id,String username, String name, String role, String email, String phoneNo, String address) {
		super();
		this.id = id;
		this.username=username;
		this.name = name;
		this.role = role;
		this.email = email;
		this.phoneNo = phoneNo;
		this.address = address;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username=username;
	}
	
	
	
	
}
