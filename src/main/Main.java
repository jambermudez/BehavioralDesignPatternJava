package main;

import ChainOfResponsibility.Card;

public class Main {

	public static void main(String[] args) {
		testChainOfResponsability();
	}
	
	
	private static void testChainOfResponsability() {
		System.out.print("---------------------------------------------------------");
		System.err.print(" Chain of Responsability ");
		System.out.print("---------------------------------------------------------");
		System.out.println();
		
		Card card = new Card();
		card.creditCardRequest(100000);
	}

}
