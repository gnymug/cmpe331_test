/*

Development-01:
@author: Güney Berkay Ateş, 120200047
@author: Müge Güney, 120200058
https://github.com/gnymug/cmpe331_test
Development-02:
PULL REQUEST
@author: Ahmet Kıvanç Demirkıran, 120200133
@author: Maram Al-Maohgra, 120200123
 *
 */

import java.awt.GridLayout;

import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class LoginWindow extends JFrame implements ActionListener {

	// main method for testing the application
	public static void main(String[] args) {
		new LoginWindow();
	}


	/*
	 * Graphical User Interface (GUI) Elements
	 *
	 * ! PLEASE RENAME THE OBJECTS ACCORDING TO THEIR PURPOSES !
	 * ! YOU CAN ADD MORE ELEMENTS IF IT IS NECESSARY !
	 */
	private JButton btn01, btn02;
	private JLabel lbl01, lbl02, lbl03;
	private JTextField txt01, txt02;


	// Constructor
	public LoginWindow () {

		this.initializeGUI();
		this.setWindowProperties(3, 2);
		this.addGUIElementsToFrame();

	}


	/**
	 * Initialize GUI elements. If it is necessary, you can add more
	 * 	elements.
	 */
	public void initializeGUI() {
		lbl01 = new JLabel("User Name: ", SwingConstants.CENTER);
		lbl02 = new JLabel("Password: ", SwingConstants.CENTER);
		lbl03 = new JLabel("Welcome to our website",SwingConstants.CENTER );
		lbl03.setSize(50, 50);
	

		txt01 = new JTextField("  ");
		txt02 = new JTextField("  ");

		txt01.setHorizontalAlignment(SwingConstants.CENTER);
		txt02.setHorizontalAlignment(SwingConstants.CENTER);

		btn01 = new JButton("Forgotten Password");
		btn02 = new JButton("Log In");

		btn01.addActionListener(this);
		btn02.addActionListener(this);
	}

	/**
	 * Set the necessary properties for the window
	 *
	 * @param numRow number of row for GUI elements
	 * @param numCol number of column for GUI elements
	 */
	public void setWindowProperties(int numRow, int numCol) {
		this.setLayout(new GridLayout(numRow, numCol));

		this.setSize(800, 800);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}


	/**
	 * Add GUI elements to the layout of the frame. If it is necessary,
	 * 	you can add more elements.
	 */
	public void addGUIElementsToFrame() {
		this.add(lbl01);
		this.add(txt01);

		this.add(lbl02);
		this.add(txt02);

		this.add(btn01);
		this.add(btn02);
		
		
	}

	 //define abstract method actionPerformed() which will be called on button click   
  

	/**
	 * Add margin to the frame.
	 */
	@Override
    public Insets getInsets() {
        return new Insets(100, 50, 100, 50);
    }


	/**
	 * Action listener for the buttons. If e.getSource() is from
	 * 	one of the buttons, apply the related operation.
	 *
	 * @param e action event for detecting which button is clicked
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		    String userValue = txt01.getText();        //get user entered username from the textField1  
	        String passValue = txt02.getText();        //get user entered pasword from the textField2  
	          
	        //check whether the credentials are authentic or not  
	        if (userValue.equals("BilgiEdu") && passValue.equals("Lale")) {    
	              
	            //create instance of the NewPage  
	        	JFrame frame = new JFrame("Hello");
	        	    
	        	    // Set the size of the window
	        	    frame.setSize(400, 400);
	        	    
	        	    // Make the window visible
	        	    frame.setVisible(true);


	            //make page visible to the user  
	            setVisible(true);  
	                
	        }  
	        
	        else if(e.getSource()==btn02) {

        JFrame j=new JFrame();
       j.setSize(800,800); 
       j.setVisible(true);
       j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       j.add(lbl03);
 

}


	        
	        else{  
	            //show error message  
	            System.out.println("Please enter valid username and password");  
	        }  
		// TODO Auto-generated method stub

	}
	
	
	

}
