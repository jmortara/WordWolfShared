package com.mortaramultimedia.wordwolf.shared.messages;

import java.io.Serializable;

/**
 * Shared serializable object to request a list of one or more players from the list currently in the server Model.
 * @author jason mortara
 *
 */
public class GetPlayerListRequest implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private String requestType = null;
	private String requestedUsername = null;	// known username of a potential opponent. not the username of the player making a request.
	
	/**
	 * Constructor (standard)
	 */
	public GetPlayerListRequest(String requestType)
	{
		this.requestType = requestType;
	}
	
	/**
	 * Constructor (for requesting a specific opponent by username)
	 */
	public GetPlayerListRequest(String requestType, String requestedUsername)
	{
		this.requestType = requestType;
		this.requestedUsername = requestedUsername;
	}

	public String getRequestType()
	{
		return requestType;
	}

	public void setRequestType(String requestType)
	{
		this.requestType = requestType;
	}

	public String getRequestedUsername()
	{
		return requestedUsername;
	}

	public void setRequestedUsername(String requestedUsername)
	{
		this.requestedUsername = requestedUsername;
	}

	public static long getSerialversionuid()
	{
		return serialVersionUID;
	}

	@Override
	public String toString()
	{
		return "GetPlayerListRequest [requestType=" + requestType + "]";
	}
	
}
