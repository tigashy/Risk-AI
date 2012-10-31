package risk.gui;


import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import risk.Main;



public class gui {
	private int playerCount;
	private JFrame frame = new JFrame();
	private JRadioButton rb1Computer = new JRadioButton("1");
	private JRadioButton rb2Computer = new JRadioButton("2");
	private JRadioButton rb3Computer = new JRadioButton("3");
	private JRadioButton rb4Computer = new JRadioButton("4");
	private JRadioButton rb5Computer = new JRadioButton("5");
	private ButtonGroup groupComputer = new ButtonGroup();
	private JButton btnPlay = new JButton("Play");
	private JLabel lblComputer = new JLabel("Computer:");
	private JPanel pnlMenue = new JPanel();
	private JPanel pnlGame = new JPanel();
	
	private ImageLabel lAfrikaAmerika = new ImageLabel("Images/Linien/AmeikaAfrika.gif");
	private ImageLabel lnAmerika1 = new ImageLabel("Images/Linien/1.gif");
	private ImageLabel lnAmerika2 = new ImageLabel("Images/Linien/2.gif");
	private ImageLabel lnAmerika3 = new ImageLabel("Images/Linien/3.gif");
	private ImageLabel lAmerikaEuropa = new ImageLabel("Images/Linien/AmerikaEuropa.gif");
	private ImageLabel lEuropa1 = new ImageLabel("Images/Linien/Europa1.gif");
	private ImageLabel lEuropa2 = new ImageLabel("Images/Linien/Europa2.gif");
	private ImageLabel lEuropa3 = new ImageLabel("Images/Linien/Europa3.gif");
	private ImageLabel lEuropa4 = new ImageLabel("Images/Linien/Europa4.gif");
	private ImageLabel lEuropa5 = new ImageLabel("Images/Linien/Europa5.gif");
	private ImageLabel lEuropa6 = new ImageLabel("Images/Linien/Europa6.gif");
	private ImageLabel lAfrika1 = new ImageLabel("Images/Linien/afrika1.gif");
	private ImageLabel lAfrika2 = new ImageLabel("Images/Linien/afrika2.gif");
	private ImageLabel lEuropaAfrika1 = new ImageLabel("Images/Linien/afrikaEuropa1.gif");
	private ImageLabel lEuropaAfrika2 = new ImageLabel("Images/Linien/afrikaEuropa2.gif");
	private ImageLabel lEuropaAfrika3 = new ImageLabel("Images/Linien/afrikaEuropa3.gif");
	private ImageLabel lAfrikaAsien = new ImageLabel("Images/Linien/afrikaAsien.gif");
	private ImageLabel lAsien1 = new ImageLabel("Images/Linien/Asien1.gif");
	private ImageLabel lAsien2 = new ImageLabel("Images/Linien/Asien2.gif");
	private ImageLabel lAustralien1 = new ImageLabel("Images/Linien/Australien1.gif");
	private ImageLabel lAustralien2 = new ImageLabel("Images/Linien/Australien2.gif");
	private ImageLabel lAustralien3 = new ImageLabel("Images/Linien/Australien3.gif");
	private ImageLabel lAustralien4 = new ImageLabel("Images/Linien/Australien4.gif");
	private ImageLabel lAustralien5 = new ImageLabel("Images/Linien/Australien5.gif");
	private ImageLabel lAsienAmerika1 = new ImageLabel("Images/Linien/AsienAmerika1.gif");
	private ImageLabel lAsienAmerika2 = new ImageLabel("Images/Linien/AsienAmerika2.gif");
	
	public JPanel getPnlGame(){
		return this.pnlGame;
	}
	
	public int getPlayerCount(){
		return this.playerCount;
	}
	
	/*
	ImageLabel nAmerika_1 = new ImageLabel();
	ImageLabel nAmerika_2 = new ImageLabel();
	ImageLabel nAmerika_3 = new ImageLabel();
	ImageLabel nAmerika_4 = new ImageLabel();
	ImageLabel nAmerika_5 = new ImageLabel();
	ImageLabel nAmerika_6 = new ImageLabel();
	ImageLabel nAmerika_7 = new ImageLabel();
	ImageLabel nAmerika_8 = new ImageLabel();
	ImageLabel nAmerika_9 = new ImageLabel();
	
	ImageLabel sAmerika_1 = new ImageLabel();
	ImageLabel sAmerika_2 = new ImageLabel();
	ImageLabel sAmerika_3 = new ImageLabel();
	ImageLabel sAmerika_4 = new ImageLabel();
	
	ImageLabel europa_1 = new ImageLabel();
	ImageLabel europa_2 = new ImageLabel();
	ImageLabel europa_3 = new ImageLabel();
	ImageLabel europa_4 = new ImageLabel();
	ImageLabel europa_5 = new ImageLabel();
	ImageLabel europa_6 = new ImageLabel();
	ImageLabel europa_7 = new ImageLabel();
	
	ImageLabel afrika_1 = new ImageLabel();
	ImageLabel afrika_2 = new ImageLabel();
	ImageLabel afrika_3 = new ImageLabel();
	ImageLabel afrika_4 = new ImageLabel();
	ImageLabel afrika_5 = new ImageLabel();
	ImageLabel afrika_6 = new ImageLabel();
	
	ImageLabel asien_1 = new ImageLabel();
	ImageLabel asien_2 = new ImageLabel();
	ImageLabel asien_3 = new ImageLabel();
	ImageLabel asien_4 = new ImageLabel();
	ImageLabel asien_5 = new ImageLabel();
	ImageLabel asien_6 = new ImageLabel();
	ImageLabel asien_7 = new ImageLabel();
	ImageLabel asien_8 = new ImageLabel();
	ImageLabel asien_9 = new ImageLabel();
	ImageLabel asien_10 = new ImageLabel();
	ImageLabel asien_11 = new ImageLabel();
	ImageLabel asien_12 = new ImageLabel();
	
	ImageLabel australien_1 = new ImageLabel();
	ImageLabel australien_2 = new ImageLabel();
	ImageLabel australien_3 = new ImageLabel();
	ImageLabel australien_4 = new ImageLabel();
	*/
	
	/*public void events(){
		
		nAmerika_1.addMouseListener(new MouseListener() {			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				//runterdruecken
				if(e.getButton()== 1)
				{
					int nr = Integer.parseInt(nAmerika_1.getText());
					nr += 1;
					nAmerika_1.setText(""+nr);
				}
				else if(e.getButton() == 3){
					int nr = Integer.parseInt(nAmerika_1.getText());
					if(nr != 0) 
						nr -= 1;
					nAmerika_1.setText(""+nr);
				}
			}
			@Override
			public void mouseReleased(MouseEvent e) {}			
			@Override
			public void mouseExited(MouseEvent e) {}
			@Override
			public void mouseEntered(MouseEvent e) {}			
			@Override
			public void mouseClicked(MouseEvent e) {}
		});
	
	}
	
	public void mousePressed(MouseEvent e) {
		System.out.println("HIER");
	}
	*/

	
	
	
	public void position()
	{
		//Linien
		lAfrikaAmerika.setBounds(300, 300, 80, 80);
		lnAmerika1.setBounds(220, 60, 80, 80);
		lnAmerika2.setBounds(199, 74, 80, 80);
		lnAmerika3.setBounds(230, 90, 80, 80);
		lAmerikaEuropa.setBounds(350, 80, 80, 80);
		lEuropa1.setBounds(390, 99, 80, 80);
		lEuropa2.setBounds(378, 99, 80, 80);
		lEuropa3.setBounds(393, 135, 80, 80);
		lEuropa4.setBounds(380, 150, 80, 80);
		lEuropa5.setBounds(380, 140, 80, 80);
		lEuropa6.setBounds(400, 140, 80, 80);
		lAfrika1.setBounds(535, 380, 80, 80);
		lAfrika2.setBounds(535, 350, 80, 80);
		lEuropaAfrika1.setBounds(370, 210, 80, 80);
		lEuropaAfrika2.setBounds(420, 199, 80, 80);
		lEuropaAfrika3.setBounds(440, 220, 80, 80);
		lAfrikaAsien.setBounds(515, 280, 80, 80);
		lAsien1.setBounds(775, 200, 80, 80);
		lAsien2.setBounds(800, 170, 80, 80);
		lAustralien1.setBounds(745, 300, 80, 80);
		lAustralien2.setBounds(770, 390, 80, 80);
		lAustralien3.setBounds(820, 390, 80, 80);
		lAustralien4.setBounds(750, 350, 80, 80);
		lAustralien5.setBounds(785, 390, 80, 80);
		lAsienAmerika1.setBounds(890, 110, 80, 80);
		lAsienAmerika2.setBounds(-50, 70, 80, 80);
		
		pnlGame.add(lAsienAmerika1);
		pnlGame.add(lAsienAmerika2);
		pnlGame.add(lAustralien1);
		pnlGame.add(lAustralien2);
		pnlGame.add(lAustralien3);
		pnlGame.add(lAustralien4);
		pnlGame.add(lAustralien5);
		pnlGame.add(lAsien1);
		pnlGame.add(lAsien2);
		pnlGame.add(lAfrikaAsien);
		pnlGame.add(lEuropaAfrika1);
		pnlGame.add(lEuropaAfrika2);
		pnlGame.add(lEuropaAfrika3);
		pnlGame.add(lAfrika1);
		pnlGame.add(lAfrika2);
		pnlGame.add(lEuropa1);
		pnlGame.add(lEuropa2);
		pnlGame.add(lEuropa3);
		pnlGame.add(lEuropa4);
		pnlGame.add(lEuropa5);
		pnlGame.add(lEuropa6);
		pnlGame.add(lAmerikaEuropa);
		pnlGame.add(lAfrikaAmerika);
		pnlGame.add(lnAmerika1);
		pnlGame.add(lnAmerika2);
		pnlGame.add(lnAmerika3);
				
//		nAmerika_1.setBounds(0, 80, 120, 60);
//		nAmerika_1.setName("nAmerika_1");
//		nAmerika_1.setText("1");
//		nAmerika_1.setForeground(Color.WHITE);
//		nAmerika_1.setHorizontalTextPosition(JLabel.CENTER);
//		nAmerika_1.setVerticalTextPosition(JLabel.CENTER);
//		nAmerika_6.setBounds(15, 0, 300, 200);
//		nAmerika_6.setName("nAmerika_6");
//		nAmerika_6.setForeground(Color.WHITE);
//		nAmerika_6.setText("6");
//		nAmerika_6.setHorizontalTextPosition(JLabel.CENTER);
//		nAmerika_6.setVerticalTextPosition(JLabel.CENTER);
//		nAmerika_2.setBounds(80, 90, 200, 100);
//		nAmerika_2.setName("nAmerika_2");
//		nAmerika_2.setText("2");
//		nAmerika_2.setForeground(Color.WHITE);
//		nAmerika_2.setHorizontalTextPosition(JLabel.CENTER);
//		nAmerika_2.setVerticalTextPosition(JLabel.CENTER);
//		nAmerika_7.setBounds(135, 55, 200, 200);
//		nAmerika_7.setText("7");
//		nAmerika_7.setName("nAmerika_7");
//		nAmerika_7.setForeground(Color.WHITE);
//		nAmerika_7.setHorizontalTextPosition(JLabel.CENTER);
//		nAmerika_7.setVerticalTextPosition(JLabel.CENTER);
//		nAmerika_9.setBounds(66, 90, 200, 200);
//		nAmerika_9.setName("nAmerika_9");
//		nAmerika_9.setText("9");
//		nAmerika_9.setForeground(Color.WHITE);
//		nAmerika_9.setHorizontalTextPosition(JLabel.CENTER);
//		nAmerika_9.setVerticalTextPosition(JLabel.CENTER);
//		nAmerika_4.setBounds(102, 100, 200, 200);
//		nAmerika_4.setText("4");
//		nAmerika_4.setName("nAmerika_4");
//		nAmerika_4.setForeground(Color.WHITE);
//		nAmerika_4.setHorizontalTextPosition(JLabel.CENTER);
//		nAmerika_4.setVerticalTextPosition(JLabel.CENTER);
//		nAmerika_8.setBounds(198, 48, 200, 200);
//		nAmerika_8.setText("8");
//		nAmerika_8.setName("nAmerika_8");
//		nAmerika_8.setForeground(Color.WHITE);
//		nAmerika_8.setHorizontalTextPosition(JLabel.CENTER);
//		nAmerika_8.setVerticalTextPosition(JLabel.CENTER);
//		nAmerika_3.setBounds(58, 160, 200, 200);
//		nAmerika_3.setText("3");
//		nAmerika_3.setName("nAmerika_3");
//		nAmerika_3.setForeground(Color.WHITE);
//		nAmerika_3.setHorizontalTextPosition(JLabel.CENTER);
//		nAmerika_3.setVerticalTextPosition(JLabel.CENTER);
//		nAmerika_5.setBounds(260, 0, 200, 200);
//		nAmerika_5.setText("5");
//		nAmerika_5.setName("nAmerika_5");
//		nAmerika_5.setForeground(Color.WHITE);
//		nAmerika_5.setHorizontalTextPosition(JLabel.CENTER);
//		nAmerika_5.setVerticalTextPosition(JLabel.CENTER);
		
		
//	    pnlGame.add(nAmerika_1);    
//	    pnlGame.add(nAmerika_2);
//	    pnlGame.add(nAmerika_3);
//	    pnlGame.add(nAmerika_4);
//	    pnlGame.add(nAmerika_5);
//	    pnlGame.add(nAmerika_6);
//	    pnlGame.add(nAmerika_7);
//	    pnlGame.add(nAmerika_8);
//	    pnlGame.add(nAmerika_9);
	    
//	    sAmerika_4.setBounds(158, 238, 200, 200);
//		sAmerika_4.setText("4");
//		sAmerika_4.setName("sAmerika_4");
//		sAmerika_4.setForeground(Color.WHITE);
//		sAmerika_4.setHorizontalTextPosition(JLabel.CENTER);
//		sAmerika_4.setVerticalTextPosition(JLabel.CENTER);
//		
//		sAmerika_3.setBounds(147, 346, 200, 100);
//		sAmerika_3.setText("3");
//		sAmerika_3.setName("sAmerika_3");
//		sAmerika_3.setForeground(Color.WHITE);
//		sAmerika_3.setHorizontalTextPosition(JLabel.CENTER);
//		sAmerika_3.setVerticalTextPosition(JLabel.CENTER);
//		
//		sAmerika_2.setBounds(122, 304, 300, 200);
//		sAmerika_2.setText("2");
//		sAmerika_2.setName("sAmerika_2");
//		sAmerika_2.setForeground(Color.WHITE);
//		sAmerika_2.setHorizontalTextPosition(JLabel.CENTER);
//		sAmerika_2.setVerticalTextPosition(JLabel.CENTER);
//		
//		sAmerika_1.setBounds(130, 380, 200, 200);
//		sAmerika_1.setText("1");
//		sAmerika_1.setName("sAmerika_1");
//		sAmerika_1.setForeground(Color.WHITE);
//		sAmerika_1.setHorizontalTextPosition(JLabel.CENTER);
//		sAmerika_1.setVerticalTextPosition(JLabel.CENTER);
				
//		pnlGame.add(sAmerika_1);
//	    pnlGame.add(sAmerika_2);
//	    pnlGame.add(sAmerika_3);
//	    pnlGame.add(sAmerika_4);
	    
//	    europa_2.setBounds(350, 70, 200, 100);
//		europa_2.setText("2");
//		europa_2.setName("europa_2");
//		europa_2.setForeground(Color.WHITE);
//		europa_2.setHorizontalTextPosition(JLabel.CENTER);
//		europa_2.setVerticalTextPosition(JLabel.CENTER);		
//		europa_1.setBounds(370, 70, 200, 200);
//		europa_1.setText("1");
//		europa_1.setName("europa_1");
//		europa_1.setForeground(Color.WHITE);
//		europa_1.setHorizontalTextPosition(JLabel.CENTER);
//		europa_1.setVerticalTextPosition(JLabel.CENTER);	
//		europa_7.setBounds(380, 110, 200, 200);
//		europa_7.setText("7");
//		europa_7.setName("europa_7");
//		europa_7.setForeground(Color.WHITE);
//		europa_7.setHorizontalTextPosition(JLabel.CENTER);
//		europa_7.setVerticalTextPosition(JLabel.CENTER);	
//		europa_3.setBounds(418, 87, 300, 200);
//		europa_3.setText("3");
//		europa_3.setName("europa_3");
//		europa_3.setForeground(Color.WHITE);
//		europa_3.setHorizontalTextPosition(JLabel.CENTER);
//		europa_3.setVerticalTextPosition(JLabel.CENTER);	
//		europa_5.setBounds(435, 116, 200, 200);
//		europa_5.setText("5");
//		europa_5.setName("europa_5");
//		europa_5.setForeground(Color.WHITE);
//		europa_5.setHorizontalTextPosition(JLabel.CENTER);
//		europa_5.setVerticalTextPosition(JLabel.CENTER);	
//		europa_6.setBounds(470, 30, 300, 300);		
//		europa_6.setText("6");
//		europa_6.setName("europa_6");
//		europa_6.setForeground(Color.WHITE);
//		europa_6.setHorizontalTextPosition(JLabel.CENTER);
//		europa_6.setVerticalTextPosition(JLabel.CENTER);	
//		europa_4.setBounds(430, 45, 200, 200);
//		europa_4.setText("4");
//		europa_4.setName("europa_4");
//		europa_4.setForeground(Color.WHITE);
//		europa_4.setHorizontalTextPosition(JLabel.CENTER);
//		europa_4.setVerticalTextPosition(JLabel.CENTER);	
		
//		pnlGame.add(europa_1);
//	    pnlGame.add(europa_2);
//	    pnlGame.add(europa_3);
//	    pnlGame.add(europa_4);
//	    pnlGame.add(europa_5);
//	    pnlGame.add(europa_6);
//	    pnlGame.add(europa_7);
	    
//	    afrika_5.setBounds(320, 210, 200, 200);
//		afrika_5.setText("5");
//		afrika_5.setName("afrika_5");
//		afrika_5.setForeground(Color.WHITE);
//		afrika_5.setHorizontalTextPosition(JLabel.CENTER);
//		afrika_5.setVerticalTextPosition(JLabel.CENTER);
//		afrika_3.setBounds(457, 190, 200, 200);		
//		afrika_3.setText("3");
//		afrika_3.setName("afrika_3");
//		afrika_3.setForeground(Color.WHITE);
//		afrika_3.setHorizontalTextPosition(JLabel.CENTER);
//		afrika_3.setVerticalTextPosition(JLabel.CENTER);
//		afrika_2.setBounds(480, 270, 200, 200);		
//		afrika_2.setText("10");
//		afrika_2.setName("afrika_2");
//		afrika_2.setForeground(Color.WHITE);
//		afrika_2.setHorizontalTextPosition(JLabel.CENTER);
//		afrika_2.setVerticalTextPosition(JLabel.CENTER);
//		afrika_1.setBounds(455, 332, 200, 100);
//		afrika_1.setText("1");
//		afrika_1.setName("afrika_1");
//		afrika_1.setForeground(Color.WHITE);
//		afrika_1.setHorizontalTextPosition(JLabel.CENTER);
//		afrika_1.setVerticalTextPosition(JLabel.CENTER);
//		afrika_6.setBounds(450, 291, 300, 300);	
//		afrika_6.setText("6");
//		afrika_6.setName("afrika_6");
//		afrika_6.setForeground(Color.WHITE);
//		afrika_6.setHorizontalTextPosition(JLabel.CENTER);
//		afrika_6.setVerticalTextPosition(JLabel.CENTER);
//		afrika_4.setBounds(560, 320, 300, 200);
//		afrika_4.setText("4");
//		afrika_4.setName("afrika_4");
//		afrika_4.setForeground(Color.WHITE);
//		afrika_4.setHorizontalTextPosition(JLabel.CENTER);
//		afrika_4.setVerticalTextPosition(JLabel.CENTER);
		
//		pnlGame.add(afrika_1);
//	    pnlGame.add(afrika_2);
//	    pnlGame.add(afrika_3);
//	    pnlGame.add(afrika_4);
//	    pnlGame.add(afrika_5);
//	    pnlGame.add(afrika_6);
	    
//	    asien_7.setBounds(497, 177, 200, 200);
//		asien_7.setText("7");
//		asien_7.setName("asien_7");
//		asien_7.setForeground(Color.WHITE);
//		asien_7.setHorizontalTextPosition(JLabel.CENTER);
//		asien_7.setVerticalTextPosition(JLabel.CENTER);
//		asien_1.setBounds(555, 107, 200, 200);
//		asien_1.setText("1");
//		asien_1.setName("asien_1");
//		asien_1.setForeground(Color.WHITE);
//		asien_1.setHorizontalTextPosition(JLabel.CENTER);
//		asien_1.setVerticalTextPosition(JLabel.CENTER);
//		asien_11.setBounds(550, 15, 300, 300);	
//		asien_11.setText("11");
//		asien_11.setName("asien_11");
//		asien_11.setForeground(Color.WHITE);
//		asien_11.setHorizontalTextPosition(JLabel.CENTER);
//		asien_11.setVerticalTextPosition(JLabel.CENTER);
//		asien_10.setBounds(583, 105, 200, 100);			
//		asien_10.setText("10");
//		asien_10.setName("asien_10");
//		asien_10.setForeground(Color.WHITE);
//		asien_10.setHorizontalTextPosition(JLabel.CENTER);
//		asien_10.setVerticalTextPosition(JLabel.CENTER);
//		asien_3.setBounds(603, 190, 200, 200);		
//		asien_3.setText("3");
//		asien_3.setName("asien_3");
//		asien_3.setForeground(Color.WHITE);
//		asien_3.setHorizontalTextPosition(JLabel.CENTER);
//		asien_3.setVerticalTextPosition(JLabel.CENTER);
//		asien_2.setBounds(633, 148, 200, 200);
//		asien_2.setText("2");
//		asien_2.setName("asien_2");
//		asien_2.setForeground(Color.WHITE);
//		asien_2.setHorizontalTextPosition(JLabel.CENTER);
//		asien_2.setVerticalTextPosition(JLabel.CENTER);
//		asien_8.setBounds(655, 120, 200, 200);		
//		asien_8.setText("8");
//		asien_8.setName("asien_8");
//		asien_8.setForeground(Color.WHITE);
//		asien_8.setHorizontalTextPosition(JLabel.CENTER);
//		asien_8.setVerticalTextPosition(JLabel.CENTER);
//		asien_4.setBounds(660, 128, 200, 100);
//		asien_4.setText("4");
//		asien_4.setName("asien_4");
//		asien_4.setForeground(Color.WHITE);
//		asien_4.setHorizontalTextPosition(JLabel.CENTER);
//		asien_4.setVerticalTextPosition(JLabel.CENTER);
//		asien_12.setBounds(670, 50, 300, 200);
//		asien_12.setText("12");
//		asien_12.setName("asien_12");
//		asien_12.setForeground(Color.WHITE);
//		asien_12.setHorizontalTextPosition(JLabel.CENTER);
//		asien_12.setVerticalTextPosition(JLabel.CENTER);
//		asien_6.setBounds(760, 80, 300, 200);			
//		asien_6.setText("6");
//		asien_6.setName("asien_6");
//		asien_6.setForeground(Color.WHITE);
//		asien_6.setHorizontalTextPosition(JLabel.CENTER);
//		asien_6.setVerticalTextPosition(JLabel.CENTER);
//		asien_5.setBounds(790, 100, 300, 300);			
//		asien_5.setText("5");
//		asien_5.setName("asien_5");
//		asien_5.setForeground(Color.WHITE);
//		asien_5.setHorizontalTextPosition(JLabel.CENTER);
//		asien_5.setVerticalTextPosition(JLabel.CENTER);
//		asien_9.setBounds(707, 220, 200, 200);	
//		asien_9.setText("9");
//		asien_9.setName("asien_9");
//		asien_9.setForeground(Color.WHITE);
//		asien_9.setHorizontalTextPosition(JLabel.CENTER);
//		asien_9.setVerticalTextPosition(JLabel.CENTER);
		
		
//		pnlGame.add(asien_1);
//	    pnlGame.add(asien_2);
//	    pnlGame.add(asien_3);
//	    pnlGame.add(asien_4);
//	    pnlGame.add(asien_5);
//	    pnlGame.add(asien_6);
//	    pnlGame.add(asien_7);
//	    pnlGame.add(asien_8);
//	    pnlGame.add(asien_9);
//	    pnlGame.add(asien_10);
//	    pnlGame.add(asien_11);
//	    pnlGame.add(asien_12);
	    
//	    australien_2.setBounds(682, 265, 200, 200);
//		australien_2.setText("2");
//		australien_2.setName("australien_2");
//		australien_2.setForeground(Color.WHITE);
//		australien_2.setHorizontalTextPosition(JLabel.CENTER);
//		australien_2.setVerticalTextPosition(JLabel.CENTER);
//	    australien_3.setBounds(800, 345, 200, 100);
//	    australien_3.setText("3");
//	    australien_3.setName("australien_3");
//	    australien_3.setForeground(Color.WHITE);
//	    australien_3.setHorizontalTextPosition(JLabel.CENTER);
//	    australien_3.setVerticalTextPosition(JLabel.CENTER);
//		australien_1.setBounds(815, 425, 100, 100);
//		australien_1.setText("1");
//		australien_1.setName("australien_1");
//		australien_1.setForeground(Color.WHITE);
//		australien_1.setHorizontalTextPosition(JLabel.CENTER);
//		australien_1.setVerticalTextPosition(JLabel.CENTER);
//	    australien_4.setBounds(772, 425, 100, 100);
//	    australien_4.setText("4");
//	    australien_4.setName("australien_4");
//	    australien_4.setForeground(Color.WHITE);
//	    australien_4.setHorizontalTextPosition(JLabel.CENTER);
//	    australien_4.setVerticalTextPosition(JLabel.CENTER);
	    
//	    pnlGame.add(australien_1);
//	    pnlGame.add(australien_2);
//	    pnlGame.add(australien_3);
//	    pnlGame.add(australien_4);
	}
	

	
	public gui(){		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(980, 600);
		frame.setTitle("Risiko");	
		frame.setResizable(false);
		Player();	    
		frame.setVisible(true);
	}
	
	public void SetNewColor(ImageLabel lbl, String text, String color)
	{
		String[] splittArray = lbl.getName().split("\\_");
		lbl.setIcon(new ImageIcon("Images/"+splittArray[0]+"/"+splittArray[1]+"/"+color+".gif"));
		lbl.setText(text);
	}
	
	
	public void Game(){
		pnlGame.setLayout(null);
		pnlGame.setSize(100,200);
		pnlGame.setBackground(Color.GRAY);
	    frame.add(pnlGame);		
	    //positionierung der einzelnen laender
	    position();
	}
	
	
	public void Player(){
		
		pnlMenue.setLayout(new GridBagLayout());	
		
		
		
		groupComputer.add( rb1Computer );
		rb1Computer.setActionCommand("1");
		rb1Computer.setSelected(true);
		groupComputer.add( rb2Computer );
		rb2Computer.setActionCommand("2");
		groupComputer.add( rb3Computer );
		rb3Computer.setActionCommand("3");
		groupComputer.add( rb4Computer );
		rb4Computer.setActionCommand("4");
		groupComputer.add( rb5Computer );
		rb5Computer.setActionCommand("5");
		
		
		
		pnlMenue.add( rb1Computer,new GridBagConstraints(
									1, 1, 
									1, 1,
										0.0, 0.0, 
									GridBagConstraints.LINE_START, 										GridBagConstraints.HORIZONTAL, 
									new Insets(10, 10, 10, 10),
									0, 0));
		pnlMenue.add( rb2Computer,new GridBagConstraints(
									2, 1, 
									1, 1,
										0.0, 0.0, 
									GridBagConstraints.LINE_START, 										GridBagConstraints.HORIZONTAL, 
									new Insets(10, 10, 10, 10),
									0, 0));
		pnlMenue.add( rb3Computer,new GridBagConstraints(
									3, 1, 
									1, 1,
										0.0, 0.0, 
									GridBagConstraints.LINE_START, 										GridBagConstraints.HORIZONTAL, 
									new Insets(10, 10, 10, 10),
									0, 0));
		pnlMenue.add( rb4Computer,new GridBagConstraints(
									4, 1, 
									1, 1,
										0.0, 0.0, 
									GridBagConstraints.LINE_START, 										GridBagConstraints.HORIZONTAL, 
									new Insets(10, 10, 10, 10),
									0, 0));
		pnlMenue.add( rb5Computer,new GridBagConstraints(
									5, 1, 
									1, 1,
										0.0, 0.0, 
									GridBagConstraints.LINE_START, 										GridBagConstraints.HORIZONTAL, 
									new Insets(10, 10, 10, 10),
									0, 0));
		pnlMenue.add( lblComputer,new GridBagConstraints(
									0, 1, 
									1, 1,
									0.0, 0.0, 
									GridBagConstraints.LINE_START, 										GridBagConstraints.HORIZONTAL, 
									new Insets(10, 10, 10, 10),
									0, 0));
		pnlMenue.add( btnPlay,new GridBagConstraints(
									0, 3, 
									1, 1,
									0.0, 0.0, 
									GridBagConstraints.LINE_START, 										GridBagConstraints.HORIZONTAL, 
									new Insets(10, 10, 10, 10),
									0, 0));
		 frame.add(pnlMenue);
		
		
		
		btnPlay.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				playerCount = Integer.parseInt(groupComputer.getSelection().getActionCommand());
				//Spiel inizialisieren neue pnlmain machen
				pnlMenue.setVisible(false);				
				Game();
				Main.gameEngine.run();
				
			}
		});
	}
	
	
	
//	public void inizialGame()
//	{
//		SetNewColor(nAmerika_1, "1", "rot");
//		SetNewColor(nAmerika_2, "1", "blau");
//		SetNewColor(nAmerika_3, "1", "tk");
//		SetNewColor(nAmerika_4, "1", "gruen");
//		SetNewColor(nAmerika_5, "1", "gelb");
//		SetNewColor(nAmerika_6, "1", "gruen");
//		SetNewColor(nAmerika_7, "1", "gelb");
//		SetNewColor(nAmerika_8, "1", "tk");
//		SetNewColor(nAmerika_9, "1", "lila");
//		
//		SetNewColor(sAmerika_1, "1", "blau");
//		SetNewColor(sAmerika_2, "1", "gruen");
//		SetNewColor(sAmerika_3, "1", "lila");
//		SetNewColor(sAmerika_4, "1", "tk");
//		
//		SetNewColor(afrika_1, "1", "tk");
//		SetNewColor(afrika_2, "1", "blau");
//		SetNewColor(afrika_3, "1", "lila");
//		SetNewColor(afrika_4, "1", "gruen");
//		SetNewColor(afrika_5, "1", "rot");
//		SetNewColor(afrika_6, "1", "gelb");
//		
//		SetNewColor(europa_1, "1", "gelb");
//		SetNewColor(europa_2, "1", "gruen");
//		SetNewColor(europa_3, "1", "blau");
//		SetNewColor(europa_4, "1", "tk");
//		SetNewColor(europa_5, "1", "lila");
//		SetNewColor(europa_6, "1", "rot");
//		SetNewColor(europa_7, "1", "gelb");
//		
//		SetNewColor(asien_1, "1", "gelb");
//		SetNewColor(asien_2, "1", "blau");
//		SetNewColor(asien_3, "1", "lila");
//		SetNewColor(asien_4, "1", "gruen");
//		SetNewColor(asien_5, "1", "tk");
//		SetNewColor(asien_6, "1", "rot");
//		SetNewColor(asien_7, "1", "gelb");
//		SetNewColor(asien_8, "1", "gruen");
//		SetNewColor(asien_9, "1", "blau");
//		SetNewColor(asien_10, "1", "tk");
//		SetNewColor(asien_11, "1", "rot");
//		SetNewColor(asien_12, "1", "lila");
//		
//
//		SetNewColor(australien_1, "1", "lila");
//		SetNewColor(australien_2, "1", "gelb");
//		SetNewColor(australien_3, "1", "gruen");
//		SetNewColor(australien_4, "1", "blau");
//	}
	
}


