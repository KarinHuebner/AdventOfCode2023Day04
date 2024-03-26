/*
 * Class: Parser
 *
 * Version 3
 * 
 * author: KarinHuebner
 */

package scratchcards;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Parser {
	private  String fileName;
	private ArrayList<Card> cards = new ArrayList<Card>();
		
	public Parser(String fileName) {
		this.fileName = fileName;
	}

	public ArrayList<Card> parseFile() throws FileNotFoundException {
		File textfile = new File(fileName);
		Scanner scanner = new Scanner (textfile);
		int lineNumber = 1;
		
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			cards.add(parseLine(line, lineNumber));
			lineNumber ++;
		}
		scanner.close();
		return cards;
	}

	private Card parseLine(String line, int lineNumber) {
		/*line e.g.: "Card 1: 41 48 | 83 86  6" */
		int id = lineNumber;
		
		int beginIndex = findBeginIndex (line);
		int breakpoint = line.indexOf('|');

		String wn = line.substring(beginIndex, breakpoint);
		String sn = line.substring(breakpoint+1); 
		
		Card aCard = new Card (id);
		aCard.setWinningNumbers (findNumbers(wn));
		aCard.setScratchedNumbers(findNumbers(sn));
		return aCard;
	}
	
	private ArrayList<Integer> findNumbers(String string) { // io
		String[] numbersCollector = string.split(" "); 
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (String nc: numbersCollector) {
			if (!nc.isEmpty()){
					numbers.add(Integer.parseInt(nc));
				} 
		}
		return numbers;
	}
	
	private int findBeginIndex(String line) { // io
		return line.indexOf(": ") +2 ;
	}	
}