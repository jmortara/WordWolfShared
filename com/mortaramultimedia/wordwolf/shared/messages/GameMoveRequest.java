package com.mortaramultimedia.wordwolf.shared.messages;

import java.io.Serializable;

/**
 * Game Move Request - request wrapper for submitting a GameMove to the server for validation and scoring.
 * @author jason
 *
 */
public class GameMoveRequest implements Serializable
{
	private static final long serialVersionUID = 1L;

	String username = null;
	int id = -1;
	GameMove gameMove = null;
	
	public GameMoveRequest(String username, int id, GameMove gameMove)
	{
		this.username = username;
		this.id = id;
		this.gameMove = gameMove;
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

	public GameMove getGameMove()
	{
		return gameMove;
	}

	public void setGameMove(GameMove gameMove)
	{
		this.gameMove = gameMove;
	}

	public static long getSerialversionuid()
	{
		return serialVersionUID;
	}

	@Override
	public String toString()
	{
		return "GameMoveRequest [username=" + username + ", id=" + id + ", gameMove=" + gameMove + "]";
	}

}
