package finalproject_itp265_caxu;

/**
 * graduation party type
 *
 * @author Connie Xu
 * @version Apr 27, 2021
 * ITP 265, Spring 2021, Coffee Section
 * Email: caxu@usc.edu
 * Final Project
 *
 */

public class Graduation extends Party {
	//var for graduate
	private String graduate;
	
	/**
	 * @param name, location, invited, time, graduate
	 */
	public Graduation(String name, String location, int invited, String time, String graduate, PartyType partyType) {
		super(name, location, invited, time, partyType);
		this.graduate = graduate;
	}
	
	/**
	 * @return the graduate
	 */
	public String getGraduate() {
		return graduate;
	}
	
	//toString
	public String toString() {
		return "Graduate Name: " + getName() + " Location: " + getLocation() + " Invited: " + getInvited() + " Graduate: " + graduate + " Time: " + getTime();
	}
}