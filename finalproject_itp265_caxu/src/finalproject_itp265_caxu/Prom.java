package finalproject_itp265_caxu;

/**
 * prom party type
 *
 * @author Connie Xu
 * @version Apr 27, 2021
 * ITP 265, Spring 2021, Coffee Section
 * Email: caxu@usc.edu
 * Final Project
 *
 */

public class Prom extends Party {
	private String mask;
	private Theme theme;
	public Prom(String name, String location, int invited, String time, String mask, Theme theme, PartyType partyType) {
		super(name, location, invited, time, partyType);
		this.mask = mask;
		this.theme = theme;
	}
	/**
	 * @return mask
	 */
	public String getMask() {
		return mask;
	}
	/**
	 * @param costume the costume to set
	 */
	public void setMask(String mask) {
		this.mask = mask;
	}
	/**
	 * @return the theme
	 */
	public Theme getTheme() {
		return theme;
	}
	/**
	 * @param theme the theme to set
	 */
	public void setTheme(Theme theme) {
		this.theme = theme;
	} 
	
	public String toString() {
		return "Costume Party Name: " + getName() + " Location: " + getLocation() + " Invited: " + getInvited() + " Time: " + getTime() + "Theme: " + theme + " Mask: " + mask;
	}
	
	
	
}