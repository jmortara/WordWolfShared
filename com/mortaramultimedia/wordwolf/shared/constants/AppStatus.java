package com.mortaramultimedia.wordwolf.shared.constants;

import java.io.Serializable;

/**
 * Shared, serializable AppStatus types.
 * @author jason mortara
 */
public class AppStatus implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final static String INIT 		= "app_status_init";
	public final static String FOREGROUND 	= "app_status_foreground";
	public final static String BACKGROUND 	= "app_status_background";
}
