package com.mortaramultimedia.wordwolf.shared.messages;

import java.io.Serializable;

//import Player;

/**
 * Serializable shared object returned from server to acknowledge receipt of a LoginRequestMessage.
 * @author jason mortara
 */
public class LoginResponse implements Serializable
{
	private static final long serialVersionUID = 1L;

	private Boolean loginAccepted = false;
	//private Player player = null;
	private int userID = -1;
	private String userName = null;
	private String errorMsg = null;
	private Boolean gameInProgress = false;
	private int pageInProgressID = -1;
	
	
	/**
	 * Constructor
	 * @param loginAccepted
	 * @param userID
	 * @param userName
	 * @param errorMsg
	 * @param gameInProgress
	 * @param pageInProgressID
	 */
	public LoginResponse(Boolean loginAccepted, /*Player player,*/ int userID, String userName, String errorMsg, Boolean gameInProgress, int pageInProgressID)
	{
		this.loginAccepted = loginAccepted;
		//this.player = player;
		this.userID = userID;
		this.userName = userName;
		this.errorMsg = errorMsg;
		this.gameInProgress = gameInProgress;
		this.pageInProgressID = pageInProgressID;
	}


	public Boolean getLoginAccepted()
	{
		return loginAccepted;
	}



	public void setLoginAccepted(Boolean loginAccepted)
	{
		this.loginAccepted = loginAccepted;
	}


	/*
	public Player getPlayer()
	{
		return player;
	}



	public void setPlayer(Player player)
	{
		this.player = player;
	}
	*/


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



	public String getErrorMsg()
	{
		return errorMsg;
	}



	public void setErrorMsg(String errorMsg)
	{
		this.errorMsg = errorMsg;
	}



	public Boolean getGameInProgress()
	{
		return gameInProgress;
	}



	public void setGameInProgress(Boolean gameInProgress)
	{
		this.gameInProgress = gameInProgress;
	}



	public int getPageInProgressID()
	{
		return pageInProgressID;
	}



	public void setPageInProgressID(int pageInProgressID)
	{
		this.pageInProgressID = pageInProgressID;
	}



	public static long getSerialversionuid()
	{
		return serialVersionUID;
	}



	@Override
	public String toString()
	{
		return "LoginResponse [userID=" + userID + ", userName=" + userName
				+ ", loginAccepted=" + loginAccepted + ", errorMsg=" + errorMsg
				+ ", gameInProgress=" + gameInProgress + ", pageInProgressID="
				+ pageInProgressID + "]";
	}
	
	
}
