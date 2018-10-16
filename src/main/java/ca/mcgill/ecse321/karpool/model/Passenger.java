package ca.mcgill.ecse321.karpool.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import ca.mcgill.ecse321.karpool.model.UserRole;
import ca.mcgill.ecse321.karpool.model.Trip;

@Entity
public class Passenger extends UserRole
{
	private Trip trip;

	public void setTrip(Trip value) {
		this.trip = value;
	}
	
	@ManyToOne(targetEntity=Trip.class)
//	@JoinColumn(name="tripId")
	public Trip getTrip() {
		return this.trip;
	}

	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int passengerId;

	public void setPassengerId(int value) {
		this.passengerId = value;
	}

	@Id
	public int getPassengerId() {
		return this.passengerId;
	}
}
