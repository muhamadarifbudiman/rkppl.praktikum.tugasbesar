package ac.id.rkppl.model;

/**
 * @author ahmad alamsyah
 * @date 27 Mei 2013
 */

public class User {
	
	protected String username;
	protected String password;
	protected int role;
	protected int nama;
	
	
	
	public User() {
		super();
	}
	public User( String username, String password, int role) {
		super();
		
		this.username = username;
		this.password = password;
		this.role = role;
	}
	/**
	* String
	* @return username
	* 
	*/
	public String getUsername() {
		return username;
	}
	/**
	*
	* @param username
	* 
	*/
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	*
	* @return passsword
	* 
	*/
	public String getPassword() {
		return password;
	}
	/**
	*
	* @param password
	* 
	*/
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	*
	* @return role
	* 
	*/
	public int getRole() {
		return role;
	}
	/**
	*
	* @param role
	* 
	*/
	public void setRole(int role) {
		this.role = role;
	}
	
	
	
	

}
