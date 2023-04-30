/**************************************************************
* Name        : Data Structures Final Project
* Author      : Ian Folger
* Created     : Apr 2, 2023  
* Course      : CIS 152 Data Structures
* Version     : 1.0
* OS          : Windows 10
* Copyright   : This is my own original work based on
*               specifications issued by our instructor
* Description : The Volunteer class that is used for the program. 
* This class will create the volunteer objects that will be stored 
* and show on the gui program
* Academic Honesty: I attest that this is my original work.
* I have not used unauthorized source code, either modified or 
* unmodified. I have not given other fellow student(s) access to
* my program.         
***************************************************************/

public class Volunteer {
	
	private int volunteerId = 0;
	private String volunteerName;
	private int volunteerAge;
	private String volunteerEmail;
	private String volunteerPhoneNumber;
	
	/**
	 * 
	 */
	public Volunteer() {
		super();
	}

	/**
	 * @param volunteerId
	 * @param volunteerName
	 * @param volunteerAge
	 * @param volunteerEmail
	 * @param volunteerPhoneNumber
	 */
	public Volunteer(LinkedList list, String volunteerName, int volunteerAge, String volunteerEmail, String volunteerPhoneNumber) {
		super();
		
		this.volunteerId = list.getVolunteerLastNode();
		this.volunteerName = volunteerName;
		this.volunteerAge = volunteerAge;
		this.volunteerEmail = volunteerEmail;
		this.volunteerPhoneNumber = volunteerPhoneNumber;
	}

	/**
	 * @return the volunteerId
	 */
	public int getVolunteerId() {
		return volunteerId;
	}

	/**
	 * @param volunteerId the volunteerId to set
	 */
	public void setVolunteerId(int volunteerId) {
		this.volunteerId = volunteerId;
	}

	/**
	 * @return the volunteerName
	 */
	public String getVolunteerName() {
		return volunteerName;
	}

	/**
	 * @param volunteerName the volunteerName to set
	 */
	public void setVolunteerName(String volunteerName) {
		this.volunteerName = volunteerName;
	}

	/**
	 * @return the volunteerAge
	 */
	public int getVolunteerAge() {
		return volunteerAge;
	}

	/**
	 * @param volunteerAge the volunteerAge to set
	 */
	public void setVolunteerAge(int volunteerAge) {
		this.volunteerAge = volunteerAge;
	}

	/**
	 * @return the volunteerEmail
	 */
	public String getVolunteerEmail() {
		return volunteerEmail;
	}

	/**
	 * @param volunteerEmail the volunteerEmail to set
	 */
	public void setVolunteerEmail(String volunteerEmail) {
		this.volunteerEmail = volunteerEmail;
	}

	/**
	 * @return the volunteerPhoneNumber
	 */
	public String getVolunteerPhoneNumber() {
		return volunteerPhoneNumber;
	}

	/**
	 * @param volunteerPhoneNumber the volunteerPhoneNumber to set
	 */
	public void setVolunteerPhoneNumber(String volunteerPhoneNumber) {
		this.volunteerPhoneNumber = volunteerPhoneNumber;
	} 

	/**
	 * @return the a string of the whole volunteer object
	 */
	@Override
	public String toString() {
		return "Volunteer Id: " + volunteerId + "  ||  Name: " + volunteerName + "  ||  Age: "
				+ volunteerAge + "  ||  Email: " + volunteerEmail + "  ||  Phone Number: " + volunteerPhoneNumber;
	}
	
}
