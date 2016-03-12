package com.mortaramultimedia.wordwolf.shared.messages;

import java.io.Serializable;

public class GameMoveResponse implements Serializable
{
	private static final long serialVersionUID = 1L;

	String username = null;
	int id = -1;
	Boolean requestAccepted = false;
	Boolean gameMoveValid = false;
	String wordSubmitted = null;
	int pointsAwarded = 0;
	int newScore = 0;
	String errorMsg = null;
	
	/**
	 * Constructor
	 * @param username
	 * @param id
	 * @param requestAccepted
	 * @param gameMoveValid
	 * @param wordSubmitted
	 * @param pointsAwarded
	 * @param newScore
	 * @param errorMsg
	 */
	public GameMoveResponse(String username, int id, Boolean requestAccepted, Boolean gameMoveValid, String wordSubmitted, int pointsAwarded, int newScore, String errorMsg)
	{
		this.username = username;
		this.id = id;
		this.requestAccepted = requestAccepted;
		this.gameMoveValid = gameMoveValid;
		this.wordSubmitted = wordSubmitted;
		this.pointsAwarded = pointsAwarded;
		this.newScore = newScore;
		this.errorMsg = errorMsg;
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

	public Boolean getRequestAccepted()
	{
		return requestAccepted;
	}

	public void setRequestAccepted(Boolean requestAccepted)
	{
		this.requestAccepted = requestAccepted;
	}

	public Boolean getGameMoveValid()
	{
		return gameMoveValid;
	}

	public void setGameMoveValid(Boolean gameMoveValid)
	{
		this.gameMoveValid = gameMoveValid;
	}

	public String getWordSubmitted() {
		return wordSubmitted;
	}

	public void setWordSubmitted(String wordSubmitted) {
		this.wordSubmitted = wordSubmitted;
	}

	public int getPointsAwarded()
	{
		return pointsAwarded;
	}
	
	public void setPointsAwarded(int pointsAwarded)
	{
		this.pointsAwarded = pointsAwarded;
	}
	
	public int getNewScore()
	{
		return newScore;
	}

	public void setNewScore(int newScore)
	{
		this.newScore = newScore;
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
	public String toString() {
		return "GameMoveResponse [username=" + username + ", id=" + id + ", requestAccepted=" + requestAccepted
				+ ", gameMoveValid=" + gameMoveValid + ", wordSubmitted=" + wordSubmitted + ", pointsAwarded="
				+ pointsAwarded + ", newScore=" + newScore + ", errorMsg=" + errorMsg + "]";
	}

}
