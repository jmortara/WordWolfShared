package com.mortaramultimedia.wordwolf.shared.messages;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Serializable shared object representing a single move, meaning a typed List<TileData> of two or more TileData objects.
 * Moves are sent to the server for processing for legality within the game rules and for scoring.
 * @author jason mortara
 */
public class GameMove implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private ArrayList<TileData> move = null;

	/**
	 * Constructor
	 * @param move
	 */
	public GameMove(ArrayList<TileData> move)
	{
		this.move = move;
	}

	public ArrayList<TileData> getMove()
	{
		return move;
	}

	public void setMove(ArrayList<TileData> move)
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((move == null) ? 0 : move.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GameMove other = (GameMove) obj;
		if (move == null) {
			if (other.move != null)
				return false;
		} else if (!move.equals(other.move))
			return false;
		return true;
	}
}
