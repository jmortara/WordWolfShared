package com.mortaramultimedia.wordwolf.shared.messages;

import java.io.Serializable;
import java.util.List;

/**
 * Serializable shared object representing a single move, meaning a typed List<TileData> of two or more TileData objects.
 * Moves are sent to the server for processing for legality within the game rules and for scoring.
 * @author jason mortara
 */
public class GameMove implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private List<TileData> move = null;

	/**
	 * Constructor
	 * @param move
	 */
	public GameMove(List<TileData> move)
	{
		this.move = move;
	}

	public List<TileData> getMove()
	{
		return move;
	}

	public void setMove(List<TileData> move)
	{
		this.move = move;
	}

	public static long getSerialversionuid()
	{
		return serialVersionUID;
	}

	@Override
	public String toString()
	{
		return "GameMove [move=" + move + "]";
	}
}
