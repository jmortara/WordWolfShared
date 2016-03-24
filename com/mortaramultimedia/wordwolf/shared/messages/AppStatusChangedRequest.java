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
	
	private String status = AppStatus.INIT;
	
	public AppStatusChangedRequest(String status) 
	{
		this.status = status;
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
		return "AppStatusChangedRequest [status=" + status + "]";
	}
	
}
