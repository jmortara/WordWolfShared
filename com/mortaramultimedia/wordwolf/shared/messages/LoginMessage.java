package com.mortaramultimedia.wordwolf.shared.messages;

import java.io.Serializable;


/**
 * Serializable Login object. This class is linked to both
 * the WordWolfAppAndroid (client) and WordWolfServer
 * projects. See each project's Properties/Java Build Path/Linked for info.
 * The serialVersionUID must be compatible in order for serialization/deserialization to work correctly.
 * It appears from testing that serialVersionUID can be lower than but not higher than the complementary project's serialVersionUID.
 * If incompatible, an InvalidClassException will be thrown. Simply recompile both.
 * Also an option instead of sharing might be to compile a jar and be sure the same jar is used on both ends.
 */
public class LoginMessage implements Serializable
{
	private static final long serialVersionUID = 1L;

	private int id = -1;
	private String userName = null;
	private String password = null;
	private String email    = null;

	
	/**
	 * @param id
	 * @param userName
	 * @param password
	 * @param email
	 */
	public LoginMessage(int id, String userName, String password, String email)
	{
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.email = email;
	}

	public static long getSerialVersionUID()
	{
		return serialVersionUID;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getUserName()
	{
		return userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	@Override
	public String toString()
	{
		return "LoginMessage [id=" + id + ", userName=" + userName + ", password=" + password + ", email=" + email + "]";
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + id;
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
		result = prime * result
				+ ((userName == null) ? 0 : userName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoginMessage other = (LoginMessage) obj;
		if (email == null)
		{
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id != other.id)
			return false;
		if (password == null)
		{
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userName == null)
		{
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}


}
