import java.util.*;

public class EncryptionProgram {

	private Scanner scanner;
	private Random random;
	private ArrayList<Character> list;
	private ArrayList<Character> shuffledList;
	private ArrayList<Character> DefaultList;
	private char character;
	private String line;
	private char[] letters;
	
	EncryptionProgram(){
		scanner = new Scanner(System.in);
		random = new Random();
		list = new ArrayList();
		shuffledList = new ArrayList();
		DefaultList =new ArrayList<>(Arrays.asList('P','b','d','O','N','K','x','t','.','"','m','8','@','|','$','&','v','L','h','y','e','p','0','I','F','l','_','q','D','0','X','c','g','T','0','{','3','6','s',')','7','Z','n','2','B',';','!','}','A',' ','j','4','Q','k','V','i','*','G','u','+','Y','[','9','^',']','%','R','f','U','5','w',',','=','/','W','M','o','>','H','`','<','(','-','z','~','C','a',':','S','J','r','1','#','E','?'));
		character = ' ';
	//	newKey();
		askQuestion();
	}
	private void askQuestion(){
		while(true) {
			System.out.println("********************************************");
			System.out.println("\t\tHOW CAN I HELP?\n");
			
			System.out.println("(N)Get NewKey");
			System.out.println("(G)Get Key\t\t(H)Get DefaultKey");
			System.out.println("(E)Encrypt\t\t(I)Default Encrypt");
			System.out.println("(D)Decrypt\t\t(J)Default Decrypt");
			System.out.println("(Q)Quit");
			System.out.println("********************************************");
			
			char response = Character.toUpperCase(scanner.nextLine().charAt(0));
			
			switch(response) {
			case 'N':
				newKey();
				break;
			case 'G':
				getKey();
				break;
			case 'H':
				getDefaultKey();
				break;
			case 'E':
				encrypt();
				break;
			case 'I':
				DefaultE();
				break;
				
			case 'D':
				decrypt();
				break;
				
			case 'J':
				DefaultD();
				break;
				
			case 'Q':
				quit();
				break;
			default:
				System.out.println("Not a valid answer :(");
			}
		}
	}
	private void newKey(){
		
		character = ' ';
		list.clear();
		shuffledList.clear();
		for(int i=32;i<127;i++) {
			list.add(Character.valueOf(character));
			character++;
		}
		
		shuffledList = new ArrayList(list);
		Collections.shuffle(shuffledList);
		
		
		System.out.println("*A new key has been generated*");
		
	}
	private void getKey(){
		System.out.println("Key: ");
		for(Character x : list) {
			System.out.print(x);
		}
		System.out.println();
		for(Character x : shuffledList) {
			System.out.print(x);
		}
		System.out.println();
	}
	
	private void getDefaultKey(){
		System.out.println("Key: ");
		for(Character x : list) {
			System.out.print(x);
		}
		System.out.println();
		for(Character x : DefaultList) {
			System.out.print(x);
		}
		System.out.println();
	}
	
	private void encrypt(){
		System.out.println("Enter a message to be encrypted: ");
		String message = scanner.nextLine();
		
		letters = message.toCharArray();
		
		for(int i =0;i<letters.length;i++) {
			
			for(int j =0;j<list.size();j++) {
				if(letters[i]==list.get(j)) {
					letters[i]=shuffledList.get(j);
					break;
				}
			}
		}
		System.out.println("Encrypted: ");
		for(char x : letters) {
			System.out.print(x);
		}
		System.out.println();
	}
	
	private void DefaultE(){
		System.out.println("Enter a message to be encrypted: ");
		String message = scanner.nextLine();
		
		letters = message.toCharArray();
		
		for(int i =0;i<letters.length;i++) {
			
			for(int j =0;j<list.size();j++) {
				if(letters[i]==list.get(j)) {
					letters[i]=DefaultList.get(j);
					break;
				}
			}
		}
		System.out.println("Encrypted: ");
		for(char x : letters) {
			System.out.print(x);
		}
		System.out.println();
	}
	
	private void decrypt(){
		System.out.println("Enter a message to be decrypted: ");
		String message = scanner.nextLine();
		
		letters = message.toCharArray();
		
		for(int i =0;i<letters.length;i++) {
			
			for(int j =0;j<shuffledList.size();j++) {
				if(letters[i]==shuffledList.get(j)) {
					letters[i]=list.get(j);
					break;
				}
			}
		}
		System.out.println("Decrypted: ");
		for(char x : letters) {
			System.out.print(x);
		}
		System.out.println();
	}
	
	private void DefaultD(){
		System.out.println("Enter a message to be decrypted: ");
		String message = scanner.nextLine();
		
		letters = message.toCharArray();
		
		for(int i =0;i<letters.length;i++) {
			
			for(int j =0;j<DefaultList.size();j++) {
				if(letters[i]==DefaultList.get(j)) {
					letters[i]=list.get(j);
					break;
				}
			}
		}
		System.out.println("Decrypted: ");
		for(char x : letters) {
			System.out.print(x);
		}
		System.out.println();
	}
	private void quit(){
		System.out.println("Thank you, have a nice day bro!");
		System.exit(0);
	}
}