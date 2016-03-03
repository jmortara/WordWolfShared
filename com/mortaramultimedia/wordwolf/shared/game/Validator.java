package com.mortaramultimedia.wordwolf.shared.game;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.mortaramultimedia.wordwolf.shared.messages.*;

import data.Model;


public class Validator
{

//	private static final String[] testDict = {"a", "ad", "add", "added", "addition"};
	private static HashMap<String, String> testDictMap;

	/**
	 * If the real (loaded) dictionary is unavailable, use a temp one.
	 */
	private static void initDictionary()
	{
		System.out.println("Validator: initDictionary");
		
		//TODO - THIS IS TEST CODE
		if(Model.getGlobalDictionary() == null)
		{
			System.out.println("Validator: initDictionary: real dictionary is unavailable. Generating a temp one.");
			if(testDictMap == null)
			{
				
				testDictMap = new HashMap<String, String>();
				testDictMap.put("a", "a");
				testDictMap.put("ad", "ad");
				testDictMap.put("add", "add");
				testDictMap.put("added", "added");
				testDictMap.put("addition", "addition");
			}
		}
	}
	
	/**
	 * Validate a GameMove, which is a series of TileData objects containing row, col, and letter.
	 * @param move
	 * @return
	 */
	public static Boolean validateMove(GameBoard gameBoard, GameMove gameMove)
	{
		TileData[][] boardData = gameBoard.getBoardData();
		List<TileData> tileList = gameMove.getMove();
		Boolean moveIsValid = false;
		TileData prevTD = null;
		TileData thisTD = null;
		int m = 0;
		int len = tileList.size();
		
		// return false if the gameBoard or move itself is invalid
		if(gameBoard == null)
		{
			System.out.println("Validator: validateMove: WARNING: gameBoard is null. Move is invalid.");
			return false;
		}
		
		if(gameMove == null)
		{
			System.out.println("Validator: validateMove: WARNING: gameMove is null. Move is invalid.");
			return false;
		}
		
		if(tileList == null)
		{
			System.out.println("Validator: validateMove: WARNING: gameMove's move list is null. Move is invalid.");
			return false;
		}
		
		if(len == 0)
		{
			System.out.println("Validator: validateMove: WARNING: gameMove's move list is empty. Move is invalid.");
			return false;
		}
		
		// validate that no TileData position is used more than once in the same move
		if(!validateUniqueTileData(gameMove))
		{
			System.out.println("Validator: validateMove: WARNING: Duplicate TileData found (same tile used more than once). Move is invalid.");
			return false;
		}
		
		// check that each move (m) in the move's list of TileData is contiguous and maps to a valid TileData in the gameBoard
		for(m=0; m<len-1; m++)
		{
			prevTD = tileList.get(m);
			thisTD = tileList.get(m + 1);
			
			// validate against the board data, to be sure the submitted letters match what's on the board
			if(prevTD.getLetter() != gameBoard.getLetterAtPos(prevTD.getRow(), prevTD.getCol()))
			{
				System.out.println("Validator: validateMove: WARNING: gameMove's letter at given position does not match gameBoard. Move is invalid.");
				return false;
			}
			
			// validate the tile positioning. incongruous tiles would mean an invalid move, for example.
			if(!validateTilePosition(prevTD, thisTD, false))
			{
				System.out.println("Validator: validateMove: WARNING: validateTilePosition() check failed. Move is invalid.");
				return false;
			}
		}
		
		// validate that the word is found in the dictionary
		if(!validateFoundInDictionary(gameMove))
		{
			System.out.println("Validator: validateMove: WARNING: word is not found in dictionary. Move is invalid.");
			return false;
		}
		
		System.out.println("Validator: validateMove: All validation checks passed. Move is valid.");
		return true;
	}
	
	private static Boolean validateTilePosition( TileData prevTD, TileData thisTD, Boolean allowDiagonals )
	{
		System.out.println("Validator: validateTilePosition: processing.");
		
		Boolean sameCol = ( thisTD.getCol() == prevTD.getCol() );
		Boolean sameRow = ( thisTD.getRow() == prevTD.getRow() );
		Boolean adjCol  = ( Math.abs( thisTD.getCol() - prevTD.getCol() ) == 1 );
		Boolean adjRow  = ( Math.abs( thisTD.getRow() - prevTD.getRow() ) == 1 );

		System.out.println( " validateTilePosition: sameCol: " + sameCol );
		System.out.println( " validateTilePosition: sameRow: " + sameRow );
		System.out.println( " validateTilePosition: adjCol:  " + adjCol );
		System.out.println( " validateTilePosition: adjRow:  " + adjRow );


		// if it's the same col and same row, it's the same move as prev, and it's invalid
		if ( sameCol && sameRow )
		{
			return false;
		}
		
		// if same row and adjacent col, or same col and and row, it's valid
		else if( ( sameRow && adjCol ) || ( sameCol && adjRow ) )
		{
			return true;
		}
		else
		{
			System.out.println( "Validator: validateTilePosition: WARNING: INCONGRUOUS TILEDATA PATH. Validation failed." );
			return false;
		}
	}
	
	public static Boolean validateUniqueTileData(GameMove gameMove)
	{
		System.out.println("Validator: validateUniqueTileData");
		
		List<TileData> tileList = gameMove.getMove();
		TileData thisTD = null;
		int len = tileList.size();
		int i;
		
		Set<TileData> uniqueTileDataOnly = new HashSet<TileData>(tileList);
		if(uniqueTileDataOnly.size() != tileList.size())
		{
			System.out.println("Validator: validateUniqueTileData: WARNING: Duplicate TileData found in gameMove. Validation failed.");
			return false;
		}
		
		return true;
	}
	
	public static Boolean validateFoundInDictionary(GameMove gameMove)
	{
		System.out.println("Validator: validateFoundInDictionary");

		initDictionary();
		
		HashMap<String, String> dictionaryToUse;
		if(Model.getGlobalDictionary() != null && Model.getGlobalDictionary().size() > 0)
		{
			dictionaryToUse = Model.getGlobalDictionary();
		}
		else
		{
			dictionaryToUse = testDictMap;
		}
		
		List<TileData> tileList = gameMove.getMove();
		TileData thisTD = null;
		Boolean wordFoundInDict = false;
		int c;						// char index
		int len = tileList.size();
		
		String word = "";
		for(c=0; c<len; c++)
		{
			thisTD = tileList.get(c);
			word += thisTD.getLetter();
		}
		word = word.toLowerCase();
		
		if(dictionaryToUse != null)
		{
			wordFoundInDict = dictionaryToUse.containsValue(word);
			System.out.println("Validator: validateFoundInDictionary: word found? " + word + ", " + wordFoundInDict);
		}
		else
		{
			System.out.println("Validator: validateFoundInDictionary: WARNING: dictionaryToUse is null.");
		}
		
		return wordFoundInDict;
	}
	

}
