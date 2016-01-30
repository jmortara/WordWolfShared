package com.mortaramultimedia.wordwolf.shared.constants;

import java.io.Serializable;


/**
 * Server Error messages - shared between client and server.
 * @author jason mortara
 */
public class ServerErrors implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	// database errors
	public static final String ERROR_DATABASE_CONNECTION_ERROR				= "error_database_access_error";
	public static final String ERROR_DATABASE_LOGIN_ERROR					= "error_database_login_error";
	public static final String ERROR_DATABASE_USER_QUERY_ERROR				= "error_database_user_query_error";
	public static final String ERROR_DATABASE_UNKNOWN_ERROR				= "error_database_unknown_error";
	
	// account creation errors
	public static final String ERROR_USERNAME_ALREADY_EXISTS				= "error_username_already_exists";
	public static final String ERROR_EMAIL_ALREADY_EXISTS					= "error_email_already_exists";
	public static final String ERROR_PASSWORD_NOT_SUFFICIENT				= "error_password_not_suffifienct";
	
	// login errors
	public static final String ERROR_USERNAME_NOT_FOUND 					= "error_username_not_found";
	public static final String ERROR_USER_ID_NOT_FOUND 					= "error_user_id_not_found";
	public static final String ERROR_PASSWORD_NOT_FOUND 					= "error_password_not_found";
	public static final String ERROR_PASSWORD_INCORRECT					= "error_password_incorrect";
	public static final String ERROR_EMAIL_NOT_FOUND 						= "error_email_not_found";
	public static final String ERROR_USER_BANNED	 						= "error_user_banned";
	
	// game setup errors
	public static final String ERROR_OPPONENT_ID_NOT_FOUND					= "error_opponent_id_not_found";
	public static final String ERROR_OPPONENT_USERNAME_NOT_FOUND			= "error_opponent_username_not_found";
	
	// gameplay errors
	public static final String ERROR_EXISTING_GAME_ID_NOT_FOUND 			= "error_existing_game_id_not_found";
	public static final String ERROR_EXISTING_GAME_BOARD_DATA_NOT_FOUND 	= "error_existing_game_board_data_not_found";
	public static final String ERROR_ILLEGAL_PLAYER_MOVE 					= "error_illegal_player_move";
	
	// other errors
	public static final String ERROR_SERVER_DISCONNECTED					= "error_server_disconnected";
	public static final String ERROR_SERVER_GENERIC_ISSUE					= "error_server_generic_issue";
	public static final String ERROR_UNKNOWN 								= "error_unknown";
}
