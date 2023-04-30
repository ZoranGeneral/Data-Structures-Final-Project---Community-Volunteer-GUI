import javax.swing.JFrame;
import javax.swing.JPanel;

/**************************************************************
* Name        : Data Structures Final Project
* Author      : Ian Folger
* Created     : Apr 2, 2023  
* Course      : CIS 152 Data Structures
* Version     : 1.0
* OS          : Windows 10
* Copyright   : This is my own original work based on
*               specifications issued by our instructor
* Description : StartProgram page of the final project. Sets up the JFrame
* sszie, title, panel, etc.
* Academic Honesty: I attest that this is my original work.
* I have not used unauthorized source code, either modified or 
* unmodified. I have not given other fellow student(s) access to
* my program.         
***************************************************************/

public class StartProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame(); //Creates the Frame
		VolunteerProgramPanel panel = new VolunteerProgramPanel(); //Creates the panel
		
		
		frame.setSize(1800, 750); //Sets the width and height
		
		frame.setTitle("Volunteer Signup"); //Gives the frame a title
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //shuts the program down when the window is closed
		
		frame.add(panel); //Adds the panel to the frame
		
		frame.setVisible(true);
	}

}
