package com.mortaramultimedia.wordwolf.shared.messages;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/**
 * Serializable shared object representing the GameBoard layout of rows and columns, as expressed as characters.
 * @author jason mortara
 */
public class GameBoard implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private int gameID = -1;
	private int rows = -1;
	private int cols = -1;
//	private List<TileData> colData = null;
//	private List<TileData> rowData = null;
	private List<TileData>[][] boardData = null;
	
	
	/**
	 * Constructor
	 * @param gameID
	 * @param rows
	 * @param cols
	 * @param boardData
	 */
	public GameBoard(int gameID, int rows, int cols,
			List<TileData>[][] boardData)
	{
		super();
		this.gameID = gameID;
		this.rows = rows;
		this.cols = cols;
		this.boardData = boardData;
	}
	
	public int getGameID()
	{
		return gameID;
	}

	public void setGameID(int gameID)
	{
		this.gameID = gameID;
	}

	public int getRows()
	{
		return rows;
	}

	public void setRows(int rows)
	{
		this.rows = rows;
	}

	public int getCols()
	{
		return cols;
	}

	public void setCols(int cols)
	{
		this.cols = cols;
	}

	public List<TileData>[][] getBoardData()
	{
		return boardData;
	}

	public void setBoardData(List<TileData>[][] boardData)
	{
		this.boardData = boardData;
	}

	public static long getSerialversionuid()
	{
		return serialVersionUID;
	}

	@Override
	public String toString()
	{
		return "GameBoard [gameID=" + gameID + ", rows=" + rows + ", cols="
				+ cols + ", boardData=" + Arrays.toString(boardData) + "]";
	}

}
