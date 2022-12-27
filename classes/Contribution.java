package classes;
import movieclasses.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Contribution implements ActionListener
{
	JFrame Frame;
	
	private ImageIcon bg, Homeicon;
	private JButton exit,back;
	private JLabel pageName, background,lbl,lbl1,lbl2,lbl3,lbl4,lbl5;
	private JPanel panel;
	
	
	public Contribution()
	{
		Frame = new JFrame("MOVIEFLIX");
		Homeicon = new ImageIcon("images/logo.png");
		bg = new ImageIcon("images/welcomeBG.jpg");
		
		
		pageName = new JLabel("MOVIEFLIX");
		pageName.setBounds(40,30,400,30);
		pageName.setForeground(new Color(255,0,0));
		pageName.setFont(new Font("serif",Font.PLAIN,35));
		
		lbl = new JLabel("MEHEDI HASAN FAHIM");
		lbl.setBounds(490,160,400,30);
		lbl.setForeground(new Color(255,255,255));
		lbl.setFont(new Font("serif",Font.PLAIN,35));
		
		lbl1 = new JLabel("22-47487-2");
		lbl1.setBounds(585,210,400,30);
		lbl1.setForeground(new Color(255,255,255));
		lbl1.setFont(new Font("serif",Font.PLAIN,35));
		
		lbl2 = new JLabel("MD AHASAN HABIB ALIF");
		lbl2.setBounds(470,290,500,30);
		lbl2.setForeground(new Color(255,255,255));
		lbl2.setFont(new Font("serif",Font.PLAIN,35));
		
		lbl3 = new JLabel("22-47516-2");
		lbl3.setBounds(585,340,400,30);
		lbl3.setForeground(new Color(255,255,255));
		lbl3.setFont(new Font("serif",Font.PLAIN,35));
		
		lbl4 = new JLabel("MST SHOUMUN LINNAS JIM");
		lbl4.setBounds(452,420,500,30);
		lbl4.setForeground(new Color(255,255,255));
		lbl4.setFont(new Font("serif",Font.PLAIN,35));
		
		lbl5 = new JLabel("22-47506-2");
		lbl5.setBounds(585,470,400,30);
		lbl5.setForeground(new Color(255,255,255));
		lbl5.setFont(new Font("serif",Font.PLAIN,35));
		
		
		
		
		//BACK BUTTON
		back = new JButton("BACK");
		back.setBounds(03,700,100,30);
		back.setForeground(new Color(255,255,255));
		back.setBackground(new Color(0,0,0));
		back.setFocusPainted(false);
		back.setCursor(new Cursor(Cursor.HAND_CURSOR));
		back.addActionListener(this);
		
		
		//EXIT BUTTON
		exit = new JButton("EXIT");
		exit.setBounds(1250,700,100,30);
		exit.setForeground(new Color(255,255,255));
		exit.setBackground(new Color(0,0,0));
		exit.setFocusPainted(false);
		exit.setCursor(new Cursor(Cursor.HAND_CURSOR));
		exit.addActionListener(this);
		
		
		
		
		
		//PANEL
		panel  = new JPanel();
        panel.setBounds(440,50,480,630);
        panel.setBackground(new Color(0,0,0,170));
		
		background = new JLabel();
		background.setIcon(bg);
		background.setBounds(0,0,1366,768);
		
		
		Frame.add(pageName);
		Frame.add(background);
		Frame.add(lbl);
		Frame.add(lbl1);
		Frame.add(lbl2);
		Frame.add(lbl3);
		Frame.add(lbl4);
		Frame.add(lbl5);
		Frame.add(back);
		Frame.add(exit);
		Frame.add(panel);
		Frame.add(background);
		
		
		Frame.setIconImage(Homeicon.getImage());
		Frame.setSize(1366,768);
		Frame.setLayout(null);
		Frame.setLocationRelativeTo(null);
		Frame.setResizable(false);
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frame.setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==back)
		{
			new Welcome();
			Frame.setVisible(false);
		}
		else if(e.getSource()==exit)
		{
			System.exit(0);
		}
	}

}
