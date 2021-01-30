import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Slotmachine extends JFrame{
	
	public static void main(String[] args) {
		// Maak een frame
		JFrame frame = new Slotmachine();
		frame.setSize(1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new Panel();
		frame.setContentPane(panel);
		frame.setTitle("Slotmachine");
		frame.setVisible(true);
	}
}

	class Panel extends JPanel {
		
		JPanel pane = new JPanel(new GridLayout(1, 5));
	
		Spinner spinner1, spinner2, spinner3, spinner4;
		
		// JTextArea slotField1, slotField2, slotField3, slotField4;
		// JTextArea priceField, creditsField, betField, checkField;
		
		JTextPane slotField1, slotField2, slotField3, slotField4;
		JTextPane priceField, creditsField, betField, checkField;
		
		JButton slotButton1, slotButton2, slotButton3, slotButton4; 
		JButton holdButton, spinButton, collectButton, restartButton;
		JButton raiseBetButton, lowerBetButton;
		
		JLabel priceLabel, creditsLabel, currentBetLabel;
		
		private int totalCoins = 100;
		private int betCoins = 10;
		private int priceMoney = 0;
		
		public Panel() {
			
			setLayout(null);
	        spinner1 = new Spinner();
	        spinner2 = new Spinner();
	        spinner3 = new Spinner();
	        spinner4 = new Spinner();
			
			// .setBounds(x, y, width, height);
			// x = horizontal
			// y = vertical 
	        
	        //slotField1 = new JTextPane(spinner1.getSpinNumber());
			slotField1 = new JTextPane();
			slotField1.setBounds(50, 20, 80, 100);
			add(slotField1);
			
			/*slotField11 = new JTextPane();
			slotField11.setBounds(50, 250, 80, 100);
			add(slotField11);
			*/			
			
			slotField2 = new JTextPane();
			slotField2.setBounds(150, 20, 80, 100);
			add(slotField2);
			
			slotField3 = new JTextPane();
			slotField3.setBounds(250, 20, 80, 100);
			add(slotField3);
			
			slotField4 = new JTextPane();
			slotField4.setBounds(350, 20, 80, 100);
			add(slotField4);
			
			priceField = new JTextPane();
			priceField.setBounds(650, 90, 80, 30);
			add(priceField);
			priceField.setText(String.valueOf(priceMoney));
			
			creditsField = new JTextPane();
			creditsField.setBounds(750, 90, 90, 30);
			add(creditsField);
			creditsField.setText(String.valueOf(totalCoins));
			
			betField = new JTextPane();
			betField.setBounds(500, 90, 90, 30);
			add(betField);
			betField.setText(String.valueOf(betCoins));
			
			checkField = new JTextPane();
			checkField.setBounds(500, 20, 150, 30);
			add(checkField);
			checkField.setText("Welcome!");
			
			// BUTTONS
			
			slotButton1 = new JButton("HOLD");
			KnopSlotButton1 aButton = new KnopSlotButton1();
			slotButton1.addActionListener(aButton);
			add(slotButton1);
			slotButton1.setBounds(50, 140, 80, 30);
			
			slotButton2 = new JButton("HOLD");
			KnopSlotButton2 bButton = new KnopSlotButton2();
			slotButton2.addActionListener(bButton);
			add(slotButton2);
			slotButton2.setBounds(150, 140, 80, 30);
			
			slotButton3 = new JButton("HOLD");
			KnopSlotButton3 cButton = new KnopSlotButton3();
			slotButton3.addActionListener(cButton);
			add(slotButton3);
			slotButton3.setBounds(250, 140, 80, 30);
			
			slotButton4 = new JButton("HOLD");
			KnopSlotButton4 dButton = new KnopSlotButton4();
			slotButton4.addActionListener(dButton);
			add(slotButton4);
			slotButton4.setBounds(350, 140, 80, 30);
			
			spinButton = new JButton("SPIN");
			KnopSpinButton eButton = new KnopSpinButton();
			spinButton.addActionListener(eButton);
			add(spinButton);
			spinButton.setBounds(650, 140, 80, 30);
			
			collectButton = new JButton("COLLECT");
			KnopCollectButton fButton = new KnopCollectButton();
			collectButton.addActionListener(fButton);
			add(collectButton);
			collectButton.setBounds(750, 140, 90, 30);
			collectButton.setEnabled(false);
			
			restartButton = new JButton("RESTART");
			KnopRestartButton gButton = new KnopRestartButton();
			restartButton.addActionListener(gButton);
			add(restartButton);
			restartButton.setBounds(750, 180, 90, 30);
			restartButton.setEnabled(false);
			
			raiseBetButton = new JButton("RAISE");
			KnopRaiseBetButton hButton = new KnopRaiseBetButton();
			raiseBetButton.addActionListener(hButton);
			add(raiseBetButton);
			raiseBetButton.setBounds(500, 140, 90, 30);
			
			lowerBetButton = new JButton("LOWER");
			KnopLowerBetButton iButton = new KnopLowerBetButton();
			lowerBetButton.addActionListener(iButton);
			add(lowerBetButton);
			lowerBetButton.setBounds(500, 170, 90, 30);
			
			// TEXT
			
			priceLabel = new JLabel("Price");  
			priceLabel.setBounds(650, 60, 30, 30);
			
			creditsLabel = new JLabel("Credits"); 
			creditsLabel.setBounds(750, 60, 50, 30);
			
			currentBetLabel = new JLabel("Current bet");
			currentBetLabel.setBounds(500, 60, 70, 30);
			
			add(priceLabel);
			add(creditsLabel);
			add(currentBetLabel);
		}
		
		class KnopSlotButton1 implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				spinner1.setStatus(true); 
				slotButton1.setText("HELD");
				slotButton1.setBorder(new LineBorder (Color.red));
			}
		}
		
		class KnopSlotButton2 implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				spinner2.setStatus(true); 
				slotButton2.setText("HELD");
				slotButton2.setBorder(new LineBorder (Color.red));
			}
		}
		
		class KnopSlotButton3 implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				spinner3.setStatus(true); 
				slotButton3.setText("HELD");
				slotButton3.setBorder(new LineBorder (Color.red));
			}
		}
		
		class KnopSlotButton4 implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				spinner4.setStatus(true); 
				slotButton4.setText("HELD");
				slotButton4.setBorder(new LineBorder (Color.red));
			}
		}
		
		class KnopSpinButton implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				
				if(spinner1.getStatus() == false) {
					spinner1.makeRol();
					slotField1.setText(spinner1.getSymbolPrint());
				}	
				
				if(spinner2.getStatus() == false) {
					spinner2.makeRol();
					slotField2.setText(spinner2.getSymbolPrint());
				}
				
				if(spinner3.getStatus() == false) {
					spinner3.makeRol();
					slotField3.setText(spinner3.getSymbolPrint());
				}
				
				if(spinner4.getStatus() == false) {
					spinner4.makeRol();
					slotField4.setText(spinner4.getSymbolPrint());
				}
				
				totalCoins -= betCoins;
				creditsField.setText(String.valueOf(totalCoins));
				
				slotButton1.setEnabled(true);
				slotButton2.setEnabled(true);
				slotButton3.setEnabled(true);
				slotButton4.setEnabled(true);
				
				checkField.setText("No win yet.");
				
				winCheck();
				
				if(totalCoins <= 0) {
					if(priceMoney == 0) {
						spinButton.setEnabled(false);
						checkField.setText("GAME OVER");
						restartButton.setEnabled(true);
						repaint();
					}
				}
			}
		}
		
		class KnopCollectButton implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				totalCoins += priceMoney;
				creditsField.setText(String.valueOf(totalCoins));
				priceMoney = 0;
				priceField.setText(String.valueOf(priceMoney));
				spinButton.setEnabled(true);
				checkField.setText("Spin again!");
				collectButton.setEnabled(false);
			}
		}
		
		class KnopRestartButton implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				slotField1.setText("");
				slotField2.setText("");
				slotField3.setText("");
				slotField4.setText("");
				checkField.setText("Spin again!");
				
				spinButton.setEnabled(true);
				restartButton.setEnabled(false);
				
				totalCoins = 100;
				betCoins = 10;
				priceMoney = 0;
				
				creditsField.setText(String.valueOf(totalCoins));
				betField.setText(String.valueOf(betCoins));
				priceField.setText(String.valueOf(priceMoney));
				
				spinner1.setStatus(false); 
				slotButton1.setText("HOLD");
				slotButton1.setBorder(new LineBorder (Color.gray));
				spinButton.setEnabled(true);
				
				spinner2.setStatus(false); 
				slotButton2.setText("HOLD");
				slotButton2.setBorder(new LineBorder (Color.gray));
				spinButton.setEnabled(true);
				
				spinner3.setStatus(false); 
				slotButton3.setText("HOLD");
				slotButton3.setBorder(new LineBorder (Color.gray));
				spinButton.setEnabled(true);
				
				spinner4.setStatus(false); 
				slotButton4.setText("HOLD");
				slotButton4.setBorder(new LineBorder (Color.gray));
				spinButton.setEnabled(true);
			}
		}
		
		class KnopRaiseBetButton implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				betCoins = Math.min(betCoins + 10, totalCoins);
				betField.setText(String.valueOf(betCoins));
			}
		}
		
		class KnopLowerBetButton implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				betCoins = Math.max(betCoins - 10, 10);
				betField.setText(String.valueOf(betCoins));
			}
		}
		
		public void winCheck() {
			if(spinner1.getSpinNumber() == spinner2.getSpinNumber() && spinner2.getSpinNumber() == spinner3.getSpinNumber()) {
				checkField.setText("You won!");
				priceMoney = betCoins * 2;
				priceField.setText(String.valueOf(priceMoney));
				spinButton.setEnabled(false);
				
				spinner1.setStatus(false); 
				slotButton1.setText("HOLD");
				slotButton1.setBorder(new LineBorder (Color.gray));
				slotButton1.setEnabled(false);
				
				spinner2.setStatus(false); 
				slotButton2.setText("HOLD");
				slotButton2.setBorder(new LineBorder (Color.gray));
				slotButton2.setEnabled(false);
				
				spinner3.setStatus(false); 
				slotButton3.setText("HOLD");
				slotButton3.setBorder(new LineBorder (Color.gray));
				slotButton3.setEnabled(false);
				
				spinner4.setStatus(false); 
				slotButton4.setText("HOLD");
				slotButton4.setBorder(new LineBorder (Color.gray));
				slotButton4.setEnabled(false);
				
				collectButton.setEnabled(true);
			}
			
			if(spinner2.getSpinNumber() == spinner3.getSpinNumber() && spinner3.getSpinNumber() == spinner4.getSpinNumber()) {
				checkField.setText("You won!");
				priceMoney = betCoins * 2;
				priceField.setText(String.valueOf(priceMoney));
				spinButton.setEnabled(false);
				
				spinner1.setStatus(false); 
				slotButton1.setText("HOLD");
				slotButton1.setBorder(new LineBorder (Color.gray));
				slotButton1.setEnabled(false);
				
				spinner2.setStatus(false); 
				slotButton2.setText("HOLD");
				slotButton2.setBorder(new LineBorder (Color.gray));
				slotButton2.setEnabled(false);
				
				spinner3.setStatus(false); 
				slotButton3.setText("HOLD");
				slotButton3.setBorder(new LineBorder (Color.gray));
				slotButton3.setEnabled(false);
				
				spinner4.setStatus(false); 
				slotButton4.setText("HOLD");
				slotButton4.setBorder(new LineBorder (Color.gray));
				slotButton4.setEnabled(false);
				
				collectButton.setEnabled(true);
			}
			
			if(spinner1.getSpinNumber() == spinner2.getSpinNumber() && spinner2.getSpinNumber() == spinner3.getSpinNumber() && spinner3.getSpinNumber() == spinner4.getSpinNumber()) {
				checkField.setText("YOU GOT THE BIG PRICE!");
				priceMoney = betCoins * 4;
				priceField.setText(String.valueOf(priceMoney));
				spinButton.setEnabled(false);
				
				spinner1.setStatus(false); 
				slotButton1.setText("HOLD");
				slotButton1.setBorder(new LineBorder (Color.gray));
				slotButton1.setEnabled(false);
				
				spinner2.setStatus(false); 
				slotButton2.setText("HOLD");
				slotButton2.setBorder(new LineBorder (Color.gray));
				slotButton2.setEnabled(false);
				
				spinner3.setStatus(false); 
				slotButton3.setText("HOLD");
				slotButton3.setBorder(new LineBorder (Color.gray));
				slotButton3.setEnabled(false);
				
				spinner4.setStatus(false); 
				slotButton4.setText("HOLD");
				slotButton4.setBorder(new LineBorder (Color.gray));
				slotButton4.setEnabled(false);
				
				collectButton.setEnabled(true);
			}
		}
		
		/* HOLD on/off button
		if(spinner1.getStatus() == true) {
			spinner1.setStatus(false);
			slotButton1.setText("HOLD");
			slotButton1.setBorder(new LineBorder (Color.blue));
		}
		
		else {
		 * 
				spinner1.setStatus(true); 
				slotButton1.setText("HELD");
				slotButton1.setBorder(new LineBorder (Color.red));
		}
		*/
		
		
}

