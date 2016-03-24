package com.mortaramultimedia.wordwolf.shared.messages;

import java.io.Serializable;
import java.util.ArrayList;

import data.PublicPlayerData;


public class GetPlayerListResponse implements Serializable
{
	private static final long serialVersionUID = 3L;

	private String responseType = null;
	private ArrayList<PublicPlayerData> playersCopy = null;

	/**
	 * Constructor.
	 * @param responseType
	 * @param playersSource
	 */
	public GetPlayerListResponse(String responseType, ArrayList<PublicPlayerData> playersSource)
	{
		this.responseType = responseType;
		setPlayersCopy(playersSource);
	}

	public ArrayList<PublicPlayerData> getPlayersCopy()
	{
		return playersCopy;
	}
	
	/**
	 * Set the players list in this object. 
	 * Copies whatever source list is passed into it for safety.
	 * @param playersSource
	 */
	public void setPlayersCopy(ArrayList<PublicPlayerData> playersSource)
	{
		this.playersCopy = new ArrayList<PublicPlayerData>(playersSource);
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

	public String getResponseType()
	{
		return responseType;
	}

	public void setResponseType(String responseType)
	{
		this.responseType = responseType;
	}

	public static long getSerialversionuid()
	{
		return serialVersionUID;
	}

	@Override
	public String toString()
	{
		return "GetPlayerListResponse [playersCopy=" + playersCopy + "]";
	}
	
	
}
