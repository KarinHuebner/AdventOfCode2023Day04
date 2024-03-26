package scratchcards;

import java.util.ArrayList;

public class SolutionPart2 {

	public SolutionPart2(ArrayList<Card> c) { 	
		findTotalScratchcards (c);
	}

	public void findTotalScratchcards(ArrayList<Card> cards) {
		int nom;
		int x;
		
		for (int i = 0; i<cards.size(); i++) {
			// bei jeder Card: 
			nom = cards.get(i).getNumberOfMatches(); 
			x = cards.get(i).getAnzahl();
			
			if (nom >0) {
				for (int y= 1; y <= nom; y++) {
				// nimm die nächsten y Karten
					//anzahl := anzahl + x
					cards.get(i+y).raiseAnzahl(x);
				}
			}
		}
		int totalNumberOfCards = 0;
		for (int i = 0; i<cards.size(); i++) {
			totalNumberOfCards += cards.get(i).getAnzahl();
		}
		System.out.println("Result Part2: TotalScratchcards: " + totalNumberOfCards);
	}	
}