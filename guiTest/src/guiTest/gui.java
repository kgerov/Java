package guiTest;
import java.awt.*;
import java.awt.color.ColorSpace;
import java.awt.event.*;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.prefs.BackingStoreException;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler;

public class gui extends JFrame {

 private static JButton finalButton;
 private JComboBox comboBoxCategories;
 private JComboBox comboBoxDifficulty;
 private static Font font = new Font("Calibri", Font.BOLD, 25);
 private static Font fontTwo = new Font("Calibri", Font.BOLD, 35);
 private static Font fontHidden = new Font("Calibri", Font.BOLD, 70);
 private static JLabel wordPrint;
 private static JLabel picLabel;
 private static JLabel hintPrint;
 private static JLabel background;
 private static JPanel panelHeader;
 private static JPanel panelHang;
 private static JPanel panelKeyboard;
 private static JPanel panelWord;
 private static JPanel panelMenu;
 private static BufferedImage myPicture;
 private static JButton[] keyboard;
 private static String guessWord;
 private static String hiddenWord;
 private static String hint;
 private static String[] word;
 private static ImageIcon iconHangman;
 private static int lives;
 private static JFrame frame;
 
 public static BufferedImage getScrShot(Component component){
	 BufferedImage image = new BufferedImage(
	 component.getWidth(),
	 component.getHeight(),
	 BufferedImage.TYPE_INT_RGB
	 );
	 component.paint(image.getGraphics());
	 return image;
 }
 
 public static void disablePanels(){
	 for(Component currentComponent : panelWord.getComponents()){
		 currentComponent.setEnabled(false);
	 }
	 for(Component currentComponent : panelKeyboard.getComponents()){
		 currentComponent.setEnabled(false);
	 }
	 for(Component currentComponent : panelHeader.getComponents()){
		 currentComponent.setEnabled(false);
	 }
	 //background.setEnabled(false);
 }
 
 
 public gui(){
	 frame = this;
	 UIManager.put("ComboBox.background", new ColorUIResource(UIManager.getColor("TextField.background")));
	 UIManager.put("ComboBox.foreground", new ColorUIResource(UIManager.getColor("TextField.foreground")));
	 UIManager.put("ComboBox.selectionBackground", new ColorUIResource(Color.ORANGE));
	 UIManager.put("ComboBox.selectionForeground", new ColorUIResource(Color.WHITE));
	 
	 try {
		 background = new JLabel(new ImageIcon(ImageIO.read(new File("background.png"))));
		 this.setContentPane(background);
	} catch (IOException e) {
		e.printStackTrace();
	}
	 
	 //Handlers
	 handlerCategory handlerCategory = new handlerCategory();
	 handlerDifficulty handlerDiff = new handlerDifficulty();
	 handlerKeyboard handlerKey = new handlerKeyboard();
	 handlerStart handlerRestart = new handlerStart();
	 
	 
	 finalButton = new JButton("Restart");
	 //finalButton.setPreferredSize(new Dimension(, 150));
	 finalButton.addActionListener(handlerRestart);
	 
	 //Paths
	 String pathButton = "button.png";
	 
	 //Drop-down menus
	 String[] categories = {"Famous People", "Countries", "Companies", "Animals", "Food"};
	 String[] difficulty = {"Easy", "Medium", "Hard"};
	 
	 //Adding panels
	 panelHeader = managePanels(3, 1, 10, 10);
	 add(panelHeader);
	 
	 panelHang = managePanels(1, 1, 1, 1);
	 add(panelHang);
	 
	 panelWord = new JPanel(new FlowLayout(FlowLayout.LEFT));
	 panelWord.setOpaque(false);
	 add(panelWord);
	 
	 panelKeyboard = managePanels(3, 9, 10, 10);
	 add(panelKeyboard);
	 
	 ImageIcon imageForButton = new ImageIcon(pathButton);

	 myPicture = getPicture(0);
	 JLabel labelCategories = new JLabel();
	 labelCategories.setText("Select category: ");
	 panelHeader.add(labelCategories).setFont(font);
	 
	 comboBoxCategories = new JComboBox(categories);
	 comboBoxCategories.addActionListener(handlerCategory); 
	 panelHeader.add(comboBoxCategories).setFont(font);
	 
	 JLabel labelDifficulty = new JLabel();
	 labelDifficulty.setText("Select difficulty: ");
	 panelHeader.add(labelDifficulty).setFont(font);
	 
	 comboBoxDifficulty = new JComboBox(difficulty);
	 comboBoxDifficulty.addActionListener(handlerDiff);
	 panelHeader.add(comboBoxDifficulty).setFont(font);
	 
	 hintPrint = new JLabel("");
	 panelHeader.add(hintPrint).setFont(font);
	 
	 iconHangman = new ImageIcon(myPicture);
	 picLabel = new JLabel();
	 picLabel.setIcon(iconHangman);
	 panelHang.add(picLabel);
	 
	 wordPrint = new JLabel("");
	 panelWord.add(wordPrint).setFont(fontHidden);
	 
	 keyboard = new JButton[27];
	 for (int i = 0; i < 26; i++) {
		 char currentChar = (char)('a' + i);
		 String currentCharStr = Character.toString(currentChar).toUpperCase();
		 keyboard[i] = new JButton(currentCharStr, imageForButton); 
		 keyboard[i].addActionListener(handlerKey);
		 keyboard[i].setPreferredSize(new Dimension(70, 50));
		 keyboard[i].setHorizontalTextPosition(JButton.CENTER);
		 keyboard[i].setVerticalTextPosition(JButton.CENTER);
		 keyboard[i].setForeground(Color.WHITE);
		 panelKeyboard.add(keyboard[i]).setFont(font);
	}
 }
 
 public class handlerCategory implements ActionListener{
	 
	 public void actionPerformed(ActionEvent event){
		 word = new String[2];
		 String categoryStr = (String)comboBoxCategories.getSelectedItem();
		 switch (categoryStr) {
			case "Famous People":{ 
				word = HangmanGame.getWords(1);
				comboBoxCategories.setEnabled(false);
				break;
			}
			case "Companies":{
				word = HangmanGame.getWords(2);
				comboBoxCategories.setEnabled(false);
			}
				break;
			case "Animals":{ 
				word = HangmanGame.getWords(3);
			    comboBoxCategories.setEnabled(false);
				break;
			}
			case "Countries":{ 
				word = HangmanGame.getWords(4);
			    comboBoxCategories.setEnabled(false);
				break;
			}
			case "Food":{ 
				word = HangmanGame.getWords(5);
			    comboBoxCategories.setEnabled(false);
				break;
			}
			default:
				break;
		}
		 guessWord = word[0];
		 hint = word[1];
		 hiddenWord = HangmanGame.createHiddenWord(guessWord);
		 if((!comboBoxCategories.isEnabled()) && (!comboBoxDifficulty.isEnabled())){
			 myPicture = getPicture(lives);
			 iconHangman = new ImageIcon(myPicture);
			 iconHangman.getImage().flush();
			 picLabel.setIcon(iconHangman);
			 wordPrint.setText(hiddenWord);
			 hintPrint.setText(hint);
		
		 }
	 }
 }
 
 public static JPanel managePanels(int a, int b, int c, int d){
	 JPanel currentJPanel = new JPanel();
	 currentJPanel.setLayout(new GridLayout(a, b, c, d));
	 currentJPanel.setOpaque(false);
	 return currentJPanel;
 }
 
 public static BufferedImage getPicture(int lives){
	 String path = "hangman" + lives + ".png";
	 BufferedImage currentImage = null;
	 try {
		currentImage = ImageIO.read(new File(path));
	 } catch (IOException e) {
		e.printStackTrace();
	 }
	 return currentImage;
 }
 
 public class handlerDifficulty implements ActionListener{
	 
	 public void actionPerformed(ActionEvent event){
		 word = new String[2];
		 String difficultyStr = (String)comboBoxDifficulty.getSelectedItem();
		 switch (difficultyStr) {
			case "Easy":{
				lives = 1;
				hintPrint.setText("Hint: " + hint);
			    comboBoxDifficulty.setEnabled(false);
				break;
			}
			case "Medium":{ 
				lives = 3;
				hintPrint.setText("Hint: " + hint);
				comboBoxDifficulty.setEnabled(false);
				break;
			}
			case "Hard":{
				lives = 5;
				hintPrint.setText("Hint: None (Hard)");
				comboBoxDifficulty.setEnabled(false);
				break;	
			}
			default:
				break;
		}
		 if((!comboBoxCategories.isEnabled()) && (!comboBoxDifficulty.isEnabled())){
			 wordPrint.setText(hiddenWord);
			 myPicture = getPicture(lives);
			 iconHangman = new ImageIcon(myPicture);
			 iconHangman.getImage().flush();
			 picLabel.setIcon(iconHangman);
		
		 }
	 }
 }
 
 public static void checkGame(String hiddenWord, int lives){
	 if(!HangmanGame.checkChar('\u2014', hiddenWord)){
		 //Wins
		 disablePanels();
		 try {
			myPicture = ImageIO.read(new File("win.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		 iconHangman = new ImageIcon(myPicture);
		 iconHangman.getImage().flush();
		 picLabel.setIcon(iconHangman);
		 
		 panelHeader.removeAll();
		 frame.remove(panelHeader);
		 panelHeader = managePanels(1, 1, 10, 10);
		 frame.add(panelHeader);
		 finalButton.setHorizontalTextPosition(JButton.CENTER);
		 finalButton.setVerticalTextPosition(JButton.CENTER);
		 finalButton.setForeground(Color.WHITE);
		 finalButton.setPreferredSize(new Dimension(200, 100));
		 finalButton.setBackground(Color.BLACK);
		 panelHeader.add(finalButton);
	 }
	 else if(lives > 10){
		 //Lose
		 disablePanels();
		 try {
			myPicture = ImageIO.read(new File("lose.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		 iconHangman = new ImageIcon(myPicture);
		 iconHangman.getImage().flush();
		 picLabel.setIcon(iconHangman);
		 wordPrint.setText(guessWord);
		 panelHeader.removeAll();
		 frame.remove(panelHeader);
		 panelHeader = managePanels(1, 1, 10, 10);
		 frame.add(panelHeader);
		 finalButton.setHorizontalTextPosition(JButton.CENTER);
		 finalButton.setVerticalTextPosition(JButton.CENTER);
		 finalButton.setForeground(Color.WHITE);
		 finalButton.setPreferredSize(new Dimension(200, 100));
		 finalButton.setBackground(Color.BLACK);
		 panelHeader.add(finalButton);
	 }
	 else{
		 //GAME CONTINUES 
	 }
 }
 
 public class handlerKeyboard implements ActionListener{
	 
	 public void actionPerformed(ActionEvent event){
		 JButton clickedButton = (JButton)event.getSource();
		 char clickedChar = clickedButton.getText().charAt(0);
		 myPicture = getPicture(lives);
		 iconHangman = new ImageIcon(myPicture);
		 iconHangman.getImage().flush();
		 picLabel.setIcon(iconHangman);
		 if (HangmanGame.checkChar(clickedChar, guessWord)){
			 hiddenWord = HangmanGame.updateHiddenWord(clickedChar, hiddenWord, guessWord);
		 }
		 else{
			 lives++;
		 }
		 if((!comboBoxCategories.isEnabled()) && (!comboBoxDifficulty.isEnabled())){
			 wordPrint.setText(hiddenWord);
			 clickedButton.setEnabled(false);
			 checkGame(hiddenWord, lives);
		 }
	 }
 } 
 
public class handlerStart implements ActionListener{
	 
	 public void actionPerformed(ActionEvent event){
		 JButton clickedButton = (JButton)event.getSource();
		 String restart = clickedButton.getText();
		 if (restart == "Restart"){
			 frame.dispose();
			 startGame();
		 }
	 }
 }
 public static BufferedImage convertToGray(BufferedImage src){
	 ColorConvertOp grayOp = new ColorConvertOp(ColorSpace.getInstance(ColorSpace.CS_GRAY), null);
	 return grayOp.filter(src, null);
 }
 public static void main(String[] args){
	 startGame();
 }

private static void startGame() {
	gui bucky = new gui();
	 bucky.setSize(720, 1000);
	 bucky.setLayout(new FlowLayout(FlowLayout.CENTER));
	 bucky.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 bucky.setResizable(false);
	 bucky.setVisible(true);
}
}