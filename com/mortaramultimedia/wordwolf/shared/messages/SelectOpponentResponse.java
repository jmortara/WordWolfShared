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
	private Boolean isRematch = false;
	private Boolean requestAccepted = false;
	private Boolean showDialog = false;
	
	/**
	 * Constructor 1: using an existing player's username as source.
	 * @param requestAccepted
	 * @param sourceUsername
	 * @param destinationUsername
	 * @param isRematch
	 */
	public SelectOpponentResponse(Boolean requestAccepted, String sourceUsername, String destinationUsername, Boolean isRematch, Boolean showDialog)
	{
		this.requestAccepted 		= requestAccepted;
		this.sourceUsername 		= sourceUsername;
		this.destinationUsername 	= destinationUsername;
		this.isRematch				= isRematch;
		this.showDialog				= showDialog;
	}
	
	/**
	 * Constructor 2: using an existing player's port number as source. (unused)
	 * @param sourcePort
	 */
	public SelectOpponentResponse(int sourcePort)
	{
		this.sourcePort = sourcePort;
		//TODO: fill in params
	}

	public String getSourceUsername()
	{
		return sourceUsername;
	}

	public void setSourceUsername(String sourceUsername)
	{
		this.sourceUsername = sourceUsername;
	}

	public int getSourcePort()
	{
		return sourcePort;
	}

	public void setSourcePort(int sourcePort)
	{
		this.sourcePort = sourcePort;
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

	public Boolean getIsRematch() 
	{
		return isRematch;
	}

	public void setIsRematch(Boolean isRematch) 
	{
		this.isRematch = isRematch;
	}

	public Boolean getRequestAccepted()
	{
		return requestAccepted;
	}

	public void setRequestAccepted(Boolean requestAccepted)
	{
		this.requestAccepted = requestAccepted;
	}

	public Boolean getShowDialog() 
	{
		return showDialog;
	}

	public void setShowDialog(Boolean showDialog) 
	{
		this.showDialog = showDialog;
	}

	public static long getSerialversionuid()
	{
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "SelectOpponentResponse [sourceUsername=" + sourceUsername + ", sourcePort=" + sourcePort
				+ ", destinationUsername=" + destinationUsername + ", destinationPort=" + destinationPort
				+ ", isRematch=" + isRematch + ", requestAccepted=" + requestAccepted + ", showDialog=" + showDialog
				+ "]";
	}

	

}
