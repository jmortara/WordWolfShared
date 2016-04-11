package com.mortaramultimedia.wordwolf.shared.messages;


import java.io.Serializable;

import com.mortaramultimedia.wordwolf.shared.constants.AppStatus;

/**
 * Shared serializable object to update the server with changes in the clien't status, such as the app changing foreground/background focus.
 * @author jason mortara
 *
 */
public class AppStatusChangedRequest implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private String username = null;
	private String status = AppStatus.INIT;
	
	/**
	 * Constructor.
	 * @param username
	 * @param status - new status of app
	 */
	public AppStatusChangedRequest(String username, String status) 
	{
		this.username = username;
		this.status = status;
	}

	public String getUsername() 
	{
		return username;
	}

	public void setUsername(String username) 
	{
		this.username = username;
	}

	public String getStatus() 
	{
		return status;
	}
	
	public void setStatus(String status) 
	{
		this.status = status;
	}
	
	public static long getSerialversionuid() 
	{
		return serialVersionUID;
	}
	
	@Override
	public String toString() 
	{
		return "AppStatusChangedRequest [username=" + username + ", status=" + status + "]";
	}
	
}
