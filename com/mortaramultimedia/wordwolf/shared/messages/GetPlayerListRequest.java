package com.mortaramultimedia.wordwolf.shared.messages;

import java.io.Serializable;

/**
 * Shared serializable object to request a list of one or more players from the list currently in the server Model.
 * @author jason
 *
 */
public class GetPlayerListRequest implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	public static final String REQUEST_TYPE_THIS_PLAYER 				= "request_type_this_player";
	public static final String REQUEST_TYPE_OPPONENT 					= "request_type_this_opponent";
	public static final String REQUEST_TYPE_ALL_PLAYERS 				= "request_type_all_players";
	public static final String RESPONSE_TYPE_ALL_ACTIVE_PLAYERS 		= "response_type_all_active_players";
	public static final String RESPONSE_TYPE_SOME_PLAYERS 				= "response_type_some_players";
	public static final String RESPONSE_TYPE_MORE_PLAYERS 				= "response_type_more_players";
	public static final String RESPONSE_TYPE_SOME_ACTIVE_PLAYERS 		= "response_type_some_active_players";
	public static final String RESPONSE_TYPE_MORE_ACTIVE_PLAYERS 		= "response_type_more_active_players";
	public static final String RESPONSE_TYPE_DUPLICATE_PLAYERS 			= "response_type_duplicate_players";
	public static final String RESPONSE_TYPE_DUPLICATE_ACTIVE_PLAYERS	= "response_type_duplicate_active_players";

	private String requestType = null;
	
	/**
	 * Constructor
	 */
	public GetPlayerListRequest(String requestType)
	{
		this.requestType = requestType;
	}

	public String getRequestType()
	{
		return requestType;
	}

	public void setRequestType(String requestType)
	{
		this.requestType = requestType;
	}

	public static long getSerialversionuid()
	{
		return serialVersionUID;
	}

	@Override
	public String toString()
	{
		return "GetPlayerListRequest [requestType=" + requestType + "]";
	}
	
}
