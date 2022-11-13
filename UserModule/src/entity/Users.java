package entity;

import java.io.Serializable;


/**
 * The persistent class for the tbl_users database table.
 * 
 */

public class Users implements Serializable {
	private static final long serialVersionUID = 1L;

	private int userId;

	private boolean userActiveStatus;

	private String userCategory;

	private double userLevel;

	private String userName;

	public Users() {
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int i) {
		this.userId = i;
	}

	public boolean getUserActiveStatus() {
		return this.userActiveStatus;
	}

	public void setUserActiveStatus(boolean userActiveStatus) {
		this.userActiveStatus = userActiveStatus;
	}

	public String getUserCategory() {
		return this.userCategory;
	}

	public void setUserCategory(String userCategory) {
		this.userCategory = userCategory;
	}

	public double getUserLevel() {
		return this.userLevel;
	}

	public void setUserLevel(double userLevel) {
		this.userLevel = userLevel;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}