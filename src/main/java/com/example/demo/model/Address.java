package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Address {
	@Id
	@SequenceGenerator(
			name = "address_sequence",
			sequenceName = "address_sequence",
			allocationSize = 1
	)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "address_sequence"
	)
	
   	private long id;
   	
    private String address;
    
    private String areaCode;
    @OneToMany
    private List<Customer> customers;

    public Address() {
    	
	}
    
	public Address(long id, String address, String areaCode) {
		super();
		this.id = id;
		this.address = address;
		this.areaCode = areaCode;
	}
	
	public long getId() {
		return id;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAreaCode() {
		return areaCode;
	}
	
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public void setId(long id) {
		this.id = id;
	}
}
