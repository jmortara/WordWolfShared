package com.mortaramultimedia.wordwolf.shared.constants;

import java.io.Serializable;

/**
 * Shared PlayerListType, used by both client and server.
 * @author jason mortara
 */
public class PlayerListType implements Serializable
{
	private static final long serialVersionUID = 1L;

	public static final String THIS_PLAYER 					= "this_player";
	public static final String OPPONENT 					= "this_opponent";
	public static final String SPECIFIC_PLAYER_BY_USERNAME	= "specific_player_by_username";
	public static final String ALL_PLAYERS 					= "all_players";
	public static final String SOME_UNMATCHED_PLAYERS 		= "some_unmatched_players";
	public static final String ALL_UNMATCHED_PLAYERS 		= "all_unmatched_players";
	public static final String ALL_ACTIVE_PLAYERS 			= "all_active_players";

//	public static final String REQUEST_TYPE_THIS_PLAYER 				= "request_type_this_player";
//	public static final String REQUEST_TYPE_OPPONENT 					= "request_type_this_opponent";
//	public static final String REQUEST_TYPE_SPECIFIC_PLAYER_BY_USERNAME	= "request_type_specific_player_by_username";
//	public static final String REQUEST_TYPE_ALL_PLAYERS 				= "request_type_all_players";
//	public static final String REQUEST_TYPE_SOME_UNMATCHED_PLAYERS 		= "request_type_some_unmatched_players";
//	public static final String REQUEST_TYPE_ALL_UNMATCHED_PLAYERS 		= "request_type_all_unmatched_players";
//	public static final String RESPONSE_TYPE_ALL_ACTIVE_PLAYERS 		= "response_type_all_active_players";
//	public static final String RESPONSE_TYPE_SOME_PLAYERS 				= "response_type_some_players";
//	public static final String RESPONSE_TYPE_MORE_PLAYERS 				= "response_type_more_players";
//	public static final String RESPONSE_TYPE_SOME_ACTIVE_PLAYERS 		= "response_type_some_active_players";
//	public static final String RESPONSE_TYPE_MORE_ACTIVE_PLAYERS 		= "response_type_more_active_players";
//	public static final String RESPONSE_TYPE_DUPLICATE_PLAYERS 			= "response_type_duplicate_players";
//	public static final String RESPONSE_TYPE_DUPLICATE_ACTIVE_PLAYERS	= "response_type_duplicate_active_players";

}
