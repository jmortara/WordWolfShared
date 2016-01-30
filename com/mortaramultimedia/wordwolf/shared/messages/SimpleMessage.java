package com.mortaramultimedia.wordwolf.shared.messages;

import java.io.Serializable;

/**
 * Serializable shared object to represent a simple text message.
 * @author jason mortara
 */
public class SimpleMessage implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private String msg = null;
	private Boolean echo = false;

	
	/**
	 * Constructor: message only
	 * @param msg
	 */
	public SimpleMessage(String msg)
	{
		this.msg = msg;
	}
	
	/**
	 * Constructor: message with echo request
	 * @param msg
	 */
	public SimpleMessage(String msg, Boolean echo)
	{
		this.msg = msg;
		this.echo = echo;
	}

	
	public String getMsg()
	{
		return msg;
	}

	public void setMsg(String msg)
	{
		this.msg = msg;
	}

	public Boolean getEcho()
	{
		return echo;
	}

	public void setEcho(Boolean echo)
	{
		this.echo = echo;
	}
	
	public static long getSerialversionuid()
	{
		return serialVersionUID;
	}

	@Override
	public String toString()
	{
		return "SimpleMessage [msg=" + msg + ", echo=" + echo + "]";
	}

}
