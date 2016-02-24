package com.mortaramultimedia.wordwolf.shared.constants;

import java.io.Serializable;

/**
 * Constants representing player states.
 * @author jason mortara
 */
public class PlayerState implements Serializable
{
	private static final long serialVersionUID = 1L;

	public static final String INIT 					= "player_state_init";
	public static final String CONNECTED_1				= "player_state_connected_1";			// connected to wwss (socket server)
	public static final String CONNECTED_2				= "player_state_connected_2";			// connected to wwss and database
	public static final String CONNECTED_3				= "player_state_connected_3";			// connected to wwss and DB and logged in
	public static final String NEW 						= "player_state_new";					// new account
	public static final String GETTING_USER_LIST		= "player_state_getting_user_list";			
	public static final String IDLE 					= "player_state_idle";
	public static final String SEEKING_GAME 			= "player_state_seeking_game";
	public static final String REQUESTED_OPPONENT		= "player_state_requested_opponent";
	public static final String RECEIVED_OPPONENT_REQUEST= "player_state_received_opponent_request";
	public static final String ACCEPTED_OPPONENT		= "player_state_accepted_opponent";
	public static final String READY_FOR_GAME_START		= "player_state_ready_for_game_start";
	public static final String PLAYING_GAME 			= "player_state_playing_game";
	public static final String GAME_ENDED	 			= "player_state_game_ended";
	public static final String BUSY 					= "player_state_busy";
}
