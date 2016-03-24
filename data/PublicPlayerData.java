package data;

import java.io.Serializable;

/**
 * Serializable shared object to represent publicly viewable player attributes. No private data should go in this class.
 * @author jason mortara
 */
public class PublicPlayerData implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	String username = null;
	int highScore = -1;
	int totalScore = -1;
	
	/**
	 * Constructor.
	 * @param username
	 * @param highScore
	 * @param totalScore
	 */
	public PublicPlayerData(String username, int highScore, int totalScore) 
	{
		super();
		this.username = username;
		this.highScore = highScore;
		this.totalScore = totalScore;
	}

	public String getUsername() 
	{
		return username;
	}

	public void setUsername(String username) 
	{
		this.username = username;
	}

	public int getHighScore() 
	{
		return highScore;
	}

	public void setHighScore(int highScore) 
	{
		this.highScore = highScore;
	}

	public int getTotalScore() 
	{
		return totalScore;
	}

	public void setTotalScore(int totalScore) 
	{
		this.totalScore = totalScore;
	}

	public static long getSerialversionuid() 
	{
		return serialVersionUID;
	}

	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + highScore;
		result = prime * result + totalScore;
		result = prime * result + ((username == null) ? 0 : username.hashCode());
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
		PublicPlayerData other = (PublicPlayerData) obj;
		if (highScore != other.highScore)
			return false;
		if (totalScore != other.totalScore)
			return false;
		if (username == null) 
		{
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	
	@Override
	public String toString() 
	{
		return "PublicPlayerData [username=" + username + ", highScore=" + highScore + ", totalScore=" + totalScore + "]";
	}
	
	
}
