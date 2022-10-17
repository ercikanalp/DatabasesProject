package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class DeliveryPerson {
	@Id
	@SequenceGenerator(
			name = "deliveryperson_sequence",
			sequenceName = "deliveryperson_sequence",
			allocationSize = 1
	)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "deliveryperson_sequence"
	)

   	private long id;
   	
    private String name;
    
    private String areaCode;
    
    private boolean isWorkingNow;
    @OneToMany
    private List<Delivery> deliveries;
    
    public DeliveryPerson() {
    	
	}
    
	public DeliveryPerson(long id, List<Delivery> deliveries, String name, String areaCode, boolean isWorkingNow) {
		this.id = id;
		this.deliveries = deliveries;
		this.name = name;
		this.areaCode = areaCode;
		this.isWorkingNow = isWorkingNow;
	}


	public long getId() {
		return id;
	}

	public List<Delivery> getDeliveries() {
		return deliveries;
	}
	public void setDeliveries(List<Delivery> deliveries) {
		this.deliveries = deliveries;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	public boolean isWorkingNow() {
		return isWorkingNow;
	}

	public void setWorkingNow(boolean isWorkingNow) {
		this.isWorkingNow = isWorkingNow;
	}

	public void setId(long id) {
		this.id = id;
	}
}
