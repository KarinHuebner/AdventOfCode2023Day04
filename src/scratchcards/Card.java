/*
 * Class: Card
 *
 * Version 2
 *
 * author: KarinHuebner
 */

package scratchcards;

import java.util.ArrayList;

public class Card {
	
	private int id;
	private int numberOfMatches;
	private int anzahl;
	private ArrayList<Integer> winningNumbers;
	private ArrayList<Integer> scratchedNumbers;
	
	public Card(int id) {
		this.id = id;
		this.anzahl = 1;
	}
	
	public String toString() {		
		return "[ " + this.id + ", winningNumbers: " + this.winningNumbers.toString() 
			+ ", scratchedNumbers: " + this.scratchedNumbers.toString() + "] \n";
	}

	public int getAnzahl() {
		return anzahl;
	}
	
	public ArrayList<Integer> getWinningNumbers() {
		return winningNumbers;
	}

	public void setWinningNumbers(ArrayList<Integer> winningNumbers2) {
		this.winningNumbers = winningNumbers2;
	}

	public ArrayList<Integer> getScratchedNumbers() {
		return scratchedNumbers;
	}

	public void setScratchedNumbers(ArrayList<Integer> sc1) {
			this.scratchedNumbers = sc1;
	}

	public int getId() {
		return id;
	}

	public int getNumberOfMatches() {
		return numberOfMatches;
	}

	public void setNumberOfMatches(int numberOfMatches) {
		this.numberOfMatches = numberOfMatches;
	}

	public void raiseAnzahl(int copys) {
		this.anzahl = anzahl + copys;
	}
}