package com.mortaramultimedia.wordwolf.shared.messages;

import java.io.Serializable;


/**
 * Serializable shared object used to respond (from source) to a SelectOpponentRequest (destination). 
 * @author jason mortara
 */
public class SelectOpponentResponse implements Serializable
{
	private static final long serialVersionUID = 1L;

	private String sourceUsername = null;
	private int sourcePort = -1;
	private String destinationUsername = null;
	private int destinationPort = -1;
	private Boolean requestAccepted = false;
	
	/**
	 * Constructor 1: using an existing player's username as source.
	 * @param requestAccepted
	 * @param sourceUsername
	 * @param destinationUsername
	 */
	public SelectOpponentResponse(Boolean requestAccepted, String sourceUsername, String destinationUsername)
	{
		this.requestAccepted 		= requestAccepted;
		this.sourceUsername 		= sourceUsername;
		this.destinationUsername 	= destinationUsername;
	}
	
	/**
	 * Constructor 2: using an existing player's port number as source.
	 * @param sourcePort
	 */
	public SelectOpponentResponse(int sourcePort)
	{
		this.sourcePort = sourcePort;
		//TODO: fill in params
	}

	public String getSourceUserName()
	{
		return sourceUsername;
	}

	public void setSourceUserName(String sourceUserName)
	{
		this.sourceUsername = sourceUserName;
	}

	public int getSourcePort()
	{
		return sourcePort;
	}

	public void setSourcePort(int sourcePort)
	{
		this.sourcePort = sourcePort;
	}

	public String getSourceUsername()
	{
		return sourceUsername;
	}

	public void setSourceUsername(String sourceUsername)
	{
		this.sourceUsername = sourceUsername;
	}

	public String getDestinationUsername()
	{
		return destinationUsername;
	}

	public void setDestinationUsername(String destinationUsername)
	{
		this.destinationUsername = destinationUsername;
	}

	public int getDestinationPort()
	{
		return destinationPort;
	}

	public void setDestinationPort(int destinationPort)
	{
		this.destinationPort = destinationPort;
	}

	public Boolean getRequestAccepted()
	{
		return requestAccepted;
	}

	public void setRequestAccepted(Boolean requestAccepted)
	{
		this.requestAccepted = requestAccepted;
	}

	public static long getSerialversionuid()
	{
		return serialVersionUID;
	}

	@Override
	public String toString()
	{
		return "SelectOpponentResponse [sourceUsername=" + sourceUsername
				+ ", sourcePort=" + sourcePort + ", destinationUsername="
				+ destinationUsername + ", destinationPort=" + destinationPort
				+ ", requestAccepted=" + requestAccepted + "]";
	}

	

}
