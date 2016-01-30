package com.mortaramultimedia.wordwolf.shared.messages;

import java.io.Serializable;

/**
 * Serializable shared Create Game Request object. This class is linked to both the WordWolfAppAndroid (client) and WordWolfServer projects. 
 * See each project's Properties/Java Build Path/Linked for info.
 * The serialVersionUID must be compatible in order for serialization/deserialization to work correctly.
 * It appears from testing that serialVersionUID can be lower than but not higher than the complementary project's serialVersionUID.
 * If incompatible, an InvalidClassException will be thrown. Simply recompile both.
 * Also an option instead of sharing the .java class is to to compile a jar and be sure the same jar is used on both ends.
 * @author jason mortara
 */
public class CreateGameRequest implements Serializable
{
	private static final long serialVersionUID = 1L;

	private int userID = -1;
	private String userName = null;
	private String gameType = null;
	private int boardRows = 3;
	private int boardCols = 3;
	private Boolean resumeExistingGame = false;
	private int resumeExisingGameID = -1;
	private int opponentUserID = -1;
	private String opponentUserName = null;
	private int maxWaitTimeForGameCreationMS = 1000 * 60 * 2;	// ms * secs * mins
	
	
	/**
	 * Constructor
	 * @param userID
	 * @param userName
	 * @param gameType
	 * @param boardRows
	 * @param boardCols
	 * @param resumeExistingGame
	 * @param resumeExisingGameID
	 * @param opponentUserID
	 * @param opponentUserName
	 * @param maxWaitTimeForGameCreationMS
	 */
	public CreateGameRequest(int userID, String userName, String gameType, int boardRows, int boardCols, Boolean resumeExistingGame,
							int resumeExisingGameID, int opponentUserID, String opponentUserName, int maxWaitTimeForGameCreationMS)
	{
		this.userID = userID;
		this.userName = userName;
		this.gameType = gameType;
		this.boardRows = boardRows;
		this.boardCols = boardCols;
		this.resumeExistingGame = resumeExistingGame;
		this.resumeExisingGameID = resumeExisingGameID;
		this.opponentUserID = opponentUserID;
		this.opponentUserName = opponentUserName;
		this.maxWaitTimeForGameCreationMS = maxWaitTimeForGameCreationMS;
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

	public String getGameType()
	{
		return gameType;
	}

	public void setGameType(String gameType)
	{
		this.gameType = gameType;
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

	public Boolean getResumeExistingGame()
	{
		return resumeExistingGame;
	}

	public void setResumeExistingGame(Boolean resumeExistingGame)
	{
		this.resumeExistingGame = resumeExistingGame;
	}

	public int getResumeExisingGameID()
	{
		return resumeExisingGameID;
	}

	public void setResumeExisingGameID(int resumeExisingGameID)
	{
		this.resumeExisingGameID = resumeExisingGameID;
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

	public int getMaxWaitTimeForGameCreationMS()
	{
		return maxWaitTimeForGameCreationMS;
	}

	public void setMaxWaitTimeForGameCreationMS(int maxWaitTimeForGameCreationMS)
	{
		this.maxWaitTimeForGameCreationMS = maxWaitTimeForGameCreationMS;
	}

	public static long getSerialversionuid()
	{
		return serialVersionUID;
	}

	@Override
	public String toString()
	{
		return "CreateGameRequest [userID=" + userID + ", userName=" + userName
				+ ", gameType=" + gameType + ", boardRows=" + boardRows
				+ ", boardCols=" + boardCols + ", resumeExistingGame="
				+ resumeExistingGame + ", resumeExisingGameID="
				+ resumeExisingGameID + ", opponentUserID=" + opponentUserID
				+ ", opponentUserName=" + opponentUserName
				+ ", maxWaitTimeForGameCreationMS="
				+ maxWaitTimeForGameCreationMS + "]";
	}
	
}
