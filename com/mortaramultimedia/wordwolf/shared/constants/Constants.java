package com.mortaramultimedia.wordwolf.shared.constants;

import java.io.Serializable;

/**
 * Shared Constants class, to be used by both client and server.
 * @author jason mortara
 */
public class Constants  implements Serializable
{
	private static final long serialVersionUID = 1L;

	// messages
	public static final String HELLO_SERVER 					= "Hello, server.";
	public static final String HELLO_CLIENT 					= "Hello, client.";
	
	// game types
	public static final String GAME_TYPE_WORDWOLF_SINGLE_PLAYER = "game_type_wordwolf_single_player";
	public static final String GAME_TYPE_WORDWOLF_DUAL_PLAYER	= "game_type_wordwolf_two_player";
	
	// Player states
	public static final String PLAYER_STATE_NEW 				= "player_state_new";
	public static final String PLAYER_STATE_IDLE 				= "player_state_idle";
	public static final String PLAYER_STATE_SEEKING_GAME 		= "player_state_seeking_game";
	public static final String PLAYER_STATE_PLAYING_GAME 		= "player_state_playing_game";
	public static final String PLAYER_STATE_BUSY 				= "player_state_busy";
}
