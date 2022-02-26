import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class ActionEventDemo extends JFrame {
	Factory    factory1           = new Factory();
    JFrame     gui                = new JFrame();
    JPanel 	   content            = new JPanel();
    JButton    buttonCreate       = new JButton("Create");
    JButton    buttonDelivery     = new JButton("Delivery");
    JButton    buttonPaused       = new JButton("Paused");
    JButton    buttonUnpaused     = new JButton("Unpaused");
    JLabel     label              = new JLabel("Welcome");
    JLabel     label2			  = new JLabel("This Software implement with State pattern");
 	Container  pane 			  = gui.getContentPane();

    ActionEventDemo(){
        prepareGUI();
        LabelGUI();
        buttonProperties();
    }
 
    public void prepareGUI(){
        gui.setTitle("My Window");
        gui.getContentPane().setLayout(null);
        gui.setVisible(true);
        gui.setSize(500 , 500);
        gui.setLocation(400,200);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void LabelGUI(){
    	label.setBounds(215,20,100,50);
    	pane.add(label);
    	label2.setBounds(90, 50, 328, 60);
    	pane.add(label2);
    }
    public void buttonProperties(){
    	buttonCreate.setBounds(100,150,120,40);
		pane.add(buttonCreate, BorderLayout.WEST);
		buttonDelivery.setBounds(275,150,120,40);
        pane.add(buttonDelivery , BorderLayout.CENTER);
        buttonPaused.setBounds(100,200,120,40);
		pane.add(buttonPaused, BorderLayout.WEST);
		buttonUnpaused.setBounds(275,200,120,40);
        pane.add(buttonUnpaused , BorderLayout.CENTER);
        /*
        	 Add Event listener to each of button
        */

        //	Bound with Create function
        buttonCreate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	factory1.create();
            }
        });

        // Bound with Delivery function
        buttonDelivery.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	factory1.delivery();
            }
        });

        // Bound with Paused function 
        buttonPaused.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	factory1.paused();
            }
        });

        // Bound with Unpaused function
        buttonUnpaused.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	factory1.unpaused();
            }
        });
    }
 
}
 
public class DemoState{
	
	public static void main(String[] args){
		new ActionEventDemo();
	}

}
