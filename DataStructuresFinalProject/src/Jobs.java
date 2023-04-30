
/**************************************************************
* Name        : Data Structures Final Project
* Author      : Ian Folger
* Created     : Apr 2, 2023  
* Course      : CIS 152 Data Structures
* Version     : 1.0
* OS          : Windows 10
* Copyright   : This is my own original work based on
*               specifications issued by our instructor
* Description : The Jobs class that is used for the program. 
* This class will create the job objects that will be stored 
* and show on the gui program
* Academic Honesty: I attest that this is my original work.
* I have not used unauthorized source code, either modified or 
* unmodified. I have not given other fellow student(s) access to
* my program.         
***************************************************************/

public class Jobs {
	
	private int jobID;
	private String jobName;
	private String jobDesc;
	private String jobWeekday;
	private String jobTime;
	private String jobStatus;
	private int volunteerId;
	private String volunteerName;
	
	/**
	 * 
	 */
	public Jobs() {
		super();
	}

	/**
	 * @param jobID
	 * @param jobName
	 * @param jobDesc
	 * @param jobWeekday
	 * @param jobTime
	 * @param jobStatus
	 * @param volunteerId
	 * @param volunteerName
	 */
	public Jobs(int jobId, String jobName, String jobDesc, String jobWeekday, String jobTime, String jobStatus, int volunteerId, String volunteerName) {
		super();
		this.jobID = jobId;
		this.jobName = jobName;
		this.jobDesc = jobDesc;
		this.jobWeekday = jobWeekday;
		this.jobTime = jobTime;
		this.jobStatus = jobStatus;
		this.volunteerId = volunteerId;
		this.volunteerName = volunteerName;
	}

	/**
	 * @return the jobID
	 */
	public int getJobID() {
		return jobID;
	}

	/**
	 * @param jobID the jobID to set
	 */
	public void setJobID(int jobID) {
		this.jobID = jobID;
	}

	/**
	 * @return the jobName
	 */
	public String getJobName() {
		return jobName;
	}

	/**
	 * @param jobName the jobName to set
	 */
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	/**
	 * @return the jobDesc
	 */
	public String getJobDesc() {
		return jobDesc;
	}

	/**
	 * @param jobDesc the jobDesc to set
	 */
	public void setJobDesc(String jobDesc) {
		this.jobDesc = jobDesc;
	}

	/**
	 * @return the jobWeekday
	 */
	public String getJobWeekday() {
		return jobWeekday;
	}

	/**
	 * @param jobWeekday the jobWeekday to set
	 */
	public void setJobWeekday(String jobWeekday) {
		this.jobWeekday = jobWeekday;
	}

	/**
	 * @return the jobTime
	 */
	public String getJobTime() {
		return jobTime;
	}

	/**
	 * @param jobTime the jobTime to set
	 */
	public void setJobTime(String jobTime) {
		this.jobTime = jobTime;
	}

	/**
	 * @return the jobStatus
	 */
	public String getJobStatus() {
		return jobStatus;
	}

	/**
	 * @param jobStatus the jobStatus to set
	 */
	public void setJobStatus(String jobStatus) {
		this.jobStatus = jobStatus;
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
	 * @return the a string of the whole object
	 */
	@Override
	public String toString() {
		return "Job Id: " + jobID + "  ||  Job Name: " + jobName + "  ||  Job Desc: " + jobDesc + "  ||  Weekday: " + jobWeekday + "  ||  Time: " + jobTime + "  ||  Status: " + jobStatus + "  ||  Volenteer Id: " + volunteerId + "  ||  Volunteer Name: " + volunteerName; 
	}
}
