
package frame;
import java.lang.*;
import java.awt.*; 
import javax.swing.*;  

import entity.*;

import java.awt.event.*; 
import java.io.*; 


public class Frame extends JFrame implements MouseListener, ActionListener
{
	
	private Font f1, f2, f3, f4;
	private Color c1, c2, c3, c4;
	private JPanel panel;
	private JLabel label1, label2, label3, label4, label5, label6, label7;
	private JTextField tf1 , tf2;
	private JPasswordField pf1;
	private JButton bt1, bt2, bt3;
	private JRadioButton rb1, rb2;
	private ButtonGroup bg1;
	private JCheckBox cb1, cb2, cb3, cb4;
	private JComboBox jb;
	private JTextArea ta, ta2;
	private ImageIcon img;
	private  JButton btClear;
	ButtonGroup group;
	
	public Frame()
	{
		
		super("My First GUI");
		 
		super.setBounds(300, 100, 800, 600); 
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		panel = new JPanel();
		panel.setLayout(null);
		c2 = new Color(198, 199, 186); 
		c3 = new Color(0, 0, 0);
		panel.setBackground(c2);
		
		
		f1 = new Font("Cambria",Font.BOLD, 30); 
		f2 = new Font("Cambria",Font.BOLD, 20); 
		c1 = new Color(255, 0, 0); //(R, G, B)
		
		label1 = new JLabel("Railway Reservation System");
		label1.setBounds(200, 0, 500,40);
		label1.setFont(f1);
		label1.setForeground(c3);
		label1.addMouseListener(this);
		panel.add(label1);
		
		label3 = new JLabel("Passenger Name:");
		label3.setBounds(10, 50, 200,30);
		label3.setFont(f2);
		panel.add(label3);
		
		tf1 = new JTextField();
		tf1.setBounds(190, 50, 200,30);
		tf1.setFont(f2);
		panel.add(tf1);
		
		label4 = new JLabel("Seat Number:");
		label4.setBounds(10, 90, 200,30);
		label4.setFont(f2);
		panel.add(label4);
		
		tf2 = new JTextField();
		tf2.setBounds(190, 90, 200,30);
		tf2.setFont(f2);
		panel.add(tf2);


		
		
		bt3 = new JButton("Search");
		bt3.setBounds(400, 90, 100, 30);
		bt3.setFont(f2);
		bt3.setBackground(Color.GREEN);
		bt3.addActionListener(this);
		panel.add(bt3);
		
		label2 = new JLabel("Coach Type:");
		label2.setBounds(10, 130, 200,30);
		label2.setFont(f2);
		panel.add(label2);
		
		rb1 = new JRadioButton("AC Chair ");
		rb1.setBounds(130, 130, 180,30);
		rb1.setFont(f2);
		panel.add(rb1);
		
		rb2 = new JRadioButton("Non-AC Chair ");
		rb2.setBounds(315, 130, 180,30);
		rb2.setFont(f2);
		panel.add(rb2);
		
		bg1 = new ButtonGroup();
		bg1.add(rb1);
		bg1.add(rb2);
		
		label4 = new JLabel("Train Name:");
		label4.setBounds(10, 170, 120,30);
		label4.setFont(f2);
		panel.add(label4);
		
		cb1 = new JCheckBox("Bonolota Express");
		cb1.setBounds(130, 170, 200,30);
		cb1.setFont(f2);
		panel.add(cb1);
		
		cb2 = new JCheckBox("SilkSity Express");
		cb2.setBounds(130, 210, 200,30);
		cb2.setFont(f2);
		panel.add(cb2);
		
		cb3 = new JCheckBox("Subarna Express");
		cb3.setBounds(130, 250, 200,30);
		cb3.setFont(f2);
		panel.add(cb3);
		
		cb4 = new JCheckBox("Padma Express");
		cb4.setBounds(130, 290, 200,30);
		cb4.setFont(f2);
		panel.add(cb4);
		
		 group = new ButtonGroup();
               group.add(cb1);
               group.add(cb2);
               group.add(cb3);
               group.add(cb4);
          btClear = new JButton("Clear");
btClear.setBounds(500, 500, 150, 30); 
btClear.setFont(f2);
btClear.setBackground(Color.RED);
btClear.addActionListener(this);
panel.add(btClear);





img = new ImageIcon("Picture/railwa.png");
		label7 = new JLabel(img);
		label7.setBounds(500, 100, 300, 100);
		panel.add(label7);


	
		bt1 = new JButton("BooK Ticket");
		bt1.setBounds(100, 340, 150,30);
		bt1.setFont(f2);
		bt1.setBackground(Color.GREEN);
		bt1.addMouseListener(this);
		bt1.addActionListener(this);
		panel.add(bt1);
		
		bt2 = new JButton("Exit");
		bt2.setBounds(650, 500, 150,30);
		bt2.setFont(f2);
		bt2.setBackground(Color.GREEN);
		bt2.addActionListener(this);
		panel.add(bt2);
		
		ta2 = new JTextArea();
		JScrollPane scrollPane = new JScrollPane(ta2);
		scrollPane.setBounds(50, 400, 450,200);
		ta2.setFont(f2);
		panel.add(scrollPane);
		
		
		super.add(panel);
	}
	
	public void mouseClicked(MouseEvent me) 
	{	

		
		if(me.getSource() == label1)
		{
			label1.setText("Welcome To Bangladesh Railway");
		}
		else { }
	}
	public void mousePressed(MouseEvent me) 
	{ 
		
	}

	public void mouseReleased(MouseEvent me) 
	{ 
		
	}

	public void mouseEntered(MouseEvent me) 
	{ 
		if(me.getSource() == bt1)
		{
			bt1.setBackground(Color.BLUE);
			bt1.setForeground(Color.BLACK);
		}
		else { }
	}
	public void mouseExited(MouseEvent me) 
	{
		if(me.getSource() == bt1)
		{
			bt1.setBackground(Color.GREEN);
			bt1.setForeground(Color.BLACK);
		}
		else { }
	}
	
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == bt2)
		{
			System.exit(0);
		}
		if(ae.getSource() == btClear)
{
   
    ta2.setText("");
    if(ta != null) ta.setText("");

    tf1.setText("");
    tf2.setText("");

    bg1.clearSelection(); 
    group.clearSelection(); 

    
    if(jb != null) jb.setSelectedIndex(0);
}

		if(ae.getSource() == bt3)
		{
	    String passengerName = tf1.getText().trim();
    ta2.setText(""); 

    if(passengerName.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter passenger name to search!");
        return;
    }

    try {
        File file = new File("file/data.txt");  
        if(file.exists()) {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            boolean found = false;

            while((line = br.readLine()) != null) {
                
                if(line.toLowerCase().contains(passengerName.toLowerCase())) {
                    ta2.append(line + "\n");
                    found = true;
                }
            }
            br.close();

            if(!found) {
                ta2.append("No record found for passenger: " + passengerName);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Data file not found!");
        }
    } 
    catch(IOException ioe) {
        ioe.printStackTrace();
        JOptionPane.showMessageDialog(this,"Error reading file!");
    }
		}
if(ae.getSource() == bt1)
{
    String passengerName = tf1.getText().trim();
    
	int seatNumber = 0;
try {
    seatNumber = Integer.parseInt(tf2.getText().trim());
} catch (NumberFormatException nfe) {
    JOptionPane.showMessageDialog(this, "Please enter a valid seat number!");
    return; 
}


    String coachType = "";
    String trainNames = "";

    
    if(rb1.isSelected()) coachType = rb1.getText();
    else if(rb2.isSelected()) coachType = rb2.getText();

    
    StringBuilder sb = new StringBuilder();
    if(cb1.isSelected()) sb.append(cb1.getText()).append(" ");
    if(cb2.isSelected()) sb.append(cb2.getText()).append(" ");
    if(cb3.isSelected()) sb.append(cb3.getText()).append(" ");
    if(cb4.isSelected()) sb.append(cb4.getText()).append(" ");
    trainNames = sb.toString().trim();

    
    if(passengerName.isEmpty() || coachType.isEmpty() || trainNames.isEmpty()) {
        JOptionPane.showMessageDialog(this,"Please fill up all required information!");
        return;
    }

    
    TrainTicket ticket = new TrainTicket(passengerName, seatNumber, 450.0); // adjust params as needed
    ticket.insertInfo();

    JOptionPane.showMessageDialog(this,"Information saved!");
     try {
        File file = new File("file/data.txt");
        file.getParentFile().mkdirs(); // make sure "io" folder exists
        BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));

        bw.write("Passenger: " + passengerName + 
                 ", Seat: " + seatNumber + 
                 ", Coach: " + coachType + 
                 ", Train: " + trainNames);
        bw.newLine();

        bw.close();


        ta2.append("Passenger: " + passengerName + 
                   ", Seat: " + seatNumber + 
                   ", Coach: " + coachType + 
                   ", Train: " + trainNames + "\n");
    } catch (IOException ioe) {
        ioe.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error saving ticket info!");
    }
    
    
}
	}
		
	private void check() {
		try {
File file = new File("/Users/badhon/Documents/java/Project/GUIPROJECT/Data/userdata.txt");
			// File file = new File("file/data.txt");
			if (file.exists()) {
				FileReader fr = new FileReader(file); 
				BufferedReader br = new BufferedReader(fr); 
				String line;
				while ((line = br.readLine()) != null) {
					ta2.append(line + "\n");
				}
				br.close();
			}
		}
		catch(IOException ioe) 
		{
			ioe.printStackTrace();
			JOptionPane.showMessageDialog(this,"Error!");
		}
	} 

} 



