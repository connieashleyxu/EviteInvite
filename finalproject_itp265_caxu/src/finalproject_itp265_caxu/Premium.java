package finalproject_itp265_caxu;

import java.util.ArrayList;

/**
 * premium user
 *
 * @author Connie Xu
 * @version Apr 28, 2021
 * ITP 265, Spring 2021, Coffee Section
 * Email: caxu@usc.edu
 * Homework xx
 *
 */
public class Premium extends User{

	//init var
	private ArrayList<String> invites;
	private boolean isPremium;
	private BFF bff;
	
	public Premium(String name, String email, String password, boolean isGoing, boolean isPremium) {
		super(name, email, password, isGoing);
		this.invites = new ArrayList<String>();
		this.isPremium = isPremium;
		
		this.bff = new BFF();
	}
	
	/**
	 * @return invites
	*/
	@Override
	public ArrayList<String> getInvites() {
		return invites;
	}
	
	/**
	 * @return isPremium
	*/
	public boolean getIsPremium() {
		return isPremium;
	}
	
	public Party makeParty() {
		//String name, String location, int invited, String time
		String partyName = bff.inputLine("What is the name of your party?");
		String partyLocation = bff.inputLine("Where is your party located?");
		int partyInvited = bff.inputInt("How many guests will be invited?");
		String partyTime = bff.inputLine("When is your party happening? (XX/XX/XX)");
		String partyTypes = bff.inputWord("Which describes your party theme: BLOCK, DINNER, GRADUATION, PROM. (case sensitive)");
		System.out.println("Completing party making process...");
		this.invites.add(getName());
		
		Party party = null;
		
		if (partyTypes.equalsIgnoreCase("BLOCK")) {
			String partyBlock = bff.inputLine("Enter block party neighborhood.");
			//String name, String location, int invited, String time, String block, boolean gift, Theme them
			party = new Block(partyName, partyLocation, partyInvited, partyTime, partyBlock, PartyType.valueOf(partyTypes));
		}
		else if (partyTypes.equalsIgnoreCase("DINNER")) {
			String partyDinner = bff.inputLine("Enter dinner party food theme.");
			//String name, String location,  int invited, String time, String foodTheme, boolean food, Theme theme
			party = new Dinner(partyName, partyLocation, partyInvited, partyTime, partyDinner, PartyType.valueOf(partyTypes));
		}
		else if (partyTypes.equalsIgnoreCase("GRADUATION")) {
			String partyGraduate = bff.inputLine("Enter graduate name.");
			//String name, String location, int invited, String time, String graduate, Theme theme
			party = new Graduation(partyName, partyLocation, partyInvited, partyTime, partyGraduate, PartyType.valueOf(partyTypes));
		}
		else if (partyTypes.equalsIgnoreCase("PROM")) {
			String partyMask = bff.inputLine("Enter mask type.");
			String partyTheme = bff.inputLine("Input Prom theme. (CARNIVAL, STARRYNIGHT, UNDERTHESEA, THROWBACKS, WINTERBALL, MEDIEVAL, ENCHANTEDFOREST)");
			//String name, String location, int invited, String time, String mask, Theme theme, PartyType partyType
			party = new Prom(partyName, partyLocation, partyInvited, partyTime, partyMask, Theme.valueOf(partyTheme), PartyType.valueOf(partyTypes));
		}
		else {
			System.out.println("Please input a valid party type.");
		}
		
		return party;
	}

	public Party editParty() {
		//String name, String location, int invited, String time
				String partyName = bff.inputLine("What is the name of your party?");
				String partyLocation = bff.inputLine("Where is your party located?");
				int partyInvited = bff.inputInt("How many guests will be invited?");
				String partyTime = bff.inputLine("When is your party happening? (XX/XX/XX)");
				String partyTypes = bff.inputWord("Which describes your party theme: BLOCK, DINNER, GRADUATION, PROM. (case sensitive)");
				System.out.println("Completing party making process...");
				System.out.println(getName());
				this.invites.add(getName());
				
				Party party = null;
				
				if (partyTypes.equalsIgnoreCase("BLOCK")) {
					String partyBlock = bff.inputLine("Enter block party neighborhood.");
					//String name, String location, int invited, String time, String block, boolean gift, Theme them
					party = new Block(partyName, partyLocation, partyInvited, partyTime, partyBlock, PartyType.valueOf(partyTypes));
				}
				else if (partyTypes.equalsIgnoreCase("DINNER")) {
					String partyDinner = bff.inputLine("Enter dinner party food theme.");
					//String name, String location,  int invited, String time, String foodTheme, boolean food, Theme theme
					party = new Dinner(partyName, partyLocation, partyInvited, partyTime, partyDinner, PartyType.valueOf(partyTypes));
				}
				else if (partyTypes.equalsIgnoreCase("GRADUATION")) {
					String partyGraduate = bff.inputLine("Enter graduate name.");
					//String name, String location, int invited, String time, String graduate, Theme theme
					party = new Graduation(partyName, partyLocation, partyInvited, partyTime, partyGraduate, PartyType.valueOf(partyTypes));
				}
				else if (partyTypes.equalsIgnoreCase("PROM")) {
					String partyMask = bff.inputLine("Enter mask type.");
					String partyTheme = bff.inputLine("Input Prom theme. (CARNIVAL, STARRYNIGHT, UNDERTHESEA, THROWBACKS, WINTERBALL, MEDIEVAL, ENCHANTEDFOREST)");
					//String name, String location, int invited, String time, String mask, Theme theme, PartyType partyType
					party = new Prom(partyName, partyLocation, partyInvited, partyTime, partyMask, Theme.valueOf(partyTheme), PartyType.valueOf(partyTypes));
				}
				else {
					System.out.println("Please input a valid party type.");
				}
				
				return party;
	}
}