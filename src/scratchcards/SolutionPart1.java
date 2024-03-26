package scratchcards;

import java.util.ArrayList;

public class SolutionPart1 {
	int points =0; 
	
	public SolutionPart1(ArrayList<Card> c) {	// check
		findPoints (c);
	}

	public void findPoints( ArrayList<Card> c) {
		for (int i = 0; i< c.size(); i++) {
			int numberOfMatches= findNumberOfMatches(c.get(i));
			if(numberOfMatches > 0) {
				points += Math.pow(2, numberOfMatches -1);
			}
			numberOfMatches = 0;
		}
		System.out.println("Result Part1: Points: " + points);
	}
	
	private int findNumberOfMatches(Card card) {
		for (int i = 0; i< card.getWinningNumbers().size(); i++) {
			for (int j = 0; j < card.getScratchedNumbers().size(); j++) {
				if (card.getWinningNumbers().get(i)
					.equals(card.getScratchedNumbers().get(j))) {
						card.setNumberOfMatches(card.getNumberOfMatches() +1);
						break;
				}
			}
		}
		return card.getNumberOfMatches();
	}

}
