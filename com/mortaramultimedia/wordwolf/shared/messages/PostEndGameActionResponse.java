package com.mortaramultimedia.wordwolf.shared.messages;

import java.io.Serializable;

/**
 * Serializable shared object used to respond (from source) to a PostGameActionRequest (destination). 
 * @author jason mortara
 */
public class PostEndGameActionResponse implements Serializable
{
	private static final long serialVersionUID = 1L;

	private Boolean rematchRequestAccepted = false;
	private String sourceUsername = null;
	private String destinationUsername = null;
	
	/**
	 * Constructor
	 * @param rematchRequestAccepted
	 * @param sourceUsername
	 * @param destinationUsername
	 */
	public PostEndGameActionResponse(Boolean rematchRequestAccepted, String sourceUsername, String destinationUsername)
	{
		this.rematchRequestAccepted = rematchRequestAccepted;
		this.sourceUsername 		= sourceUsername;
		this.destinationUsername 	= destinationUsername;
	}

	public String getSourceUserName()
	{
		return sourceUsername;
	}

	public void setSourceUserName(String sourceUserName)
	{
		this.sourceUsername = sourceUserName;
	}

	public String getDestinationUsername()
	{
		return destinationUsername;
	}

	public void setDestinationUsername(String destinationUsername)
	{
		this.destinationUsername = destinationUsername;
	}

	public Boolean getRequestAccepted()
	{
		return rematchRequestAccepted;
	}

	public void setRequestAccepted(Boolean requestAccepted)
	{
		this.rematchRequestAccepted = requestAccepted;
	}

	public static long getSerialversionuid()
	{
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "PostEndGameActionResponse [rematchRequestAccepted=" + rematchRequestAccepted + ", sourceUsername="
				+ sourceUsername + ", destinationUsername=" + destinationUsername + "]";
	}

	

}
