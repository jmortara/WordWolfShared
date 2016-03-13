package com.mortaramultimedia.wordwolf.shared.messages;

import java.io.Serializable;

/**
 * Serializable shared object to represent one element of game board data: the row, column and character defined in the board tile.
 * Also includes a selected field for designating if the user has selected the corresponding tile in the display.
 * @author jason mortara
 */
public class TileData implements Serializable
{
	private static final long serialVersionUID = 1L;

	private static final String DEFAULT_CHAR = "X";
	
	private int row = -1;
	private int col = -1;
	private char letter = DEFAULT_CHAR.charAt(0);	// default character, assists in debugging
	private Boolean selected = false;
	
	
	/**
	 * Constructor
	 * @param row
	 * @param col
	 * @param letter
	 * @param selected
	 */
	public TileData(int row, int col, char letter, Boolean selected)
	{
		this.row = row;
		this.col = col;
		this.letter = letter;
		this.selected = selected;
	}
	
	/**
	 * Empty Constructor
	 */
	public TileData()
	{
	}

	public int getRow()
	{
		return row;
	}

	public void setRow(int row)
	{
		this.row = row;
	}

	public int getCol()
	{
		return col;
	}

	public void setCol(int col)
	{
		this.col = col;
	}

	public char getLetter()
	{
		return letter;
	}

	public void setLetter(char letter)
	{
		this.letter = letter;
	}

	public Boolean getSelected()
	{
		return selected;
	}

	public void setSelected(Boolean selected)
	{
		this.selected = selected;
	}

	public static long getSerialversionuid()
	{
		return serialVersionUID;
	}

	@Override
	public String toString()
	{
		return "TileData [row=" + row + ", col=" + col + ", letter=" + letter
				+ ", selected=" + selected + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + col;
		result = prime * result + letter;
		result = prime * result + row;
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
		TileData other = (TileData) obj;
		if (col != other.col)
			return false;
		if (letter != other.letter)
			return false;
		if (row != other.row)
			return false;
		return true;
	}

}
