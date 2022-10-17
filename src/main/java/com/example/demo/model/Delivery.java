package com.example.demo.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table
public class Delivery {
	@Id
	@SequenceGenerator(
			name = "delivery_sequence",
			sequenceName = "delivery_sequence",
			allocationSize = 1
	)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "delivery_sequence"
	)

   	private long id;

    private LocalDateTime startTime;
    
    private LocalDateTime endTime;
    
    private State deliveryStatus;
	  
    @ManyToOne
	@JoinColumn(name = "order_id")
	private Order order;
    
    @ManyToOne
	@JoinColumn(name = "delivery_person_id")
	private DeliveryPerson deliveryPerson;
    
    public Delivery() {
    	
	}
    
	public Delivery(long id, LocalDateTime startTime, State deliveryStatus) {
		this.id = id;
		this.startTime = startTime;
		this.deliveryStatus = deliveryStatus;
		this.endTime = startTime.plusMinutes(15);
	}
	
	public long getId() { // no set Id here
		return id;	
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}
	
	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public LocalDateTime getEndTime() { // no set endTime here
		return endTime;
	}

	public State getDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(State deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public DeliveryPerson getDeliveryPerson() {
		return deliveryPerson;
	}

	public void setDeliveryPerson(DeliveryPerson deliveryPerson) {
		this.deliveryPerson = deliveryPerson;
	}

	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}

	public void setId(long id) {
		this.id = id;
	}
}
