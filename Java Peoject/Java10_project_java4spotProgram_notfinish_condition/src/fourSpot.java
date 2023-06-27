import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class fourSpot implements ActionListener{

	Random random = new Random();
	JFrame frame = new JFrame();
	JPanel title_panel = new JPanel();
	JPanel button_panel = new JPanel();
	JLabel textfield = new JLabel();
	JButton[] buttons = new JButton[42];
	boolean player1_turn;

	fourSpot(){
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,800);
		frame.getContentPane().setBackground(new Color(50,50,50));
		frame.setLayout(new BorderLayout());
		frame.setVisible(true);
		
		textfield.setBackground(new Color(25,25,25));
		textfield.setForeground(new Color(25,255,0));
		textfield.setFont(new Font("Ink Free",Font.BOLD,75));
		textfield.setHorizontalAlignment(JLabel.CENTER);
		textfield.setText("4Spot");
		textfield.setOpaque(true);
		
		title_panel.setLayout(new BorderLayout());
		title_panel.setBounds(0,0,800,100);
		
		button_panel.setLayout(new GridLayout(6,7));
		button_panel.setBackground(new Color(150,150,150));
		
		for(int i=0;i<42;i++) {
			buttons[i] = new JButton();
			button_panel.add(buttons[i]);
			buttons[i].setFont(new Font("MV Boli",Font.BOLD,120));
			buttons[i].setFocusable(false);
			buttons[i].addActionListener(this);
		}
		
		title_panel.add(textfield);
		frame.add(title_panel,BorderLayout.NORTH);
		frame.add(button_panel);
		
		firstTurn();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		for(int i=0;i<42;i++) {
			if(e.getSource()==buttons[i]) {
				if(player1_turn) {
					if(buttons[i].getText()=="") {
						buttons[i].setForeground(new Color(205, 24, 24));
						buttons[i].setText("○");
						player1_turn=false;
						textfield.setText("Orange turn");
						check();
					}
				}
				else {
					if(buttons[i].getText()=="") {
						buttons[i].setForeground(new Color(255, 96, 0));
						buttons[i].setText("●");
						player1_turn=true;
						textfield.setText("Red turn");
						check();
					}
				}
			}			
		}
	}
	
	public void firstTurn() {
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(random.nextInt(2)==0) {
			player1_turn=true;
			textfield.setText("red turn");
		}
		else {
			player1_turn=false;
			textfield.setText("orange turn");
		}
	}
	
	public void check() {
		//red
		//check red win conditions H0
		if(
				(buttons[0].getText()=="○") &&
				(buttons[1].getText()=="○") &&
				(buttons[2].getText()=="○") &&
				(buttons[3].getText()=="○")
				) {redWins(0,1,2,3);}
		if(
				(buttons[1].getText()=="○") &&
				(buttons[2].getText()=="○") &&
				(buttons[3].getText()=="○") &&
				(buttons[4].getText()=="○")
				) {redWins(1,2,3,4);}
		if(
				(buttons[2].getText()=="○") &&
				(buttons[3].getText()=="○") &&
				(buttons[4].getText()=="○") &&
				(buttons[5].getText()=="○")
				) {redWins(2,3,4,5);}
		if(
				(buttons[3].getText()=="○") &&
				(buttons[4].getText()=="○") &&
				(buttons[5].getText()=="○") &&
				(buttons[6].getText()=="○")
				) {redWins(3,4,5,6);}
		
		//check red win conditions H1
		if(
				(buttons[7].getText()=="○") &&
				(buttons[8].getText()=="○") &&
				(buttons[9].getText()=="○") &&
				(buttons[10].getText()=="○")
				) {redWins(7,8,9,10);}
		if(
				(buttons[8].getText()=="○") &&
				(buttons[9].getText()=="○") &&
				(buttons[10].getText()=="○") &&
				(buttons[11].getText()=="○")
				) {redWins(8,9,10,11);}
		if(
				(buttons[9].getText()=="○") &&
				(buttons[10].getText()=="○") &&
				(buttons[11].getText()=="○") &&
				(buttons[12].getText()=="○")
				) {redWins(9,10,11,12);}
		if(
				(buttons[10].getText()=="○") &&
				(buttons[11].getText()=="○") &&
				(buttons[12].getText()=="○") &&
				(buttons[13].getText()=="○")
				) {redWins(10,11,12,13);}
		
		//check red win conditions H2
		if(
				(buttons[14].getText()=="○") &&
				(buttons[15].getText()=="○") &&
				(buttons[16].getText()=="○") &&
				(buttons[17].getText()=="○")
				) {redWins(14,15,16,17);}
		if(
				(buttons[15].getText()=="○") &&
				(buttons[16].getText()=="○") &&
				(buttons[17].getText()=="○") &&
				(buttons[18].getText()=="○")
				) {redWins(15,16,17,18);}
		if(
				(buttons[16].getText()=="○") &&
				(buttons[17].getText()=="○") &&
				(buttons[18].getText()=="○") &&
				(buttons[19].getText()=="○")
				) {redWins(16,17,18,19);}
		if(
				(buttons[17].getText()=="○") &&
				(buttons[18].getText()=="○") &&
				(buttons[19].getText()=="○") &&
				(buttons[20].getText()=="○")
				) {redWins(17,18,19,20);}
		
		//check red win conditions H3
		if(
				(buttons[21].getText()=="○") &&
				(buttons[22].getText()=="○") &&
				(buttons[23].getText()=="○") &&
				(buttons[24].getText()=="○")
				) {redWins(21,22,23,24);}
		if(
				(buttons[22].getText()=="○") &&
				(buttons[23].getText()=="○") &&
				(buttons[24].getText()=="○") &&
				(buttons[25].getText()=="○")
				) {redWins(22,23,24,25);}
		if(
				(buttons[23].getText()=="○") &&
				(buttons[24].getText()=="○") &&
				(buttons[25].getText()=="○") &&
				(buttons[26].getText()=="○")
				) {redWins(23,24,25,26);}
		if(
				(buttons[24].getText()=="○") &&
				(buttons[25].getText()=="○") &&
				(buttons[26].getText()=="○") &&
				(buttons[27].getText()=="○")
				) {redWins(24,25,26,27);}
		
		//check red win conditions H4
		if(
				(buttons[28].getText()=="○") &&
				(buttons[29].getText()=="○") &&
				(buttons[30].getText()=="○") &&
				(buttons[31].getText()=="○")
				) {redWins(28,29,30,31);}
		if(
				(buttons[29].getText()=="○") &&
				(buttons[30].getText()=="○") &&
				(buttons[31].getText()=="○") &&
				(buttons[32].getText()=="○")
				) {redWins(29,30,31,32);}
		if(
				(buttons[30].getText()=="○") &&
				(buttons[31].getText()=="○") &&
				(buttons[32].getText()=="○") &&
				(buttons[33].getText()=="○")
				) {redWins(30,31,32,33);}
		if(
				(buttons[31].getText()=="○") &&
				(buttons[32].getText()=="○") &&
				(buttons[33].getText()=="○") &&
				(buttons[34].getText()=="○")
				) {redWins(31,32,33,34);}
		
		//check red win conditions H5
		if(
				(buttons[35].getText()=="○") &&
				(buttons[36].getText()=="○") &&
				(buttons[37].getText()=="○") &&
				(buttons[38].getText()=="○")
				) {redWins(35,36,37,38);}
		if(
				(buttons[36].getText()=="○") &&
				(buttons[37].getText()=="○") &&
				(buttons[38].getText()=="○") &&
				(buttons[39].getText()=="○")
				) {redWins(36,37,38,39);}
		if(
				(buttons[37].getText()=="○") &&
				(buttons[38].getText()=="○") &&
				(buttons[39].getText()=="○") &&
				(buttons[40].getText()=="○")
				) {redWins(37,38,39,40);}
		if(
				(buttons[38].getText()=="○") &&
				(buttons[39].getText()=="○") &&
				(buttons[40].getText()=="○") &&
				(buttons[41].getText()=="○")
				) {redWins(38,39,40,41);}
		
		//check red win conditions V0
		if(
				(buttons[0].getText()=="○") &&
				(buttons[7].getText()=="○") &&
				(buttons[14].getText()=="○")&&
				(buttons[21].getText()=="○")
				) {redWins(0,7,14,21);}
		if(
				(buttons[7].getText()=="○") &&
				(buttons[14].getText()=="○") &&
				(buttons[21].getText()=="○")&&
				(buttons[28].getText()=="○")
				) {redWins(7,14,21,28);}
		if(
				(buttons[14].getText()=="○") &&
				(buttons[21].getText()=="○") &&
				(buttons[28].getText()=="○")&&
				(buttons[35].getText()=="○")
				) {redWins(14,21,28,35);}
		
		//check red win conditions V1
		if(
				(buttons[1].getText()=="○") &&
				(buttons[8].getText()=="○") &&
				(buttons[15].getText()=="○")&&
				(buttons[22].getText()=="○")
				) {redWins(1,8,15,22);}
		if(
				(buttons[8].getText()=="○") &&
				(buttons[15].getText()=="○") &&
				(buttons[22].getText()=="○")&&
				(buttons[29].getText()=="○")
				) {redWins(8,15,22,29);}
		if(
				(buttons[15].getText()=="○") &&
				(buttons[22].getText()=="○") &&
				(buttons[29].getText()=="○")&&
				(buttons[36].getText()=="○")
				) {redWins(15,22,29,36);}

		//check red win conditions V2
		if(
				(buttons[2].getText()=="○") &&
				(buttons[9].getText()=="○") &&
				(buttons[16].getText()=="○")&&
				(buttons[23].getText()=="○")
				) {redWins(2,9,16,23);}
		if(
				(buttons[9].getText()=="○") &&
				(buttons[16].getText()=="○") &&
				(buttons[23].getText()=="○")&&
				(buttons[30].getText()=="○")
				) {redWins(9,16,23,30);}
		if(
				(buttons[16].getText()=="○") &&
				(buttons[23].getText()=="○") &&
				(buttons[30].getText()=="○")&&
				(buttons[37].getText()=="○")
				) {redWins(16,23,30,37);}
		
		//check red win conditions V3
		if(
				(buttons[3].getText()=="○") &&
				(buttons[10].getText()=="○") &&
				(buttons[17].getText()=="○")&&
				(buttons[24].getText()=="○")
				) {redWins(3,10,17,24);}
		if(
				(buttons[10].getText()=="○") &&
				(buttons[17].getText()=="○") &&
				(buttons[24].getText()=="○")&&
				(buttons[31].getText()=="○")
				) {redWins(10,17,24,31);}
		if(
				(buttons[17].getText()=="○") &&
				(buttons[24].getText()=="○") &&
				(buttons[31].getText()=="○")&&
				(buttons[38].getText()=="○")
				) {redWins(17,24,31,38);}
		
		//check red win conditions V4
		if(
				(buttons[4].getText()=="○") &&
				(buttons[11].getText()=="○") &&
				(buttons[18].getText()=="○")&&
				(buttons[25].getText()=="○")
				) {redWins(4,11,18,25);}
		if(
				(buttons[11].getText()=="○") &&
				(buttons[18].getText()=="○") &&
				(buttons[25].getText()=="○")&&
				(buttons[32].getText()=="○")
				) {redWins(11,18,25,32);}
		if(
				(buttons[18].getText()=="○") &&
				(buttons[25].getText()=="○") &&
				(buttons[32].getText()=="○")&&
				(buttons[39].getText()=="○")
				) {redWins(18,25,32,39);}
		
		//check red win conditions V5
		if(
				(buttons[5].getText()=="○") &&
				(buttons[12].getText()=="○") &&
				(buttons[19].getText()=="○")&&
				(buttons[26].getText()=="○")
				) {redWins(5,12,19,26);}
		if(
				(buttons[12].getText()=="○") &&
				(buttons[19].getText()=="○") &&
				(buttons[26].getText()=="○")&&
				(buttons[33].getText()=="○")
				) {redWins(12,19,26,33);}
		if(
				(buttons[19].getText()=="○") &&
				(buttons[26].getText()=="○") &&
				(buttons[33].getText()=="○")&&
				(buttons[40].getText()=="○")
				) {redWins(19,26,33,40);}
		
		//check red win conditions V6
		if(
				(buttons[6].getText()=="○") &&
				(buttons[13].getText()=="○") &&
				(buttons[20].getText()=="○")&&
				(buttons[27].getText()=="○")
				) {redWins(6,13,20,27);}
		if(
				(buttons[13].getText()=="○") &&
				(buttons[20].getText()=="○") &&
				(buttons[27].getText()=="○")&&
				(buttons[34].getText()=="○")
				) {redWins(13,20,27,34);}
		if(
				(buttons[20].getText()=="○") &&
				(buttons[27].getText()=="○") &&
				(buttons[34].getText()=="○")&&
				(buttons[41].getText()=="○")
				) {redWins(20,27,34,41);}
		
		//Orange
				//check red win conditions H0
				if(
						(buttons[0].getText()=="●") &&
						(buttons[1].getText()=="●") &&
						(buttons[2].getText()=="●") &&
						(buttons[3].getText()=="●")
						) {orangeWins(0,1,2,3);}
				if(
						(buttons[1].getText()=="●") &&
						(buttons[2].getText()=="●") &&
						(buttons[3].getText()=="●") &&
						(buttons[4].getText()=="●")
						) {orangeWins(1,2,3,4);}
				if(
						(buttons[2].getText()=="●") &&
						(buttons[3].getText()=="●") &&
						(buttons[4].getText()=="●") &&
						(buttons[5].getText()=="●")
						) {orangeWins(2,3,4,5);}
				if(
						(buttons[3].getText()=="●") &&
						(buttons[4].getText()=="●") &&
						(buttons[5].getText()=="●") &&
						(buttons[6].getText()=="●")
						) {orangeWins(3,4,5,6);}
				
				//check red win conditions H1
				if(
						(buttons[7].getText()=="●") &&
						(buttons[8].getText()=="●") &&
						(buttons[9].getText()=="●") &&
						(buttons[10].getText()=="●")
						) {orangeWins(7,8,9,10);}
				if(
						(buttons[8].getText()=="●") &&
						(buttons[9].getText()=="●") &&
						(buttons[10].getText()=="●") &&
						(buttons[11].getText()=="●")
						) {orangeWins(8,9,10,11);}
				if(
						(buttons[9].getText()=="●") &&
						(buttons[10].getText()=="●") &&
						(buttons[11].getText()=="●") &&
						(buttons[12].getText()=="●")
						) {orangeWins(9,10,11,12);}
				if(
						(buttons[10].getText()=="●") &&
						(buttons[11].getText()=="●") &&
						(buttons[12].getText()=="●") &&
						(buttons[13].getText()=="●")
						) {orangeWins(10,11,12,13);}
				
				//check red win conditions H2
				if(
						(buttons[14].getText()=="●") &&
						(buttons[15].getText()=="●") &&
						(buttons[16].getText()=="●") &&
						(buttons[17].getText()=="●")
						) {orangeWins(14,15,16,17);}
				if(
						(buttons[15].getText()=="●") &&
						(buttons[16].getText()=="●") &&
						(buttons[17].getText()=="●") &&
						(buttons[18].getText()=="●")
						) {orangeWins(15,16,17,18);}
				if(
						(buttons[16].getText()=="●") &&
						(buttons[17].getText()=="●") &&
						(buttons[18].getText()=="●") &&
						(buttons[19].getText()=="●")
						) {orangeWins(16,17,18,19);}
				if(
						(buttons[17].getText()=="●") &&
						(buttons[18].getText()=="●") &&
						(buttons[19].getText()=="●") &&
						(buttons[20].getText()=="●")
						) {orangeWins(17,18,19,20);}
				
				//check red win conditions H3
				if(
						(buttons[21].getText()=="●") &&
						(buttons[22].getText()=="●") &&
						(buttons[23].getText()=="●") &&
						(buttons[24].getText()=="●")
						) {orangeWins(21,22,23,24);}
				if(
						(buttons[22].getText()=="●") &&
						(buttons[23].getText()=="●") &&
						(buttons[24].getText()=="●") &&
						(buttons[25].getText()=="●")
						) {orangeWins(22,23,24,25);}
				if(
						(buttons[23].getText()=="●") &&
						(buttons[24].getText()=="●") &&
						(buttons[25].getText()=="●") &&
						(buttons[26].getText()=="●")
						) {orangeWins(23,24,25,26);}
				if(
						(buttons[24].getText()=="●") &&
						(buttons[25].getText()=="●") &&
						(buttons[26].getText()=="●") &&
						(buttons[27].getText()=="●")
						) {orangeWins(24,25,26,27);}
				
				//check red win conditions H4
				if(
						(buttons[28].getText()=="●") &&
						(buttons[29].getText()=="●") &&
						(buttons[30].getText()=="●") &&
						(buttons[31].getText()=="●")
						) {orangeWins(28,29,30,31);}
				if(
						(buttons[29].getText()=="●") &&
						(buttons[30].getText()=="●") &&
						(buttons[31].getText()=="●") &&
						(buttons[32].getText()=="●")
						) {orangeWins(29,30,31,32);}
				if(
						(buttons[30].getText()=="●") &&
						(buttons[31].getText()=="●") &&
						(buttons[32].getText()=="●") &&
						(buttons[33].getText()=="●")
						) {orangeWins(30,31,32,33);}
				if(
						(buttons[31].getText()=="●") &&
						(buttons[32].getText()=="●") &&
						(buttons[33].getText()=="●") &&
						(buttons[34].getText()=="●")
						) {orangeWins(31,32,33,34);}
				
				//check red win conditions H5
				if(
						(buttons[35].getText()=="●") &&
						(buttons[36].getText()=="●") &&
						(buttons[37].getText()=="●") &&
						(buttons[38].getText()=="●")
						) {orangeWins(35,36,37,38);}
				if(
						(buttons[36].getText()=="●") &&
						(buttons[37].getText()=="●") &&
						(buttons[38].getText()=="●") &&
						(buttons[39].getText()=="●")
						) {orangeWins(36,37,38,39);}
				if(
						(buttons[37].getText()=="●") &&
						(buttons[38].getText()=="●") &&
						(buttons[39].getText()=="●") &&
						(buttons[40].getText()=="●")
						) {orangeWins(37,38,39,40);}
				if(
						(buttons[38].getText()=="●") &&
						(buttons[39].getText()=="●") &&
						(buttons[40].getText()=="●") &&
						(buttons[41].getText()=="●")
						) {orangeWins(38,39,40,41);}
				
				//check red win conditions V0
				if(
						(buttons[0].getText()=="●") &&
						(buttons[7].getText()=="●") &&
						(buttons[14].getText()=="●")&&
						(buttons[21].getText()=="●")
						) {orangeWins(0,7,14,21);}
				if(
						(buttons[7].getText()=="●") &&
						(buttons[14].getText()=="●") &&
						(buttons[21].getText()=="●")&&
						(buttons[28].getText()=="●")
						) {orangeWins(7,14,21,28);}
				if(
						(buttons[14].getText()=="●") &&
						(buttons[21].getText()=="●") &&
						(buttons[28].getText()=="●")&&
						(buttons[35].getText()=="●")
						) {orangeWins(14,21,28,35);}
				
				//check red win conditions V1
				if(
						(buttons[1].getText()=="●") &&
						(buttons[8].getText()=="●") &&
						(buttons[15].getText()=="●")&&
						(buttons[22].getText()=="●")
						) {orangeWins(1,8,15,22);}
				if(
						(buttons[8].getText()=="●") &&
						(buttons[15].getText()=="●") &&
						(buttons[22].getText()=="●")&&
						(buttons[29].getText()=="●")
						) {orangeWins(8,15,22,29);}
				if(
						(buttons[15].getText()=="●") &&
						(buttons[22].getText()=="●") &&
						(buttons[29].getText()=="●")&&
						(buttons[36].getText()=="●")
						) {orangeWins(15,22,29,36);}

				//check red win conditions V2
				if(
						(buttons[2].getText()=="●") &&
						(buttons[9].getText()=="●") &&
						(buttons[16].getText()=="●")&&
						(buttons[23].getText()=="●")
						) {orangeWins(2,9,16,23);}
				if(
						(buttons[9].getText()=="●") &&
						(buttons[16].getText()=="●") &&
						(buttons[23].getText()=="●")&&
						(buttons[30].getText()=="●")
						) {orangeWins(9,16,23,30);}
				if(
						(buttons[16].getText()=="●") &&
						(buttons[23].getText()=="●") &&
						(buttons[30].getText()=="●")&&
						(buttons[37].getText()=="●")
						) {orangeWins(16,23,30,37);}
				
				//check red win conditions V3
				if(
						(buttons[3].getText()=="●") &&
						(buttons[10].getText()=="●") &&
						(buttons[17].getText()=="●")&&
						(buttons[24].getText()=="●")
						) {orangeWins(3,10,17,24);}
				if(
						(buttons[10].getText()=="●") &&
						(buttons[17].getText()=="●") &&
						(buttons[24].getText()=="●")&&
						(buttons[31].getText()=="●")
						) {orangeWins(10,17,24,31);}
				if(
						(buttons[17].getText()=="●") &&
						(buttons[24].getText()=="●") &&
						(buttons[31].getText()=="●")&&
						(buttons[38].getText()=="●")
						) {orangeWins(17,24,31,38);}
				
				//check red win conditions V4
				if(
						(buttons[4].getText()=="●") &&
						(buttons[11].getText()=="●") &&
						(buttons[18].getText()=="●")&&
						(buttons[25].getText()=="●")
						) {orangeWins(4,11,18,25);}
				if(
						(buttons[11].getText()=="●") &&
						(buttons[18].getText()=="●") &&
						(buttons[25].getText()=="●")&&
						(buttons[32].getText()=="●")
						) {orangeWins(11,18,25,32);}
				if(
						(buttons[18].getText()=="●") &&
						(buttons[25].getText()=="●") &&
						(buttons[32].getText()=="●")&&
						(buttons[39].getText()=="●")
						) {orangeWins(18,25,32,39);}
				
				//check red win conditions V5
				if(
						(buttons[5].getText()=="●") &&
						(buttons[12].getText()=="●") &&
						(buttons[19].getText()=="●")&&
						(buttons[26].getText()=="●")
						) {orangeWins(5,12,19,26);}
				if(
						(buttons[12].getText()=="●") &&
						(buttons[19].getText()=="●") &&
						(buttons[26].getText()=="●")&&
						(buttons[33].getText()=="●")
						) {orangeWins(12,19,26,33);}
				if(
						(buttons[19].getText()=="●") &&
						(buttons[26].getText()=="●") &&
						(buttons[33].getText()=="●")&&
						(buttons[40].getText()=="●")
						) {orangeWins(19,26,33,40);}
				
				//check orange win conditions V6
				if(
						(buttons[6].getText()=="●") &&
						(buttons[13].getText()=="●") &&
						(buttons[20].getText()=="●")&&
						(buttons[27].getText()=="●")
						) {orangeWins(6,13,20,27);}
				if(
						(buttons[13].getText()=="●") &&
						(buttons[20].getText()=="●") &&
						(buttons[27].getText()=="●")&&
						(buttons[34].getText()=="●")
						) {orangeWins(13,20,27,34);}
				if(
						(buttons[20].getText()=="●") &&
						(buttons[27].getText()=="●") &&
						(buttons[34].getText()=="●")&&
						(buttons[41].getText()=="●")
						) {orangeWins(20,27,34,41);}
				
				//red
				//check\1
				if(
						(buttons[3].getText()=="○") &&
						(buttons[11].getText()=="○") &&
						(buttons[19].getText()=="○")&&
						(buttons[27].getText()=="○")
						) {redWins(3,11,19,27);}
				
				//check\2
				if(
						(buttons[2].getText()=="○") &&
						(buttons[10].getText()=="○") &&
						(buttons[18].getText()=="○")&&
						(buttons[26].getText()=="○")
						) {redWins(2,10,18,26);}
				
				if(
						(buttons[10].getText()=="○") &&
						(buttons[18].getText()=="○") &&
						(buttons[26].getText()=="○")&&
						(buttons[34].getText()=="○")
						) {redWins(10,18,26,34);}
				
				//check\3
				if(
						(buttons[1].getText()=="○") &&
						(buttons[9].getText()=="○") &&
						(buttons[17].getText()=="○")&&
						(buttons[25].getText()=="○")
						) {redWins(1,9,17,25);}
				
				if(
						(buttons[9].getText()=="○") &&
						(buttons[17].getText()=="○") &&
						(buttons[25].getText()=="○")&&
						(buttons[33].getText()=="○")
						) {redWins(9,17,25,33);}
				
				if(
						(buttons[17].getText()=="○") &&
						(buttons[25].getText()=="○") &&
						(buttons[33].getText()=="○")&&
						(buttons[41].getText()=="○")
						) {redWins(17,25,33,41);}
				
				//check\4
				if(
						(buttons[0].getText()=="○") &&
						(buttons[8].getText()=="○") &&
						(buttons[16].getText()=="○")&&
						(buttons[24].getText()=="○")
						) {redWins(0,8,16,24);}
				
				if(
						(buttons[8].getText()=="○") &&
						(buttons[16].getText()=="○") &&
						(buttons[24].getText()=="○")&&
						(buttons[32].getText()=="○")
						) {redWins(8,16,24,32);}
				
				if(
						(buttons[16].getText()=="○") &&
						(buttons[24].getText()=="○") &&
						(buttons[32].getText()=="○")&&
						(buttons[40].getText()=="○")
						) {redWins(16,24,32,40);}

				//check\5
				if(
						(buttons[7].getText()=="○") &&
						(buttons[15].getText()=="○") &&
						(buttons[23].getText()=="○")&&
						(buttons[31].getText()=="○")
						) {redWins(7,15,23,31);}
				
				if(
						(buttons[15].getText()=="○") &&
						(buttons[23].getText()=="○") &&
						(buttons[31].getText()=="○")&&
						(buttons[39].getText()=="○")
						) {redWins(15,23,31,39);}
				//check\6
				if(
						(buttons[4].getText()=="○") &&
						(buttons[22].getText()=="○") &&
						(buttons[30].getText()=="○")&&
						(buttons[38].getText()=="○")
						) {redWins(4,22,30,38);}
				
				//check/1
				if(
						(buttons[3].getText()=="○") &&
						(buttons[9].getText()=="○") &&
						(buttons[15].getText()=="○")&&
						(buttons[21].getText()=="○")
						) {redWins(3,9,15,21);}
				
				//check/2
				if(
						(buttons[4].getText()=="○") &&
						(buttons[10].getText()=="○") &&
						(buttons[16].getText()=="○")&&
						(buttons[22].getText()=="○")
						) {redWins(4,10,16,22);}
				
				if(
						(buttons[10].getText()=="○") &&
						(buttons[16].getText()=="○") &&
						(buttons[22].getText()=="○")&&
						(buttons[28].getText()=="○")
						) {redWins(10,16,22,28);}
				
				//check/3
				if(
						(buttons[5].getText()=="○") &&
						(buttons[11].getText()=="○") &&
						(buttons[17].getText()=="○")&&
						(buttons[23].getText()=="○")
						) {redWins(5,11,17,23);}
				
				if(
						(buttons[11].getText()=="○") &&
						(buttons[17].getText()=="○") &&
						(buttons[23].getText()=="○")&&
						(buttons[29].getText()=="○")
						) {redWins(11,17,23,29);}
				
				if(
						(buttons[17].getText()=="○") &&
						(buttons[23].getText()=="○") &&
						(buttons[29].getText()=="○")&&
						(buttons[35].getText()=="○")
						) {redWins(17,23,29,35);}
				
				//check/4
				if(
						(buttons[6].getText()=="○") &&
						(buttons[12].getText()=="○") &&
						(buttons[18].getText()=="○")&&
						(buttons[24].getText()=="○")
						) {redWins(6,12,18,24);}
				
				if(
						(buttons[12].getText()=="○") &&
						(buttons[18].getText()=="○") &&
						(buttons[24].getText()=="○")&&
						(buttons[30].getText()=="○")
						) {redWins(12,18,24,30);}
				
				if(
						(buttons[18].getText()=="○") &&
						(buttons[24].getText()=="○") &&
						(buttons[30].getText()=="○")&&
						(buttons[36].getText()=="○")
						) {redWins(18,24,30,36);}

				//check/5
				if(
						(buttons[13].getText()=="○") &&
						(buttons[19].getText()=="○") &&
						(buttons[25].getText()=="○")&&
						(buttons[31].getText()=="○")
						) {redWins(13,19,25,31);}
				
				if(
						(buttons[19].getText()=="○") &&
						(buttons[25].getText()=="○") &&
						(buttons[31].getText()=="○")&&
						(buttons[37].getText()=="○")
						) {redWins(19,25,31,37);}
				//check/6
				if(
						(buttons[20].getText()=="○") &&
						(buttons[26].getText()=="○") &&
						(buttons[32].getText()=="○")&&
						(buttons[38].getText()=="○")
						) {redWins(20,26,32,38);}
				
				//orange
				//check\1
				if(
						(buttons[3].getText()=="●") &&
						(buttons[11].getText()=="●") &&
						(buttons[19].getText()=="●")&&
						(buttons[27].getText()=="●")
						) {orangeWins(3,11,19,27);}
				
				//check\2
				if(
						(buttons[2].getText()=="●") &&
						(buttons[10].getText()=="●") &&
						(buttons[18].getText()=="●")&&
						(buttons[26].getText()=="●")
						) {orangeWins(2,10,18,26);}
				
				if(
						(buttons[10].getText()=="●") &&
						(buttons[18].getText()=="●") &&
						(buttons[26].getText()=="●")&&
						(buttons[34].getText()=="●")
						) {orangeWins(10,18,26,34);}
				
				//check\3
				if(
						(buttons[1].getText()=="●") &&
						(buttons[9].getText()=="●") &&
						(buttons[17].getText()=="●")&&
						(buttons[25].getText()=="●")
						) {orangeWins(1,9,17,25);}
				
				if(
						(buttons[9].getText()=="●") &&
						(buttons[17].getText()=="●") &&
						(buttons[25].getText()=="●")&&
						(buttons[33].getText()=="●")
						) {orangeWins(9,17,25,33);}
				
				if(
						(buttons[17].getText()=="●") &&
						(buttons[25].getText()=="●") &&
						(buttons[33].getText()=="●")&&
						(buttons[41].getText()=="●")
						) {orangeWins(17,25,33,41);}
				
				//check\4
				if(
						(buttons[0].getText()=="●") &&
						(buttons[8].getText()=="●") &&
						(buttons[16].getText()=="●")&&
						(buttons[24].getText()=="●")
						) {orangeWins(0,8,16,24);}
				
				if(
						(buttons[8].getText()=="●") &&
						(buttons[16].getText()=="●") &&
						(buttons[24].getText()=="●")&&
						(buttons[32].getText()=="●")
						) {orangeWins(8,16,24,32);}
				
				if(
						(buttons[16].getText()=="●") &&
						(buttons[24].getText()=="●") &&
						(buttons[32].getText()=="●")&&
						(buttons[40].getText()=="●")
						) {orangeWins(16,24,32,40);}

				//check\5
				if(
						(buttons[7].getText()=="●") &&
						(buttons[15].getText()=="●") &&
						(buttons[23].getText()=="●")&&
						(buttons[31].getText()=="●")
						) {orangeWins(7,15,23,31);}
				
				if(
						(buttons[15].getText()=="●") &&
						(buttons[23].getText()=="●") &&
						(buttons[31].getText()=="●")&&
						(buttons[39].getText()=="●")
						) {orangeWins(15,23,31,39);}
				//check\6
				if(
						(buttons[4].getText()=="●") &&
						(buttons[22].getText()=="●") &&
						(buttons[30].getText()=="●")&&
						(buttons[38].getText()=="●")
						) {orangeWins(4,22,30,38);}
				
				//check/1
				if(
						(buttons[3].getText()=="●") &&
						(buttons[9].getText()=="●") &&
						(buttons[15].getText()=="●")&&
						(buttons[21].getText()=="●")
						) {orangeWins(3,9,15,21);}
				
				//check/2
				if(
						(buttons[4].getText()=="●") &&
						(buttons[10].getText()=="●") &&
						(buttons[16].getText()=="●")&&
						(buttons[22].getText()=="●")
						) {orangeWins(4,10,16,22);}
				
				if(
						(buttons[10].getText()=="●") &&
						(buttons[16].getText()=="●") &&
						(buttons[22].getText()=="●")&&
						(buttons[28].getText()=="●")
						) {orangeWins(10,16,22,28);}
				
				//check/3
				if(
						(buttons[5].getText()=="●") &&
						(buttons[11].getText()=="●") &&
						(buttons[17].getText()=="●")&&
						(buttons[23].getText()=="●")
						) {orangeWins(5,11,17,23);}
				
				if(
						(buttons[11].getText()=="●") &&
						(buttons[17].getText()=="●") &&
						(buttons[23].getText()=="●")&&
						(buttons[29].getText()=="●")
						) {orangeWins(11,17,23,29);}
				
				if(
						(buttons[17].getText()=="●") &&
						(buttons[23].getText()=="●") &&
						(buttons[29].getText()=="●")&&
						(buttons[35].getText()=="●")
						) {orangeWins(17,23,29,35);}
				
				//check/4
				if(
						(buttons[6].getText()=="●") &&
						(buttons[12].getText()=="●") &&
						(buttons[18].getText()=="●")&&
						(buttons[24].getText()=="●")
						) {orangeWins(6,12,18,24);}
				
				if(
						(buttons[12].getText()=="●") &&
						(buttons[18].getText()=="●") &&
						(buttons[24].getText()=="●")&&
						(buttons[30].getText()=="●")
						) {orangeWins(12,18,24,30);}
				
				if(
						(buttons[18].getText()=="●") &&
						(buttons[24].getText()=="●") &&
						(buttons[30].getText()=="●")&&
						(buttons[36].getText()=="●")
						) {orangeWins(18,24,30,36);}

				//check/5
				if(
						(buttons[13].getText()=="●") &&
						(buttons[19].getText()=="●") &&
						(buttons[25].getText()=="●")&&
						(buttons[31].getText()=="●")
						) {orangeWins(13,19,25,31);}
				
				if(
						(buttons[19].getText()=="●") &&
						(buttons[25].getText()=="●") &&
						(buttons[31].getText()=="●")&&
						(buttons[37].getText()=="●")
						) {orangeWins(19,25,31,37);}
				//check/6
				if(
						(buttons[20].getText()=="●") &&
						(buttons[26].getText()=="●") &&
						(buttons[32].getText()=="●")&&
						(buttons[38].getText()=="●")
						) {orangeWins(20,26,32,38);}
	}
	
	public void redWins(int a,int b,int c,int d) {
		buttons[a].setBackground(Color.GREEN);
		buttons[b].setBackground(Color.GREEN);
		buttons[c].setBackground(Color.GREEN);
		buttons[d].setBackground(Color.GREEN);
		
		for(int i=0;i<42;i++) {
			buttons[i].setEnabled(false);
		}
		textfield.setText("red wins");
	}
	
	
	public void orangeWins(int a,int b,int c, int d) {
		buttons[a].setBackground(Color.GREEN);
		buttons[b].setBackground(Color.GREEN);
		buttons[c].setBackground(Color.GREEN);
		buttons[d].setBackground(Color.GREEN);
		
		for(int i=0;i<42;i++) {
			buttons[i].setEnabled(false);
		}
		textfield.setText("orange wins");
	}
}