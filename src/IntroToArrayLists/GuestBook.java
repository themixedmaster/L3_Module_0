package IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GuestBook implements ActionListener{
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton buttonOne = new JButton("add name");
	JButton buttonTwo = new JButton("view Names");
	
	public static void main(String[] args) {
		GuestBook book = new GuestBook();
		book.anythingYouWant();
	}
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	void anythingYouWant(){
		frame.setVisible(true);
		frame.add(panel);
		panel.add(buttonOne);
		panel.add(buttonTwo);
		buttonOne.addActionListener(this);
		buttonTwo.addActionListener(this);
		frame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource().equals(buttonOne)){
			System.out.println("qwertyuiopasdfghjklzxcvbnm");
		}
		
		
	}
}
