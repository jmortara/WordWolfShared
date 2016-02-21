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
	
}
