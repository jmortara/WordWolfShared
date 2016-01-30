package com.mortaramultimedia.wordwolf.shared.messages;

import java.io.Serializable;

/**
 * Serializable shared object to represent a request to create a new user account.
 * @author jason mortara
 */
public class CreateNewAccountRequest implements Serializable
{
	private static final long serialVersionUID = 1L;

	private String userName = null;
	private String password = null;
	private String email    = null;
	
	
	/**
	 * Constructor
	 * @param userName
	 * @param password
	 * @param email
	 */
	public CreateNewAccountRequest(String userName, String password, String email)
	{
		this.userName = userName;
		this.password = password;
		this.email = email;
	}

	public String getUserName()
	{
		return userName;
	}
	
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public static long getSerialversionuid()
	{
		return serialVersionUID;
	}

	@Override
	public String toString()
	{
		return "CreateNewAccountRequest [userName=" + userName + ", password="
				+ password + ", email=" + email + "]";
	}
	
	
}
