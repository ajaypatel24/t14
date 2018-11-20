package ca.mcgill.ecse321.karpool.application.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import ca.mcgill.ecse321.karpool.application.model.UserRole;
import ca.mcgill.ecse321.karpool.application.model.Car;
import ca.mcgill.ecse321.karpool.application.model.Trip;

@Entity
@Table(name="driver")
public class Driver extends UserRole
{
	private Car car;

	public void setCar(Car value) {
		this.car = value;
	}

	@OneToOne
	public Car getCar() {
		return this.car;
	}

	private Set<Trip> trips;

	public void addTrip(Trip trip) {
		this.trips.add(trip);
		trip.setDriver(this);
	}
	
	public void removeTrip(Trip trip) {
        this.trips.remove(trip);
        trip.setDriver(null);
    }

	@Transient
	@OneToMany(mappedBy = "driver", cascade = CascadeType.ALL)
	public Set<Trip> getTrip() {
		if (this.trips == null) {
			this.trips = new HashSet<Trip>();
		}
		return this.trips;
	}
	
	private String name;

	public void setName(String value) {
		this.name = value;
	}

	@Id
	public String getName() {
		return this.name;
	}

	private String email;

	public void setEmail(String value) {
		this.email = value;
	}

	public String getEmail() {
		return this.email;
	}

	private String phoneNumber;

	public void setPhoneNumber(String value) {
		this.phoneNumber = value;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	private String password;

	public void setPassword(String value) {
		this.password = value;
	}

	public String getPassword() {
		return this.password;
	}
	
	private double rating;
	//private ArrayList<double[]> ratings = new ArrayList<double[]>();

	//MADE CHANGES TO SetRATING
//	public void addRating(double value) {
//		this.ratings.add(new double[] {value});
//	}
//	
//	public double getNumberOfRatings() {
//	return this.ratings.size();
//	}
	
	public void setRating(double value) {
		this.rating = value;
	}

	public double getRating() {
		return this.rating;
	}

	private boolean criminalRecord;

	public boolean getRecord() {
		return this.criminalRecord;
	}

	public void setRecord(boolean criminalRecord) {
		this.criminalRecord = criminalRecord;
	}
}
