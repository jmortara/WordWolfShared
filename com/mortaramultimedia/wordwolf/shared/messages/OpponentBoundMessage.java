package com.mortaramultimedia.wordwolf.shared.messages;

import java.io.Serializable;

/**
 * Serializable shared object used to send a message to the sender's current opponent.
 * @author jason mortara
 */
public class OpponentBoundMessage implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	
//	private String opponentUsername = null;
	private String msg = null;
	private Boolean deliveryReceipt = false;	// TODO: add receipt behavior after message delivery
	
	/**
	 * Constructor 1: no delivery receipt requested.
	 * @param msg
	 */
	public OpponentBoundMessage(String opponentUsername, String msg)
	{
//		this.opponentUsername = opponentUsername;
		this.msg = msg;
		this.deliveryReceipt = false;
	}
	
	/**
	 * Constructor 2: Optionally request a delivery receipt.
	 * @param msg
	 */
	public OpponentBoundMessage(String msg, Boolean deliveryReceipt)
	{
		this.msg = msg;
		this.deliveryReceipt = deliveryReceipt;
	}

/*	public String getOpponentUsername()
	{
		return opponentUsername;
	}

	public void setOpponentUsername(String opponentUsername)
	{
		this.opponentUsername = opponentUsername;
	}
*/
	public String getMsg()
	{
		return msg;
	}

	public void setMsg(String msg)
	{
		this.msg = msg;
	}

	public Boolean getDeliveryReceipt()
	{
		return deliveryReceipt;
	}

	public void setDeliveryReceipt(Boolean deliveryReceipt)
	{
		this.deliveryReceipt = deliveryReceipt;
	}

	public static long getSerialversionuid()
	{
		return serialVersionUID;
	}

	@Override
	public String toString()
	{
		return "OpponentBoundMessage [msg=" + msg + "]";
	}

}
