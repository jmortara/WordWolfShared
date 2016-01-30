package com.mortaramultimedia.wordwolf.shared.messages;

import java.io.Serializable;
import java.util.List;

public class CreateGameResponse implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private int userID = -1;
	private String userName = null;
	private String gameType = null;
	private int boardRows = 3;
	private int boardCols = 3;
	private int gameID = -1;
	private int opponentUserID = -1;
	private String opponentUserName = null;
	private int startingUserScore = 0;			
	private int startingOpponentScore = 0;
	private List<TileData> existingUserMoves = null;
	private List<TileData> existingOpponentMoves = null;		//TODO: may not be nec if unused during player's game
	private GameBoard gameBoard = null;
	private String errorMsg = null;
	

	/**
	 * Constructor
	 * @param userID
	 * @param userName
	 * @param gameType
	 * @param boardRows
	 * @param boardCols
	 * @param gameID
	 * @param opponentUserID
	 * @param opponentUserName
	 * @param startingUserScore
	 * @param startingOpponentScore
	 * @param existingUserMoves
	 * @param existingOpponentMoves
	 * @param gameBoard
	 * @param errorMsg
	 */
	public CreateGameResponse(int userID, String userName, String gameType,
			int boardRows, int boardCols, int gameID, int opponentUserID,
			String opponentUserName, int startingUserScore,
			int startingOpponentScore, List<TileData> existingUserMoves,
			List<TileData> existingOpponentMoves, GameBoard gameBoard,
			String errorMsg)
	{
		this.userID = userID;
		this.userName = userName;
		this.gameType = gameType;
		this.boardRows = boardRows;
		this.boardCols = boardCols;
		this.gameID = gameID;
		this.opponentUserID = opponentUserID;
		this.opponentUserName = opponentUserName;
		this.startingUserScore = startingUserScore;
		this.startingOpponentScore = startingOpponentScore;
		this.existingUserMoves = existingUserMoves;
		this.existingOpponentMoves = existingOpponentMoves;
		this.gameBoard = gameBoard;
		this.errorMsg = errorMsg;
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

	public int getGameID()
	{
		return gameID;
	}

	public void setGameID(int gameID)
	{
		this.gameID = gameID;
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

	public int getStartingUserScore()
	{
		return startingUserScore;
	}

	public void setStartingUserScore(int startingUserScore)
	{
		this.startingUserScore = startingUserScore;
	}

	public int getStartingOpponentScore()
	{
		return startingOpponentScore;
	}

	public void setStartingOpponentScore(int startingOpponentScore)
	{
		this.startingOpponentScore = startingOpponentScore;
	}

	public List<TileData> getExistingUserMoves()
	{
		return existingUserMoves;
	}

	public void setExistingUserMoves(List<TileData> existingUserMoves)
	{
		this.existingUserMoves = existingUserMoves;
	}

	public List<TileData> getExistingOpponentMoves()
	{
		return existingOpponentMoves;
	}

	public void setExistingOpponentMoves(List<TileData> existingOpponentMoves)
	{
		this.existingOpponentMoves = existingOpponentMoves;
	}

	public GameBoard getGameBoard()
	{
		return gameBoard;
	}

	public void setGameBoard(GameBoard gameBoard)
	{
		this.gameBoard = gameBoard;
	}

	public String getErrorMsg()
	{
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg)
	{
		this.errorMsg = errorMsg;
	}

	public static long getSerialversionuid()
	{
		return serialVersionUID;
	}

	@Override
	public String toString()
	{
		return "CreateGameResponse [userID=" + userID + ", userName=" + userName
				+ ", gameType=" + gameType + ", boardRows=" + boardRows
				+ ", boardCols=" + boardCols + ", gameID=" + gameID
				+ ", opponentUserID=" + opponentUserID + ", opponentUserName="
				+ opponentUserName + ", startingUserScore=" + startingUserScore
				+ ", startingOpponentScore=" + startingOpponentScore
				+ ", existingUserMoves=" + existingUserMoves
				+ ", existingOpponentMoves=" + existingOpponentMoves
				+ ", gameBoard=" + gameBoard + ", errorMsg=" + errorMsg + "]";
	}
	
}
