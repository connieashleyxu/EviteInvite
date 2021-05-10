package finalproject_itp265_caxu;

/**
 * party hierarchy (abstract class)
 *
 * @author Connie Xu
 * @version Apr 27, 2021
 * ITP 265, Spring 2021, Coffee Section
 * Email: caxu@usc.edu
 * Final Project
 *
 */

public abstract class Party {
	//init vars
	private String name;
	private String location;
	private int invited;
	private String time;
	private PartyType partyType;
	
	public Party(String name, String location, int invited, String time, PartyType partyType) {
		this.name = name;
		this.location = location;
		this.invited = invited;
		this.time = time;
		this.partyType = partyType;
	}
	
	/**
	 * @return  name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return location of party
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location set at
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return invited
	 */
	public int getInvited() {
		return invited;
	}

	/**
	 * @param invited set at
	 */
	public void setInvited(int invited) {
		this.invited = invited;
	}

	/**
	 * @return the time
	 */
	public String getTime() {
		return time;
	}
	
	
	/**
	 * @return theme
	 */
	public PartyType getPartyType() {
		return partyType;
	}
	//toString
	public String toString() {
		return "Party Name: " + name + " Location: " + location + " Time: " + time + " Invited: " + invited + " Party Type:" + partyType;
	}
}
