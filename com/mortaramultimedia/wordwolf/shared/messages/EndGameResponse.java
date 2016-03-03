package com.mortaramultimedia.wordwolf.shared.messages;

import java.io.Serializable;

public class EndGameResponse implements Serializable
{
	private static final long serialVersionUID = 1L;

	String username = null;
	int id = -1;
	Boolean endGameConfirmed = false;
	int finalScoreFromServer = 0;
	int opponentFinalScore = 0;
	String errorMsg = null;
	
	/**
	 * @param username
	 * @param id
	 */
	public EndGameResponse(String username, int id, Boolean endGameConfirmed, int finalScoreFromServer, int opponentFinalScore, String errorMsg)
	{
		this.username = username;
		this.id = id;
		this.endGameConfirmed = endGameConfirmed;
		this.finalScoreFromServer = finalScoreFromServer;
		this.opponentFinalScore = opponentFinalScore;
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

	public Boolean getEndGameConfirmed()
	{
		return endGameConfirmed;
	}

	public void setEndGameConfirmed(Boolean endGameConfirmed)
	{
		this.endGameConfirmed = endGameConfirmed;
	}

	public int getFinalScoreFromServer()
	{
		return finalScoreFromServer;
	}

	public void setFinalScoreFromServer(int finalScoreFromServer)
	{
		this.finalScoreFromServer = finalScoreFromServer;
	}

	public int getOpponentFinalScore()
	{
		return opponentFinalScore;
	}

	public void setOpponentFinalScore(int opponentFinalScore)
	{
		this.opponentFinalScore = opponentFinalScore;
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
		return "EndGameResponse [username=" + username + ", id=" + id + ", endGameConfirmed=" + endGameConfirmed
				+ ", finalScoreFromServer=" + finalScoreFromServer + ", opponentFinalScore=" + opponentFinalScore
				+ ", errorMsg=" + errorMsg + "]";
	}
	

}
