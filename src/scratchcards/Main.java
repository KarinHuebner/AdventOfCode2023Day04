/*
 * Class: Main
 *
 * Version 2
 *
 * author: KarinHuebner
 */

package scratchcards;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
    	//Parser p = new Parser ("test.txt");
	    Parser p = new Parser("InputDay04.txt");
	    
    	ArrayList<Card> c = p.parseFile();
    	
    	System.out.println("test: Result Part1 Expected: 13");
    	System.out.println("Input: Result Part1 Expected: 23847");
   	 	SolutionPart1 s1 = new SolutionPart1 (c);
   	 	System.out.println();
    	
   	 	System.out.println("Test: Result Part2 Expected: 30");
   	 	System.out.println("Input: Result Part2 Expected: 8570000");
	 	SolutionPart2 s2 = new SolutionPart2 (c);
	}
}