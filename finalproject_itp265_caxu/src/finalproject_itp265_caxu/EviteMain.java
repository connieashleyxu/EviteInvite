package finalproject_itp265_caxu;

//import java.util.List;
//import java.util.Map;

/**
 * evite main program
 *
 * @author Connie Xu
 * @version Apr 28, 2021
 * ITP 265, Spring 2021, Coffee Section
 * Email: caxu@usc.edu
 * Final Project
 *
 */
public class EviteMain {
	//init vars
	private BFF bff = new BFF();
	private String filename;
	private boolean finished;
	private int userChoice;
	private Premium premium;
	private User user;
	//private Party party;
	
	//private Map<PartyType, List<Party>> partyMap;

	public void run() {
		BFF bff = new BFF();
		setFilename("");
		
		System.out.println("Hello! Welcome to Evite. Please login.");
		int login = bff.inputInt("Are you a (1) Free Account or (2) Premium Login", 1, 2);
		
		if(login == 1) {
			setFilename("free.txt");
		}
		else {
			setFilename("premium.txt");
		}
		
		/*
		readFile(filename,login);
		readPartyFile("party.txt");
		*/
		if(login == 2) {
			setFinished(false);
			while(!finished) {
				displayMenu(login);
				userChoice = bff.inputInt("Choose an option:", 0, 4);
				
				switch(userChoice) {
					case 0:
						checkStatus(login);
						break;
					case 1:
						premium.makeParty();
						// writeToPartyFile("party.txt");
						break;
					case 2:
						premium.editParty();
						// writeToPartyFile("party.txt");
						break;
					case 3:
						RSVPParty();
						break;
					case 4:
						System.out.println("Goodbye!");
						finished = true;
						break;
				}	
			}
		}
		else {
			finished = false;
			while(!finished) {
				displayMenu(login);
				userChoice = bff.inputInt("Choose an option:", 0, 2);
				
				switch(userChoice) {
					case 0:
						checkStatus(login);
						break;
					case 1:
						RSVPParty();
						break;
					case 2:
						System.out.println("Goodbye!");
						finished = true;
						break;
				}
			}
		}
	}
	
	public void displayMenu(int login) {
		if (login == 1) {
			System.out.println("Welcome new user!");
		}
		else if (login == 2) {
			System.out.println("Welcome back!");
		}
	}

	public void checkStatus (int login) {
		if(premium.getIsPremium() == true) {
			System.out.println("You are a premium member.");
		}
		else {
			System.out.println("You are not a premium member.");
		}
		
	}
	
	public void RSVPParty() {
		user.isGoing = bff.inputYesNo("Will you being going to the party?");
	}
	
	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public boolean isFinished() {
		return finished;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}
	
	public int getUserChoice() {
		return userChoice;
	}

	public void setUserChoise(int userChoice) {
		this.userChoice = userChoice;
	}

	public Premium getPremium() {
		return premium;
	}

	public void setPremium(Premium premium) {
		this.premium = premium;
	}
}
