package finalproject_itp265_caxu;

/**
 * dinner party type
 *
 * @author Connie Xu
 * @version Apr 27, 2021
 * ITP 265, Spring 2021, Coffee Section
 * Email: caxu@usc.edu
 * Final Project
 *
 */

public class Dinner extends Party implements BringGift {
    //init variables
	private String foodTheme;
	private boolean food;
	
	public Dinner(String name, String location,  int invited, String time, String foodTheme, boolean food, PartyType partyType) {
		super(name, location, invited, time, partyType);
		this.foodTheme = foodTheme;
		this.food = food;
	}
	
	public Dinner(String name, String location,  int invited, String time, String foodTheme, PartyType partyType) {
		super(name, location, invited, time, partyType);
		this.foodTheme = foodTheme;
	}
	
	/**
	 * @return foodTheme
	 */
	public String getFoodTheme() {
		return foodTheme;
	}
	
	
	public boolean bringGift() {
		return true;
	}
	
	public String toString() {
		return "Dinner Name: " + getName() + " Location: " + getLocation() + " Invited: " + getInvited() + " Time: " + getTime() + " Theme: " + foodTheme + " BringFood: " + food;
	}


}
