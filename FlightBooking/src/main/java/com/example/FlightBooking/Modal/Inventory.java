package com.example.FlightBooking.Modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="inventory")
public class Inventory {

	@Id
	@Column(name="invid")
	private long invId;
	
	@Column(name="count")
	private int count;


	
	
	public Inventory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Inventory(long invId, int count, int inventoryId) {
		super();
		this.invId = invId;
		this.count = count;
	
	}

	public long getInvId() {
		return invId;
	}

	public void setInvId(long invId) {
		this.invId = invId;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}


	
}