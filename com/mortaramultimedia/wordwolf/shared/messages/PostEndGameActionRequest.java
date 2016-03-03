package com.mortaramultimedia.wordwolf.shared.messages;

import java.io.Serializable;

public class PostEndGameActionRequest implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private int userID = -1;
	private String userName = null;
	private int opponentUserID = -1;
	private String opponentUserName = null;
	private String gameType = null;
	private Boolean rematch = false;
	private int boardRows = 3;
	private int boardCols = 3;
	private long gameDurationMS = 1000 * 10;	// ms * secs

	
	public PostEndGameActionRequest(int userID, String userName, int opponentUserID, String opponentUserName,
			String gameType, Boolean rematch, int boardRows, int boardCols, long gameDurationMS) 
	{
		super();
		this.userID = userID;
		this.userName = userName;
		this.opponentUserID = opponentUserID;
		this.opponentUserName = opponentUserName;
		this.gameType = gameType;
		this.rematch = rematch;
		this.boardRows = boardRows;
		this.boardCols = boardCols;
		this.gameDurationMS = gameDurationMS;
	}

	public int getUserID() 
	{
		return userID;
	}
	
	public void setUserID(int userID) 
	{
		this.userID = userID;
	}
	
	public String getUserName() 
	{
		return userName;
	}
	
	public void setUserName(String userName) 
	{
		this.userName = userName;
	}
	
	public int getOpponentUserID() 
	{
		return opponentUserID;
	}
	
	public void setOpponentUserID(int opponentUserID) 
	{
		this.opponentUserID = opponentUserID;
	}
	
	public String getOpponentUserName() 
	{
		return opponentUserName;
	}
	
	public void setOpponentUserName(String opponentUserName) 
	{
		this.opponentUserName = opponentUserName;
	}
	
	public String getGameType() 
	{
		return gameType;
	}
	
	public void setGameType(String gameType) 
	{
		this.gameType = gameType;
	}
	
	public Boolean getRematch() 
	{
		return rematch;
	}
	
	public void setRematch(Boolean rematch) 
	{
		this.rematch = rematch;
	}
	
	public int getBoardRows() 
	{
		return boardRows;
	}
	
	public void setBoardRows(int boardRows) 
	{
		this.boardRows = boardRows;
	}
	
	public int getBoardCols() 
	{
		return boardCols;
	}
	
	public void setBoardCols(int boardCols) 
	{
		this.boardCols = boardCols;
	}
	
	public long getGameDurationMS() 
	{
		return gameDurationMS;
	}
	
	public void setGameDurationMS(long gameDurationMS) 
	{
		this.gameDurationMS = gameDurationMS;
	}
	
	public static long getSerialversionuid() 
	{
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "PostEndGameActionRequest [userID=" + userID + ", userName=" + userName + ", opponentUserID="
				+ opponentUserID + ", opponentUserName=" + opponentUserName + ", gameType=" + gameType + ", rematch="
				+ rematch + ", boardRows=" + boardRows + ", boardCols=" + boardCols + ", gameDurationMS="
				+ gameDurationMS + "]";
	}
	
}
