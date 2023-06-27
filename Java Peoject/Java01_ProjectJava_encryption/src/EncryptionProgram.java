import java.util.*;
public class EncryptionProgram {
	
	private Scanner scanner;
	private Random random;
	private ArrayList<Character> list;
	private ArrayList<Character> shuffledList;
	private char character;
	private String line;
	private char[] letters;
	private char[] secretLetters;
	
	
	EncryptionProgram(){
	scanner= new Scanner(System.in);
	random= new Random();
	list= new ArrayList();
	shuffledList = new ArrayList();
	character=' ';

	newkey();
	askQuestion();
	}
	
	private void askQuestion(){
		while(true) {
			System.out.println("***************************************************************************");
			System.out.println("what do you wnat to do?");
			System.out.println("(N) for new Key/(G) for get Key/(E) for Encrypt/(D) for decrypt/(Q)for quit");
			char response = Character.toUpperCase(scanner.nextLine().charAt(0));
			
			switch(response) {
			case'N':
				newkey();
				break;
				
			case'G':
				getkey();
				break;
				
			case'E':
				encrypt();
				break;
				
			case'D':
				decrypt();
				break;
				
			case'Q':
				quit();
				break;
				
			default:
				System.out.println("Not correct");
			}
		}
	}
	
	private void newkey(){
		
	}
	
	private void getkey(){
		
	}
	
	private void encrypt(){
		
	}
	
	private void decrypt(){
		
	}
	
	private void quit(){
		
	}
}
