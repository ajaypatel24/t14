package ca.mcgill.ecse321.karpool.model;
import javax.persistence.Entity;

import javax.persistence.Id;


@Entity
public class User {
	
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
	
	private Rating rating;


	public void setRating(Rating value) {
		this.rating = value;
	}


	public Rating getRating() {
		return this.rating;
	}

	private boolean criminalRecord;


	public boolean getRecord() {
		return this.criminalRecord;
	}

	public void setRecord(boolean criminalRecord) {
		this.criminalRecord = criminalRecord;
	}

	/**
	 * Constructor for User, rating is set to NONE and criminalRecord to false by default
	 * 
	 * @param name
	 * @param email
	 * @param phoneNumber
	 * @param password
	 * @param criminalRecord
	 */
	public User(String name, String email, String phoneNumber, String password) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.criminalRecord = false;
		this.rating = Rating.NONE;
	}
}
