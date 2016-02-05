package com.mortaramultimedia.wordwolf.shared.messages;
import java.io.Serializable;

public class ConnectToDatabaseResponse implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private Boolean success = false;

	public ConnectToDatabaseResponse(Boolean success)
	{
		this.success = success;
	}

	public Boolean getSuccess()
	{
		return success;
	}

	public void setSuccess(Boolean success)
	{
		this.success = success;
	}

	public static long getSerialversionuid()
	{
		return serialVersionUID;
	}

	@Override
	public String toString()
	{
		return "ConnectToDatabaseResponse [success=" + success + "]";
	}

}
