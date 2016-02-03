package com.mortaramultimedia.wordwolf.shared.messages;

import java.io.Serializable;
import java.util.ArrayList;

public class GetPlayerListResponse implements Serializable
{
	private static final long serialVersionUID = 3L;

	private ArrayList<String> playersCopy = null;

	/**
	 * Constructor. 
	 */
	public GetPlayerListResponse(ArrayList<String> playersSource)
	{
		setPlayersCopy(playersSource);
	}

	public ArrayList<String> getPlayersCopy()
	{
		return playersCopy;
	}
	
	/**
	 * Set the players list in this object. 
	 * Copies whatever source list is passed into it for safety.
	 * @param playersSource
	 */
	public void setPlayersCopy(ArrayList<String> playersSource)
	{
		this.playersCopy = new ArrayList<String>(playersSource);
		System.out.println("GetPlayerListReponse: source List: " + playersSource);
		System.out.println("GetPlayerListReponse: copied List: " + playersCopy);
		if(playersCopy == null)
		{
			System.out.println("GetPlayerListReponse: WARNING: LIST IS NULL");
		}
		else if(playersCopy.size() == 0)
		{
			System.out.println("GetPlayerListReponse: WARNING: LIST LENGTH 0");
		}
	}

	public static long getSerialversionuid()
	{
		return serialVersionUID;
	}
	
	
}
