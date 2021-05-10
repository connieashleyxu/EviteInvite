package finalproject_itp265_caxu;

/**
 * party type
 *
 * @author Connie Xu
 * @version Apr 27, 2021
 * ITP 265, Spring 2021, Coffee Section
 * Email: caxu@usc.edu
 * Final Project
 *
 */

public enum PartyType {
	GRADUATION,
	BLOCK,
	DINNER,
	PROM,
	NOTSUPPORTED;
	
public static String makeProductTypeMenu() {
		
		String categoryMenu = "Choose a category to view items: ";
		for(int i = 1; i < PartyType.values().length; i++) {
			PartyType t = PartyType.values()[i];
			categoryMenu += "\n" + i 
					+ ": " + t.name();
			
		}
		return categoryMenu;
	}

	/** 
	 * 
	 * @param number starting with 1
	 * @return
	 */
	public static PartyType getProductType(int num) {
		return  PartyType.values()[num];
	}
	public static PartyType getProductType(String name) {
		PartyType match = NOTSUPPORTED;
		for(PartyType t: PartyType.values()) {
			if(t.name().equalsIgnoreCase(name)) {
				match = t;
			}
		}
		return  match;
	}
}