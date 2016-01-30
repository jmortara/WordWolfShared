package com.mortaramultimedia.wordwolf.shared.messages;

import java.io.Serializable;

/**
 * Serializable shared object returned from server to acknowledge receipt of a LoginRequestMessage.
 * @author jason mortara
 */
public class LoginResponse implements Serializable
{
	private static final long serialVersionUID = 1L;

	private int userID = -1;
	private String userName = null;
	private Boolean loginAccepted = false;
	private String errorMsg = null;
	private Boolean gameInProgress = false;
	private int pageInProgressID = -1;
	
	
	/**
	 * Constructor
	 * @param userID
	 * @param userName
	 * @param loginAccepted
	 * @param errorMsg
	 * @param gameInProgress
	 * @param pageInProgressID
	 */
	public LoginResponse(int userID, String userName, Boolean loginAccepted,
			String errorMsg, Boolean gameInProgress, int pageInProgressID)
	{
		this.userID = userID;
		this.userName = userName;
		this.loginAccepted = loginAccepted;
		this.errorMsg = errorMsg;
		this.gameInProgress = gameInProgress;
		this.pageInProgressID = pageInProgressID;
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

	public Boolean getLoginAccepted()
	{
		return loginAccepted;
	}

	public void setLoginAccepted(Boolean loginAccepted)
	{
		this.loginAccepted = loginAccepted;
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
