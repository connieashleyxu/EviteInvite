package finalproject_itp265_caxu;

import java.util.ArrayList;

/**
 * evite user
 *
 * @author Connie Xu
 * @version Apr 28, 2021
 * ITP 265, Spring 2021, Coffee Section
 * Email: caxu@usc.edu
 * Final Project
 *
 */

public abstract class User {
	//init vars
		private String name;
		private String email;
		private String password;
		boolean isGoing;
		private ArrayList<String> invites;
		private ArrayList<String> gifts;
		
		public User(String name, String email, String password, boolean isGoing) {
			this.name = name;
			this.email = email;
			this.isGoing = isGoing;
			this.password = password;
			this.invites = new ArrayList<String>();
			this.gifts = new ArrayList<String>();
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
		public String getEmail() {
			return email;
		}

		/**
		 * @return invited
		 */
		public String getPassword() {
			return password;
		}

		/**
		 * @param invited set at
		 */
		public void setPassword(String password) {
			this.password = password;
		}

		/**
		 * @return the time
		 */
		public boolean isGoing() {
			return isGoing;
		}
		
		/**
		 * @return invites
		*/
		public ArrayList<String> getInvites() {
			return invites;
		}
		
		/**
		 * @return invites
		*/
		public ArrayList<String> getGifts() {
			return gifts;
		}
		
		//toString
		public String toString() {
			return "User Name: " + name + " Email: " + email + " isGoing: " + isGoing + " Gifts:" + gifts;
		}

}
