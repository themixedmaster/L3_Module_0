package IntroToHashMaps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LogSearch implements ActionListener {
   @SuppressWarnings("deprecation")
public static void main(String[] args) {
	LogSearch detective = new LogSearch();
	detective.m();
   }
	 // Crate a HashMap of Integers for the keys and Strings for the values.
	   
	
   JButton b = new JButton("Add Prisoner");
   JButton bb = new JButton("Cell Check");
   JButton bbb = new JButton("Prison Search");
   JButton bbbb = new JButton("Free Prisoner");
   HashMap<Integer,String> prison = new HashMap<Integer,String>();
   void m (){
		 // Create a GUI with three buttons. 
		   JFrame box = new JFrame("The Prison of unescapable death and unimaginable horror and invincible prison cells that only a god could escape from because of how impossible it is to escape");
		   JPanel pannel = new JPanel();
		   box.add(pannel);
		   box.setVisible(true);
		   box.setSize(777, 777);
		   pannel.add(b);
		   pannel.add(bb);
		   pannel.add(bbb);
		   pannel.add(bbbb);
		 // Button 1: Add Entry
		   b.addActionListener(this);
		   // 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
		   		
		   			
			 // 
			 // Button 2: Search by ID
		   bb.addActionListener(this);
			 // 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
			 // 				If that ID exists, display that name to the user.
			 // 				Otherwise, tell the user that that entry does not exist.
			 // 
			 // 
		   bbb.addActionListener(this);
			 // When this is complete, add a fourth button to your window.
			 // Button 4: Remove Entry
		   bbbb.addActionListener(this);
			 
   }
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource() == b){
		String qwertyuiop = JOptionPane.showInputDialog("What should the ID # of the new prisoner be?"); 
		int iD = Integer.parseInt(qwertyuiop);
// 				After an ID is entered, use another input dialog to ask the user to enter a name.
		qwertyuiop = JOptionPane.showInputDialog("What is this prisoner's name?");
		if(qwertyuiop.equals("Danny Devito")){
			prison.put(iD,"MISSING! He seems to have dug through the floor using his god-like strength. He left a lot of trash behind though.");
		}else{
			prison.put(iD,qwertyuiop);
		}
// 				Add this information as a new entry to your HashMap.
	}else if(e.getSource() == bb){
//			When this button is clicked, use an input dialog to ask the user to enter an ID number.
		String qwertyuiop = JOptionPane.showInputDialog("Insert the Id of the prisoner who you want to find."); 
	 // 				If that ID exists, display that name to the user.
		int qwertyuio = Integer.parseInt(qwertyuiop);
		if(prison.containsKey(qwertyuio)){
			JOptionPane.showMessageDialog(null, "The prisoner in cell " + qwertyuiop + " is " + prison.get(Integer.parseInt(qwertyuiop)));
		}else{
			JOptionPane.showMessageDialog(null,"No-one's there.");
			}
	 // 				Otherwise, tell the user that that entry does not exist.
	 // 
	}else if(e.getSource() == bbb){
		 // Button 3: View List
		 // 				When this button is clicked, display the entire list in a message dialog in the following format:
		for(int i:prison.keySet()){
			JOptionPane.showMessageDialog(null,"Cell: " + i + "  |  PRISONER: " + prison.get(i));
		}			
		
	}else if(e.getSource() == bbbb){
//		When this button is clicked, prompt the user to enter an ID using an input dialog.
		String qwertyuiop = JOptionPane.showInputDialog("Insert the ID of the prisoner you want to free:");
		int qwertyuio = Integer.parseInt(qwertyuiop);
 // 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
		if(prison.containsKey(qwertyuio)){
			if(prison.get(qwertyuio).equals("MISSING! He seems to have dug through the floor using his god-like strength. He left a lot of trash behind though.")){
				JOptionPane.showMessageDialog(null, "No-ones there. The prisoner here seems to have dug through the floor using his god-like strength. He left a lot of trash behind though.");
			}else{
				JOptionPane.showMessageDialog(null, prison.get(qwertyuio) + " has been freed!");
				prison.remove(qwertyuio);
			}
		}else{
			JOptionPane.showMessageDialog(null, "No-one's there");
		}
 // 				is not in the list. 
 //
	}
	
	// TODO Auto-generated method stub
	
}
	 
}
