package com.mortaramultimedia.wordwolf.shared.messages;

import java.io.Serializable;

/**
 * End Game Request - sent to the server when the game is completed on the client side.
 * @author jason mortara
 */
public class EndGameRequest implements Serializable
{
	private static final long serialVersionUID = 1L;

	String username = null;
	int id = -1;
	
	/**
	 * @param username
	 * @param id
	 */
	public EndGameRequest(String username, int id)
	{
		this.username = username;
		this.id = id;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public static long getSerialversionuid()
	{
		return serialVersionUID;
	}

	public EndGameRequest()
	{
		
	}

	@Override
	public String toString()
	{
		return "EndGameRequest [username=" + username + ", id=" + id + "]";
	}

}
