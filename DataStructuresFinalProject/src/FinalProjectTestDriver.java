
/**************************************************************
* Name        : Data Structures Final Project
* Author      : Ian Folger
* Created     : Apr 2, 2023  
* Course      : CIS 152 Data Structures
* Version     : 1.0
* OS          : Windows 10
* Copyright   : This is my own original work based on
*               specifications issued by our instructor
* Description : Tester driver file that will test the methods of the linked list class
* Academic Honesty: I attest that this is my original work.
* I have not used unauthorized source code, either modified or 
* unmodified. I have not given other fellow student(s) access to
* my program.         
***************************************************************/

public class FinalProjectTestDriver {

	public static void main(String[] args) throws ListEmptyException {
		// TODO Auto-generated method stub
		LinkedList TestVolunteerList = new LinkedList();
		LinkedList TestOpenJobsList = new LinkedList();
		LinkedList TestTakenJobsList = new LinkedList();
		
		Volunteer volunteer1 = new Volunteer(TestVolunteerList, "Ian", 23, "erf@aol.com", "5555555555");
		Volunteer volunteer2 = new Volunteer(TestVolunteerList, "Frank", 33, "dcv@aol.com", "5551111111");
		Volunteer volunteer3 = new Volunteer(TestVolunteerList, "Bob", 24, "dfdf@aol.com", "5552222222");
		Volunteer volunteer4 = new Volunteer(TestVolunteerList, "Lisa", 21, "ddfc@aol.com", "5553333333");
		Volunteer volunteer5 = new Volunteer(TestVolunteerList, "Sarah", 26, "cvcv@aol.com", "5554444444");
		
		TestVolunteerList.add(volunteer1);
		TestVolunteerList.add(volunteer2);
		TestVolunteerList.add(volunteer3);
		TestVolunteerList.add(volunteer4);
		TestVolunteerList.add(volunteer5);
		
		
		Jobs job1 = new Jobs(1, "Trash pick up", "Help pick up trash around the park", "Wednesday", "10:10", "Open", 0, "None");
		Jobs job2 = new Jobs(2, "Food Bank Helper", "Help with delivery of donated food", "Monday", "12:30", "Open", 0, "None");
		Jobs job3 = new Jobs(3, "Library Assitant", "Help the library with any tasks", "Thursday", "9:00", "Open", 0, "None");
		Jobs job4 = new Jobs(4, "Food Bank Helper", "Help with delivery of donated food", "Tuesday", "12:30", "Open", 0, "None");
		TestOpenJobsList.add(job1);
		TestOpenJobsList.add(job2);
		TestOpenJobsList.add(job3);
		TestOpenJobsList.add(job4);
		
		Jobs job6 = new Jobs(6, "Trash pick up", "Help pick up trash around the park", "Wednesday", "10:10", "Open", 1, "Ian");
		Jobs job7 = new Jobs(7, "Food Bank Helper", "Help with delivery of donated food", "Monday", "12:30", "Open", 5, "Sarah");
		Jobs job8 = new Jobs(8, "Library Assitant", "Help the library with any tasks", "Thursday", "9:00", "Open", 3, "Bob");
		Jobs job9 = new Jobs(9, "Food Bank Helper", "Help with delivery of donated food", "Tuesday", "12:30", "Open", 3, "Bob");
		Jobs job10 = new Jobs(10, "Library Assitant", "Help the library with any tasks", "Friday", "9:00", "Open", 2, "Frank");
		TestTakenJobsList.add(job6);
		TestTakenJobsList.add(job7);
		TestTakenJobsList.add(job8);
		TestTakenJobsList.add(job9);
		TestTakenJobsList.add(job10);
		
		System.out.println("Test the size function. Should return a size of 5.");
		System.out.println(TestVolunteerList.size());
		
		System.out.println("Test the IsEmpty function. Should return false.");
		System.out.println(TestVolunteerList.isEmpty());
		
		System.out.println("Test the getVolunteerLastNode function. Used to help create the ids for the voluntter objects. Should an id of 6.");
		System.out.println(TestVolunteerList.getVolunteerLastNode()); //This seems to work fine when the gui is run, but in tests, thinks the head always = null
		
		System.out.println("Test the getJobLastNode function. Used to help create the ids for the job objects. Should an id of 5.");
		System.out.println(TestOpenJobsList.getJobLastNode());
		
		System.out.println("Test the add function. Should add a new object with a job id of 5.");
		System.out.println(TestOpenJobsList.printNodeList());
		Jobs job5 = new Jobs(5, "Library Assitant", "Help the library with any tasks", "Friday", "9:00", "Open", 0, "None");
		TestOpenJobsList.add(job1);
		System.out.println(TestOpenJobsList.printNodeList());
		
		System.out.println("Test the grabName function. Used to grab the name of the volunteer if the entered Id equals a volunteers . Name should be Ian.");
		System.out.println(TestVolunteerList.grabName(1));
		
		System.out.println("Test the verifyId function. Used to check if their is a user with the entered id. Should return true");
		System.out.println(TestVolunteerList.verifyID(1));
		
		System.out.println("Test the daySelectionSort function. Sorts the list by the days. Works for both Open and taken Job lists");
		System.out.println(TestOpenJobsList.printNodeList());
		TestOpenJobsList.daySelectionSort();
		System.out.println(TestOpenJobsList.printNodeList());
		System.out.println("Test the resetSelectionSort function. Resets the list to display by Job ids. Works for both Open and taken Job lists");
		TestOpenJobsList.resetSelectionSort();
		System.out.println(TestOpenJobsList.printNodeList());
		
		System.out.println("Test the volunteerSelectionSort function. Sorts the list by the volunteer.");
		System.out.println(TestTakenJobsList.printNodeList());
		TestTakenJobsList.daySelectionSort();
		System.out.println(TestTakenJobsList.printNodeList());
		TestTakenJobsList.resetSelectionSort();
		
		System.out.println("Test the jobTransfer function. Transfers a job object to the taken Jobs list and adds a volunteers id and name to the transfered object");
		System.out.println(TestOpenJobsList.printNodeList());
		System.out.println(TestTakenJobsList.printNodeList());
		Object updatedJob = TestOpenJobsList.jobTransfer(2, 4, "Lisa", true);
		TestTakenJobsList.add(updatedJob);
		System.out.println(TestOpenJobsList.printNodeList());
		System.out.println(TestTakenJobsList.printNodeList());

	}

}
