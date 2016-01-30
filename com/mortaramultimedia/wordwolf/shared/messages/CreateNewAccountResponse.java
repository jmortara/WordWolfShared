package com.mortaramultimedia.wordwolf.shared.messages;

import java.io.Serializable;

/**
 * Serializable shared object used for account creation.
 * @author jason mortara
 */
public class CreateNewAccountResponse implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private Boolean accountCreationSuccess = false;
	private String userName = null;
	private String password = null;
	private String email    = null;
	private String errorMsg	= null;
	
	
	/**
	 * Constructor
	 * @param accountCreationSuccess
	 * @param userName
	 * @param password
	 * @param email
	 * @param errorMsg
	 */
	public CreateNewAccountResponse(Boolean accountCreationSuccess, String userName, String password, String email, String errorMsg)
	{
		this.accountCreationSuccess = accountCreationSuccess;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.errorMsg = errorMsg;
	}

	public Boolean getAccountCreationSuccess()
	{
		return accountCreationSuccess;
	}

	public void setAccountCreationSuccess(Boolean accountCreationSuccess)
	{
		this.accountCreationSuccess = accountCreationSuccess;
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

	public String getErrorMsg()
	{
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg)
	{
		this.errorMsg = errorMsg;
	}

	public static long getSerialversionuid()
	{
		return serialVersionUID;
	}

	@Override
	public String toString()
	{
		return "CreateNewAccountResponse [accountCreationSuccess="
				+ accountCreationSuccess + ", userName=" + userName
				+ ", password=" + password + ", email=" + email + ", errorMsg="
				+ errorMsg + "]";
	}
	
}
