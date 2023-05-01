/**************************************************************
* Name        : Data Structures Final Project
* Author      : Ian Folger
* Created     : Apr 2, 2023  
* Course      : CIS 152 Data Structures
* Version     : 1.0
* OS          : Windows 10
* Copyright   : This is my own original work based on
*               specifications issued by our instructor
* Description : This is the linked list class. This class creates the lists
* that the objects for Volunteer and Jobs will be stored in through
* Nodes
* Academic Honesty: I attest that this is my original work.
* I have not used unauthorized source code, either modified or 
* unmodified. I have not given other fellow student(s) access to
* my program.         
***************************************************************/

public class LinkedList {
	
	private int size; //Tells us the size of the list
	private int position; //Tells us the will position of the current item being focused on
	Node Head; //Creates the Node list
	
	public LinkedList() { //Constructor
		Head = null;
		position = 0;
		size = 0;
	}
	
	/**
	 * @return If queue is empty
	 * checks to see if size equals 0, and if it is, will determine that it is empty
	 */
	public boolean isEmpty() {
		if(size() == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * @return Returns number of elements in the list
	 */
	public int size() {
		
		return this.size; 
	}
	
	/**
	 * @return Returns the position of a node
	 */
	public int position(int arrayPosition) {
		
		this.position = arrayPosition;
		return this.position; 
	}
	
	/**
	 * @return Returns an integer that will be used for the volunteers id number
	 */
	public int getVolunteerLastNode() {
		if(Head == null) {
			return 1;		//Returns one if nothing is with the Volunteer list
		}
		
		Node currentNode = Head;
		Node prevNode = null;
		
		while(currentNode.nextNode() != null) {
			prevNode = currentNode;
			currentNode = currentNode.nextNode(); //While loop that goes to the end of the list
		}
		
		int currentId = currentNode.grabVolunteerId(); //Grabs the last node of list and adds it to one two create the new id
		int newId = currentId + 1;
		return newId;
	}
	
	/**
	 * @return Returns an integer that will be used for the Jobs id number
	 */
	public int getJobLastNode() { //Function is similar to getVolunteerLastNode. Used for setting up the jobs
		if(Head == null) {
			return 1;
		}
		
		Node currentNode = Head;
		Node prevNode = null;
		
		while(currentNode.nextNode() != null) {
			prevNode = currentNode;
			currentNode = currentNode.nextNode();
		}
		
		int currentId = currentNode.grabJobId();  //Grabs the last node of list and adds it to one two create the new id
		int newId = currentId + 1;
		return newId;
	}
	
	/**
	 * @return Returns nothing. It updates the node list by adding a new node to the end of the list
	 */
	public void add(Object item){
		if(Head == null) {
			Head = new Node(item);
		}
		
		Node currentNode = Head;
		Node prevNode = null;
		
		while(currentNode.nextNode() != null) {
			prevNode = currentNode;
			currentNode = currentNode.nextNode();
		}
		
		currentNode.setNextNode(new Node(item));
		
		size = size + 1;

	}
	
	/**
	 * @return Returns nothing. It updates the node list by removing the node with the specified id
	 * @throws ListEmptyException 
	 */
	public void remove(int item) throws ListEmptyException {
		
		Node currentNode = Head;
		Node prevNode = null;
		boolean idCheck = false;
		
		for(int i = 0; i <= size; i++) {
			if(item == currentNode.grabVolunteerId()) { //First checks if there is an entry within the list, with the same id that is requested to be deleted
				idCheck = true;
				break;
			}
			else {
				prevNode = currentNode;
				currentNode = currentNode.nextNode();
			}
		}
		

		if(! this.isEmpty() && idCheck == true) { //Checks to make the list is not empty and the id has passed the idcheck
			currentNode = Head;
			prevNode = null;
			for(int i = 0; i <= size; i++) {
				if(currentNode == Head && item == currentNode.grabVolunteerId()) { //Checks if the specified Id is at the front of the linked list
					Head = currentNode.nextNode();
					size = size - 1;
					break;
				}
				else if(item == currentNode.grabVolunteerId()) { //If not, will continue through the for loop until it is found or isn't
					prevNode.setNextNode(currentNode.nextNode());
					size = size - 1;
					break;
				}
				else {
					prevNode = currentNode;
					currentNode = currentNode.nextNode();
				}
			}
		}
		else {
			throw new ListEmptyException(); 
		}
		
	}
	
	/**
	 * @return Returns the volunteersName by going through each node.
	 */
	public String grabName(int selectedVolunteerId) {
		
		Node currentNode = Head;
		Node prevNode = null;
		
		String volunteerName = null;
		
		for(int i = 0; i <= size; i++) {
			if(selectedVolunteerId == currentNode.grabVolunteerId()) {
				volunteerName = currentNode.grabVolunteerName();
			}
			else {
				prevNode = currentNode;
				currentNode = currentNode.nextNode();
			}
		}
		
		return volunteerName;
	}
	
	/**
	 * @return Returns boolean. Checks to make sure their is an entry with the same ID that was entered in the text box
	 * @throws ListEmptyException 
	 */
	public boolean verifyID(int selectedVolunteerId) {
		
		Node currentNode = Head;
		Node prevNode = null;
		
		boolean volunteerIdCheck = false;
		
		for(int i = 0; i <= size; i++) {
			if(selectedVolunteerId == currentNode.grabVolunteerId()) {
				volunteerIdCheck = true;
			}
			else {
				prevNode = currentNode;
				currentNode = currentNode.nextNode();
			}
		}
		
		return volunteerIdCheck;
	}
	
	/**
	 * @return Returns nothing. It updates the linked list by sorting the linked list by the days
	 * @throws ListEmptyException 
	 */
	public void daySelectionSort() throws ListEmptyException {
		Node currentNode = Head;
		currentNode = currentNode.next; //Sends the current Node to the next one, due to a strange error for it seemed to duplicate an entry in the list
		if(! this.isEmpty()) {
			while (currentNode != null) {
				Node temp1 = currentNode;
				Node temp2 = temp1.next;
			    while (temp2 != null) {
			    	String temp1Day = temp1.grabJobDay(); //The current node and the next node each grabs the day from their own node
			        String temp2Day = temp2.grabJobDay();
			        int tempDayNum = determineDay(temp1Day); //Each converts the day into a number so the nodes can be compared
			        int temp2Num = determineDay(temp2Day);
			        if (tempDayNum > temp2Num) { //Checks if the currentNode is greater than the next node
			        	temp1 = temp2; //If so, changes the currentNode
			        }
			        temp2 = temp2.next; //Moves onto the next node that will be compared
			    }
			    
			    Object updatedObject =  currentNode.data;
			    currentNode.data = temp1.data;
			    temp1.data = updatedObject;			//Updates the node list so that it reflects the new placement
			    currentNode = currentNode.next;
			}
			
		}
		else {
			throw new ListEmptyException(); 
		}
	}
	
	/**
	 * @return Returns nothing. It updates the linked list by sorting the linked list by the volunteers id
	 * @throws ListEmptyException 
	 */
	public void volunteerSelectionSort() throws ListEmptyException {
		Node currentNode = Head;
		currentNode = currentNode.next; //Sends the current Node to the next one, due to a strange error for it seemed to duplicate an entry in the list
		if(! this.isEmpty()) {
			while (currentNode != null) {
				Node temp1 = currentNode;
				Node temp2 = temp1.next;
			    while (temp2 != null) {
			    	int temp1Id = temp1.grabJobVolunteerId(); //The current node and the next node each grabs the volunteerId from their node within the taken jobs list
			    	int temp2Id  = temp2.grabJobVolunteerId();
			        if (temp1Id > temp2Id) { //Checks if the currentNode is greater than the next node
			        	temp1 = temp2; //If so, changes the currentNode
			        }
			        temp2 = temp2.next; //Moves onto the next node that will be compared
			    }
			    
			    Object updatedObject =  currentNode.data;
			    currentNode.data = temp1.data;
			    temp1.data = updatedObject;			//Updates the node list so that it reflects the new placement
			    currentNode = currentNode.next;
			}
			
		}
		else {
			throw new ListEmptyException(); 
		}
	}
	
	/**
	 * @return Returns nothing. It updates the linked list by sorting the linked list by the jobs id to reset the list
	 * @throws ListEmptyException 
	 */
	public void resetSelectionSort() throws ListEmptyException {
		Node currentNode = Head;
		currentNode = currentNode.next;		//Sends the current Node to the next one, due to a strange error for it seemed to duplicate an entry in the list
		if(! this.isEmpty()) {
			while (currentNode != null) {
				Node temp1 = currentNode;
				Node temp2 = temp1.next;
			    while (temp2 != null) {
			    	int temp1IdNum = temp1.grabJobId(); //The current node and the next node each grabs the job Id from their node within the taken jobs list
			    	int temp2Num = temp2.grabJobId();
			        if (temp1IdNum > temp2Num) { //Checks if the currentNode is greater than the next node
			        	temp1 = temp2;  //If so, changes the currentNode
			        }
			        temp2 = temp2.next;   //Moves onto the next node that will be compared
			    }
			    
			    Object updatedObject =  currentNode.data;
			    currentNode.data = temp1.data;
			    temp1.data = updatedObject;			//Updates the node list so that it reflects the new placement
			    currentNode = currentNode.next;
			}
			
		}
		else {
			throw new ListEmptyException(); 
		}
	}
	
	/**
	 * @return returns day result. Function used to help with the days sort
	 * @throws ListEmptyException 
	 */
	public int determineDay(String weekday) {
		int dayResult = 0;
		
		switch (weekday) {
	      case "Monday":
	    	  dayResult = 1;
	        break;
	      case "Tuesday":
	    	  dayResult = 2;
	        break;
	      case "Wednesday":
	    	  dayResult = 3;
	        break;
	      case "Thursday":
	    	  dayResult = 4;
	        break;
	      case "Friday":
	    	  dayResult = 5;
	        break;
	      case "Saturday":
	    	  dayResult = 6;
	        break;
	      case "Sunday":
	    	  dayResult = 7;
	        break;
	    }
		return dayResult;
	}
	
	/**
	 * @return Returns an updated job object that adds a volunteers id and name to the object and moves it to the taken job list
	 * @throws ListEmptyException 
	 */
	public Object jobTransfer(int selectedJobId, int selectedVolunteerId, String volunteerName, boolean vIdCheck) throws ListEmptyException {
		
		Node currentNode = Head;
		Node prevNode = null;
		boolean jobIdCheck = false;
		Object takenJob = new Jobs();
		
		for(int i = 0; i <= size; i++) {
			if(selectedJobId == currentNode.grabJobId()) { //First checks if the Job that was selected is in the open jobs list
				jobIdCheck = true;
				break;
			}
			else {
				prevNode = currentNode;
				currentNode = currentNode.nextNode();
			}
		}
		

		if(! this.isEmpty() && jobIdCheck == true && vIdCheck == true) {
			currentNode = Head;
			prevNode = null;
			
			for(int i = 0; i <= size; i++) {
				if(currentNode == Head && selectedJobId == currentNode.grabJobId()) {
					takenJob = currentNode.updateJob(selectedVolunteerId, volunteerName); //Sends the volunteerId and volunteerName to another function so they can be added to the object
					Head = currentNode.nextNode();						//Checks if the job is in the head of the list
					size = size - 1;
					break;
				}
				else if(selectedJobId == currentNode.grabJobId()) {
					takenJob = currentNode.updateJob(selectedVolunteerId, volunteerName);
					prevNode.setNextNode(currentNode.nextNode());			//If not, will go through the whole list until it is found or not
					size = size - 1;
					break;
				}
				else {
					prevNode = currentNode;
					currentNode = currentNode.nextNode();
				}
			}
			
			return takenJob;
		}
		else {
			throw new ListEmptyException(); 
		}
	}
	
	/**
	 * @return Returns an updated job object that removes the volunteers id and name from the object and moves it to the open job list
	 * @throws ListEmptyException 
	 */
	public Object jobReset(int selectedTakenJobId) throws ListEmptyException {
		
		Node currentNode = Head;
		Node prevNode = null;
		boolean jobIdCheck = false;
		Object openJob = new Jobs();
		
		for(int i = 0; i <= size; i++) {
			if(selectedTakenJobId == currentNode.grabJobId()) { //Checks to make sure the selected job is within the taken jobs list
				jobIdCheck = true;
				break;
			}
			else {
				prevNode = currentNode;
				currentNode = currentNode.nextNode();
			}
		}
		

		if(! this.isEmpty() && jobIdCheck == true) {
			currentNode = Head;
			prevNode = null;
			
			for(int i = 0; i <= size; i++) {
				if(currentNode == Head && selectedTakenJobId == currentNode.grabJobId()) {
					openJob = currentNode.resetJob();				//Checks if the object is in the head node
					Head = currentNode.nextNode();
					size = size - 1;
					break;
				}
				else if(selectedTakenJobId == currentNode.grabJobId()) {
					openJob = currentNode.resetJob();
					prevNode.setNextNode(currentNode.nextNode());	//If not, will go through the whole list until it is found or not
					size = size - 1;
					break;
				}
				else {
					prevNode = currentNode;
					currentNode = currentNode.nextNode();
				}
			}
			
			return openJob;
		}
		else {
			throw new ListEmptyException(); 
		}
	}
	
	/**
	 * @return Returns node list of the items within in the list
	 */
	public String printNodeList() {
		String nodeString = new String(); 
		Node currentNode = Head.nextNode();
		while(currentNode != null) {
			nodeString = nodeString + currentNode.getObject().toString() + "\n";
			currentNode = currentNode.nextNode();
		}
		return nodeString;  
	}
	
}

/**
 * Node class that will create the nodes that will hold each object that is placed within the linked list
 */
class Node {
	Node prev;
	Object data;
	Node next;
	
	Node () {
		
	}

	Node(Object objectData){ //Constructor
		prev = null;
		data = objectData;
		next = null;
	}
	
	/**
	 * @return Returns the object that is within the Node
	 */
	public Object getObject() { 
		return data;
	}
	
	/**
	 * Function that is used to grab the next node in line
	 */
	public Node nextNode() {
		return next;
	}
	
	/**
	 * Function that is used to set the Node within the list
	 */
	public void setNextNode(Node nextEntry) {
		next = nextEntry;
	}
	
	/**
	 * Function that is used to help grab the volunteerId by using the getVolunteerID function from the volunteer class
	 */
	public int grabVolunteerId() {
		Volunteer dummyObject = new Volunteer(); //Creates a dummy object that will hold the object. This is used in the other methods in the node class when needing to grab something from the object
		dummyObject = (Volunteer) data;
		int vId = dummyObject.getVolunteerId();
		return vId;
	}
	
	/**
	 * Function that is used to help grab the volunteerName by using the getVolunteerName function from the volunteer class
	 */
	public String grabVolunteerName() {
		Volunteer dummyObject = new Volunteer();
		dummyObject = (Volunteer) data;
		String vName = dummyObject.getVolunteerName();
		return vName;
	}

	/**
	 * Function that is used to help grab the jobId by using the getJobID function from the Job class
	 */
	public int grabJobId() {
		Jobs dummyObject = new Jobs();
		dummyObject = (Jobs) data;
		int vId = dummyObject.getJobID();
		return vId;
	}
	
	/**
	 * Function that is used to help grab the weekday by using the getJobWeekday function from the job class
	 */
	public String grabJobDay() {
		Jobs dummyObject = new Jobs();
		dummyObject = (Jobs) data;
		String jDay = dummyObject.getJobWeekday();
		return jDay;
	}
	
	/**
	 * Function that is used to help grab the volunteerId by using the getVolunteerID function from the job class
	 */
	public int grabJobVolunteerId() {
		Jobs dummyObject = new Jobs();
		dummyObject = (Jobs) data;
		int vId = dummyObject.getVolunteerId();
		return vId;
	}
	
	/**
	 * Function that is used to help place the volunteers name and id within the job object
	 */
	public Object updateJob(int volunteerId, String volunteerName) {
		Jobs dummyObject = new Jobs();
		dummyObject = (Jobs) data;
		dummyObject.setVolunteerId(volunteerId);
		dummyObject.setVolunteerName(volunteerName);
		return dummyObject;
	}
	
	/**
	 * Function that is used to help remove the volunteer name and id from the object
	 */
	public Object resetJob() {
		Jobs dummyObject = new Jobs();
		dummyObject = (Jobs) data;
		dummyObject.setVolunteerId(0);
		dummyObject.setVolunteerName("None");
		return dummyObject;
	}
}

