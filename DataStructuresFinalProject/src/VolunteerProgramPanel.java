import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

/**************************************************************
* Name        : Data Structures Final Project
* Author      : Ian Folger
* Created     : Apr 2, 2023  
* Course      : CIS 152 Data Structures
* Version     : 1.0
* OS          : Windows 10
* Copyright   : This is my own original work based on
*               specifications issued by our instructor
* Description : This is the gui program panel file that is used to create the text areas, buttons, labels
* that will be used for the gui program
* Academic Honesty: I attest that this is my original work.
* I have not used unauthorized source code, either modified or 
* unmodified. I have not given other fellow student(s) access to
* my program.         
***************************************************************/

public class VolunteerProgramPanel extends JPanel {

	//Class data
	//The Linked lists that will hold the objects
	public LinkedList volunteerList = new LinkedList();
	public LinkedList openJobsList = new LinkedList();
	public LinkedList takenJobsList = new LinkedList();
	
	JTextArea volunteerListArea = new JTextArea(10, 60);
	JTextArea openJobsListArea = new JTextArea(10, 60);		//The text areas that will be used to display the 3 linked lists contents
	JTextArea takenJobsListArea = new JTextArea(10, 60);
	
	JLabel inputValidationSection1 = new JLabel(" ");
	JLabel inputValidationSection2 = new JLabel(" ");		//The labels that will hold any messages that come up for validation or errors
	JLabel inputValidationSection3 = new JLabel(" ");
	
	//Section1 
	
	//Volunteer section
	
	JLabel title = new JLabel("Volunteer Sign up");
	JLabel title2 = new JLabel("Volunteer List");
	JLabel title3 = new JLabel("Job Sign up");
	JLabel title4 = new JLabel("       Open jobs");
	JLabel title5 = new JLabel("Quit jobs");
	JLabel title6 = new JLabel("     Taken jobs");
	JLabel nameLabel = new JLabel("Name: ");
	JTextField nameTextField = new JTextField(15);
	JLabel ageLabel = new JLabel("Age: ");
	JTextField AgeTextField = new JTextField(2);
	JLabel emailLabel = new JLabel("Email: ");
	JTextField emailTextField = new JTextField(20);
	JLabel phoneNumberLabel = new JLabel("Phone Number: ");
	JTextField phoneNumberTextField = new JTextField(10);
	
	JButton addButton = new JButton("Add");
	
	JLabel idDeleteLabel = new JLabel("Volunteer ID: ");
	JTextField idDeleteTextField = new JTextField(3);
	
	JButton deleteButton = new JButton("Delete");
	
	//Open jobs area
	
	JLabel idJobAddLabel = new JLabel("Job ID: ");
	JTextField idJobAddTextField = new JTextField(3);
	JLabel idVolunteerAddLabel = new JLabel("Volunteer ID: ");
	JTextField idVolunteerAddTextField = new JTextField(3);
	JButton idAddButton = new JButton("Add");
	
	JButton openIdSortButton = new JButton("Sort by Id");				//Section 1 is where all the Text fields, labels, and buttons are created ahead up time where they will later be put to together to form the GUI
	
	JLabel openDaySortLabel = new JLabel("Day of Week: ");
	JTextField openDaySortTextField = new JTextField(10);
	JButton openDaySortButton = new JButton("Sort by day");
	
	JButton resetOpenSortButton = new JButton("Reset Sort");
	
	//Taken jobs area
	
	JTable TakenJobsTable = new JTable();
	
	JLabel jobRemoveLabel = new JLabel("Job ID: ");
	JTextField jobRemoveTextField = new JTextField(3);
	
	JButton jobRemoveButton = new JButton("Remove");
	
	JButton idVolunteerSortButton = new JButton("Sort by Volunteer Id");
	JLabel idVolunteerSortLabel = new JLabel("Volunteer Id: ");
	JTextField idVolunteerSortTextField = new JTextField(10);
	
	JLabel takenDaySortLabel = new JLabel("Day of Week: ");
	JTextField takenDaySortTextField = new JTextField(10);
	JButton takenDaySortButton = new JButton("Sort by day");
	
	JButton resetTakenSortButton = new JButton("Reset Sort");
	
	//Section 2
	
	public VolunteerProgramPanel() {

		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel(new FlowLayout (FlowLayout.CENTER));
		JPanel panel3 = new JPanel(new FlowLayout (FlowLayout.CENTER));
		JPanel panel4 = new JPanel(new FlowLayout (FlowLayout.CENTER));
		JPanel panel5 = new JPanel();
		JPanel panel6 = new JPanel(new FlowLayout (FlowLayout.CENTER));
		JPanel panel7 = new JPanel();
		JPanel panel8 = new JPanel(new FlowLayout (FlowLayout.CENTER));
		JPanel panel9 = new JPanel(new FlowLayout (FlowLayout.CENTER));
		
		JPanel panel10 = new JPanel(new FlowLayout (FlowLayout.CENTER));
		JPanel panel11 = new JPanel(new FlowLayout (FlowLayout.CENTER));
		JPanel panel12 = new JPanel(new FlowLayout (FlowLayout.CENTER));
		
		JPanel junction1 = new JPanel();
		JPanel junction2 = new JPanel();
		BoxLayout boxlayout1 = new BoxLayout(junction1, BoxLayout.Y_AXIS);
		junction1.setLayout(boxlayout1);
		
		JPanel junction3 = new JPanel();
		JPanel junction4 = new JPanel();
		BoxLayout boxlayout2 = new BoxLayout(junction3, BoxLayout.Y_AXIS);
		junction3.setLayout(boxlayout2);
		
		JPanel junction5 = new JPanel();
		JPanel junction6 = new JPanel();
		BoxLayout boxlayout3 = new BoxLayout(junction5, BoxLayout.Y_AXIS);
		junction5.setLayout(boxlayout3);
		
		panel1.setLayout(new GridLayout(4,2));

		JPanel gridPlan = new JPanel();
		gridPlan.setLayout(new GridLayout(3,2, 30, 30));
		
		volunteerListArea.setEditable(false);
		openJobsListArea.setEditable(false);
		takenJobsListArea.setEditable(false);
		JScrollPane scroll1 = new JScrollPane(volunteerListArea);						//Section 2 is where all the panels are created, where they will be grouped in by junctions and placed within a grid plan to organize them
		JScrollPane scroll2 = new JScrollPane(openJobsListArea);
		JScrollPane scroll3 = new JScrollPane(takenJobsListArea);
	    scroll1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	    scroll2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	    scroll3.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		//GUI plan Section 1
		panel1.add(nameLabel);
		panel1.add(nameTextField);
		
		panel1.add(ageLabel);
		panel1.add(AgeTextField);
		
		panel1.add(emailLabel);
		panel1.add(emailTextField);
		
		panel1.add(phoneNumberLabel);
		panel1.add(phoneNumberTextField);
		
		panel10.add(inputValidationSection1);
		
		AddButtonListener enterListener = new AddButtonListener();
		addButton.addActionListener(enterListener);
		
		DeleteButtonListener deleteListener = new DeleteButtonListener();
		deleteButton.addActionListener(deleteListener);
		
		panel2.add(addButton);
		panel2.add(idDeleteLabel);
		panel2.add(idDeleteTextField);
		panel2.add(deleteButton);
		
		panel3.add(title);
		
		junction1.add(panel3);
		junction1.add(panel1);
		junction1.add(panel10);
		junction1.add(panel2);
		
		junction2.add(title2);
		junction2.add(scroll1);
		
		gridPlan.add(junction1);
		gridPlan.add(junction2);
		
		//GUI plan Section 2
		panel5.setLayout(new GridLayout(2,2));
		
		panel4.add(title3);
		
		panel5.add(idJobAddLabel);
		panel5.add(idJobAddTextField);
		
		panel5.add(idVolunteerAddLabel);
		panel5.add(idVolunteerAddTextField);
		
		panel11.add(inputValidationSection2);
		
		IdAddButtonListener jobSignUpListener = new IdAddButtonListener();
		idAddButton.addActionListener(jobSignUpListener);
		
		SortByDayButtonListener openDaySortListener = new SortByDayButtonListener();
		openDaySortButton.addActionListener(openDaySortListener);
		
		OpenResetButtonListener openResetListener = new OpenResetButtonListener();
		resetOpenSortButton.addActionListener(openResetListener);
		
		panel6.add(idAddButton);
		panel6.add(openDaySortButton);
		panel6.add(resetOpenSortButton);
		
		junction3.add(panel4);
		junction3.add(panel5);
		junction3.add(panel11);
		junction3.add(panel6);
		
		junction4.add(title4);
		junction4.add(scroll2);
		
		gridPlan.add(junction3);
		gridPlan.add(junction4);
		
		openJobsListArea.setEditable(false);
		
		//GUI plan Section 3
		panel8.setLayout(new GridLayout(1,1));
		
		panel9.add(title5);
		
		panel8.add(jobRemoveLabel);
		panel8.add(jobRemoveTextField);
		
		panel12.add(inputValidationSection3);
		
		RemoveButtonListener removeJobListener = new RemoveButtonListener();
		jobRemoveButton.addActionListener(removeJobListener);
		
		TakenSortVolunteerIDButtonListener takenSortVolunteerIdListener = new TakenSortVolunteerIDButtonListener();
		idVolunteerSortButton.addActionListener(takenSortVolunteerIdListener);
		
		TakenSortDayButtonListener takenDaySortListener = new TakenSortDayButtonListener();
		takenDaySortButton.addActionListener(takenDaySortListener);
		
		TakenResetButtonListener takenResetListener = new TakenResetButtonListener();
		resetTakenSortButton.addActionListener(takenResetListener);
		
		panel7.add(jobRemoveButton);
		panel7.add(idVolunteerSortButton);
		panel7.add(takenDaySortButton);
		panel7.add(resetTakenSortButton);
		
		junction5.add(panel9);
		junction5.add(panel8);
		junction5.add(panel12);
		junction5.add(panel7);
		
		junction6.add(title6);
		junction6.add(scroll3);
		
		gridPlan.add(junction5);
		gridPlan.add(junction6);
		
		
		//Adds everything
		add(gridPlan);
		
		Jobs job1 = new Jobs(1, "Trash pick up", "Help pick up trash around the park", "Wednesday", "10:10", "Open", 0, "None");
		Jobs job2 = new Jobs(2, "Food Bank Helper", "Help with delivery of donated food", "Monday", "12:30", "Open", 0, "None");
		Jobs job3 = new Jobs(3, "Library Assitant", "Help the library with any tasks", "Thursday", "9:00", "Open", 0, "None");
		Jobs job4 = new Jobs(4, "Food Bank Helper", "Help with delivery of donated food", "Tuesday", "12:30", "Open", 0, "None");
		Jobs job5 = new Jobs(5, "Library Assitant", "Help the library with any tasks", "Friday", "9:00", "Open", 0, "None");
		openJobsList.add(job1);
		openJobsList.add(job2);
		openJobsList.add(job3);
		openJobsList.add(job4);
		openJobsList.add(job5);
		
		String results = null;
		
		results = openJobsList.printNodeList();
		
		openJobsListArea.setText(results);
	}
	
	//Section 3
	//Section is where all the action listeners are set up, created, and connected to specified buttons
	class AddButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String results = null;
			try {
				String volunteerName = nameTextField.getText();
				int volunteerAge = Integer.parseInt(AgeTextField.getText());
				String volunteerEmail = emailTextField.getText();
				String volunteerPhoneNumber = phoneNumberTextField.getText();
				boolean nameCheck = false;
				
				char[] ch = volunteerName.toCharArray();
				
				for(char c : ch){
					if(Character.isDigit(c)){
						nameCheck = true;
						break;
					}
				}
				
				if(nameCheck != true) {
					Volunteer volunteer = new Volunteer(volunteerList, volunteerName, volunteerAge, volunteerEmail, volunteerPhoneNumber);
					volunteerList.add(volunteer);
					
					volunteerListArea.setText("");
					
					results = volunteerList.printNodeList();
					inputValidationSection1.setText("");
				}
				else {
					inputValidationSection1.setText("Your name must not contain any numbers.");
				}
			} 
			catch (NumberFormatException e2) {
				// TODO Auto-generated catch block
				inputValidationSection1.setText("Please make sure all requirede boxes for the task have been filled with correct inputs.");
			}
			volunteerListArea.setText(results);
			
		} //The enter Listener class that will activate when the enter button is clicked

	}
	
	class DeleteButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String results = null;
			try {
				int selectedID = Integer.parseInt(idDeleteTextField.getText());
				
				try {
					volunteerList.remove(selectedID);
				} catch (ListEmptyException e2) {
					// TODO Auto-generated catch block
					inputValidationSection1.setText("ID was not found or List is empty.");
				}
				volunteerListArea.setText("");
				inputValidationSection1.setText("");
				results = volunteerList.printNodeList();
				volunteerListArea.setText(results);
			} 
			catch (NumberFormatException e2) {
				// TODO Auto-generated catch block
				inputValidationSection1.setText("Please make sure all requirede boxes for the task have been filled.");
			}
		} //The enter Listener class that will activate when the enter button is clicked

	}
	
	class IdAddButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			Jobs updatedJob = new Jobs();
			try {
				int selectedJobID = Integer.parseInt(idJobAddTextField.getText());
				int selectedVolunteerID = Integer.parseInt(idVolunteerAddTextField.getText());
				
				String volunteerName = volunteerList.grabName(selectedVolunteerID);
				boolean vIdCheck = volunteerList.verifyID(selectedVolunteerID);
				updatedJob = (Jobs) openJobsList.jobTransfer(selectedJobID, selectedVolunteerID, volunteerName, vIdCheck);
				String results1 = null;
				String results2 = null;
				
				takenJobsList.add(updatedJob);
				
				takenJobsListArea.setText("");
				

				results1 = openJobsList.printNodeList();
				results2 = takenJobsList.printNodeList();
				inputValidationSection2.setText("");
				openJobsListArea.setText(results1);
				takenJobsListArea.setText(results2);
				
			} catch (ListEmptyException e2) {
				// TODO Auto-generated catch block
				inputValidationSection2.setText("Please make sure both Job ID and Volunteer ID are availabe to be entered.");
			}
			catch (NumberFormatException e2) {
				// TODO Auto-generated catch block
				inputValidationSection2.setText("Please make sure all requirede boxes for the task have been filled with the correct numbers.");
			}
		} //The enter Listener class that will activate when the enter button is clicked

	}
	
	class SortByDayButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String results = null;
			try {
				openJobsList.daySelectionSort();
				results = openJobsList.printNodeList();
				openJobsListArea.setText(results);
				inputValidationSection2.setText("");
			} catch (ListEmptyException e1) {
				// TODO Auto-generated catch block
				inputValidationSection2.setText("The list is empty, and cannot remove or sort its entries.");
			}
			catch (NullPointerException e2) {
				// TODO Auto-generated catch block
				inputValidationSection2.setText("The list is empty, and cannot remove or sort its entries.");
			}
		} //The enter Listener class that will activate when the enter button is clicked

	}
	
	class OpenResetButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String results = null;
			try {
				openJobsList.resetSelectionSort();
				results = openJobsList.printNodeList();
				openJobsListArea.setText(results);
				inputValidationSection2.setText("");
			} catch (ListEmptyException e1) {
				// TODO Auto-generated catch block
				inputValidationSection2.setText("The list is empty, and cannot remove or sort its entries.");
			}
			catch (NullPointerException e2) {
				// TODO Auto-generated catch block
				inputValidationSection2.setText("The list is empty, and cannot remove or sort its entries.");
			}
			
		} //The enter Listener class that will activate when the enter button is clicked

	}
	
	class RemoveButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			Jobs resettedJob = new Jobs();
			try {
				int selectedTakenJobID = Integer.parseInt(jobRemoveTextField.getText());
				resettedJob = (Jobs) takenJobsList.jobReset(selectedTakenJobID);
				String results1 = null;
				String results2 = null;
				
				openJobsList.add(resettedJob);
				
				openJobsListArea.setText("");
				takenJobsListArea.setText("");
				
				results1 = openJobsList.printNodeList();
				results2 = takenJobsList.printNodeList();
				
				openJobsListArea.setText(results1);
				takenJobsListArea.setText(results2);
				inputValidationSection3.setText("");
				
			} catch (ListEmptyException e2) {
				// TODO Auto-generated catch block
				inputValidationSection3.setText("Please make sure the job you are trying to remove is with in the list.");
			}
			catch (NumberFormatException e2) {
				// TODO Auto-generated catch block
				inputValidationSection3.setText("Please make sure all requirede boxes for the task have been filled with the correct numbers.");
			}
			catch (NullPointerException e2) {
				// TODO Auto-generated catch block
				inputValidationSection3.setText("The list is empty, and cannot remove or sort its entries.");
			}
		} //The enter Listener class that will activate when the enter button is clicked

	}
	
	class TakenSortVolunteerIDButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String results = null;
			try {
				takenJobsList.volunteerSelectionSort();
				results = takenJobsList.printNodeList();
				takenJobsListArea.setText(results);
				inputValidationSection3.setText("");
			} catch (ListEmptyException e1) {
				// TODO Auto-generated catch block
				inputValidationSection3.setText("The list is empty, and cannot remove or sort its entries.");
			}
			catch (NullPointerException e2) {
				// TODO Auto-generated catch block
				inputValidationSection3.setText("The list is empty, and cannot remove or sort its entries.");
			}
		} //The enter Listener class that will activate when the enter button is clicked
	}
	
	class TakenSortDayButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String results = null;
			try {
				takenJobsList.daySelectionSort();
				results = takenJobsList.printNodeList();
				takenJobsListArea.setText(results);
				inputValidationSection3.setText("");
			} catch (ListEmptyException e1) {
				// TODO Auto-generated catch block
				inputValidationSection3.setText("The list is empty, and cannot remove or sort its entries.");
			}
			catch (NullPointerException e2) {
				// TODO Auto-generated catch block
				inputValidationSection3.setText("The list is empty, and cannot remove or sort its entries.");
			}
		} //The enter Listener class that will activate when the enter button is clicked


	}
	
	class TakenResetButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String results = null;
			try {
				takenJobsList.resetSelectionSort();
				results = takenJobsList.printNodeList();
				takenJobsListArea.setText(results);
				inputValidationSection3.setText("");
			} catch (ListEmptyException e1) {
				// TODO Auto-generated catch block
				inputValidationSection3.setText("The list is empty, and cannot remove or sort its entries.");
			}
			catch (NullPointerException e2) {
				// TODO Auto-generated catch block
				inputValidationSection3.setText("The list is empty, and cannot remove or sort its entries.");
			}
			
		} //The enter Listener class that will activate when the enter button is clicked

	}

}
