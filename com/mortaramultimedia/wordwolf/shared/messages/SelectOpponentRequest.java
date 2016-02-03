package com.mortaramultimedia.wordwolf.shared.messages;

import java.io.Serializable;

public class SelectOpponentRequest implements Serializable
{
	private static final long serialVersionUID = 1L;

	private String sourceUsername = null;
	private int sourceUserPort = -1;
	private String destinationUserName = null;
	private int destinationPort = -1;
	private Boolean randomOpponent = false;
	
	/**
	 * Constructor 1: using destination's username.
	 * @param destinationUsername
	 */
	public SelectOpponentRequest(String sourceUsername, String destinationUsername)
	{
		this.sourceUsername = sourceUsername;
		this.destinationUserName = destinationUsername;
		this.randomOpponent = false;
	}
	
	/**
	 * Constructor 2: using destination's port number.
	 * @param destinationPort
	 */
	public SelectOpponentRequest(int destinationPort)
	{
		this.destinationPort = destinationPort;
		this.randomOpponent = false;
	}

	/**
	 * Constructor 3: use a randomly selected destination.
	 * @param destinationUsername
	 */
	public SelectOpponentRequest(Boolean randomOpponent)
	{
		this.randomOpponent = randomOpponent;
	}
	
	public String getSourceUsername()
	{
		return sourceUsername;
	}

	public void setSourceUsername(String sourceUsername)
	{
		this.sourceUsername = sourceUsername;
	}

	public int getSourceUserPort()
	{
		return sourceUserPort;
	}

	public void setSourceUserPort(int sourceUserPort)
	{
		this.sourceUserPort = sourceUserPort;
	}

	public String getDestinationUserName()
	{
		return destinationUserName;
	}

	public void setDestinationUserName(String destinationUserName)
	{
		this.destinationUserName = destinationUserName;
	}

	public int getDestinationPort()
	{
		return destinationPort;
	}

	public void setDestinationPort(int destinationPort)
	{
		this.destinationPort = destinationPort;
	}

	public Boolean getRandomOpponent()
	{
		return randomOpponent;
	}

	public void setRandomOpponent(Boolean randomOpponent)
	{
		this.randomOpponent = randomOpponent;
	}

	public static long getSerialversionuid()
	{
		return serialVersionUID;
	}

	@Override
	public String toString()
	{
		return "SelectOpponentRequest [sourceUsername=" + sourceUsername
				+ ", sourceUserPort=" + sourceUserPort
				+ ", destinationUserName=" + destinationUserName + ", destinationPort="
				+ destinationPort + ", randomOpponent=" + randomOpponent + "]";
	}

}
