package Entities;

import java.util.Date;

public class Player {
	private int Id;
	private String FirstName;
	private String LastName;
    private String NationalityId;
    private Date DateOfBirh;
 
	public Player() { 
	}
	public Player(int id, String firstName, String lastName,Date dateOfBirh,String nationalityId) {
		super();
		Id = id;
		FirstName = firstName;
		LastName = lastName;
		NationalityId=nationalityId;
		setDateOfBirh(dateOfBirh);
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getNationalityId() {
		return NationalityId;
	}
	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}
	public Date getDateOfBirh() {
		return DateOfBirh;
	}
	public void setDateOfBirh(Date dateOfBirh) {
		DateOfBirh = dateOfBirh;
	}   
	
}
