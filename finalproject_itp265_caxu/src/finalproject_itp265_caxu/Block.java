package finalproject_itp265_caxu;

/**
 * block party type
 *
 * @author Connie Xu
 * @version Apr 27, 2021
 * ITP 265, Spring 2021, Coffee Section
 * Email: caxu@usc.edu
 * Final Project
 *
 */

public class Block extends Party implements BringGift {

	private String block;
	private boolean gift;
	
	
	public Block(String name, String location, int invited, String time, String block, boolean gift, PartyType partyType) {
		super(name, location, invited, time, partyType);
		this.block = block;
		this.gift = gift;
	}
	
	public Block(String name, String location, int invited, String time, String block, PartyType partyType) {
		super(name, location, invited, time, partyType);
		this.block = block;
	}

	/**
	 * @return block
	 */
	public String getBlock() {
		return block;
	}
	
	public boolean bringGift() {
		if (block.equalsIgnoreCase("Deerfield") || block.equalsIgnoreCase("Northridge") || block.equalsIgnoreCase("Westwood")) {
			return gift = true;
		}
		else {
			return gift = false;
		}
		
	}
	
	public String toString() {
		return "Block Name: " + getName() + " Location: " + getLocation() + " Invited: " + getInvited() + " Time: " + getTime() + " Block: " + block + "BringGift: " + gift;
	}
	
	
	

}
