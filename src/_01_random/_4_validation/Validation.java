//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(6);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
if(randomNumber == 0) {
	JOptionPane.showMessageDialog(null, "U R GUD ENUF TOBE A PERSO   N");
}
if(randomNumber == 1) {
	JOptionPane.showMessageDialog(null, "U R GUD AT LIF");
}
if(randomNumber == 2) {
	JOptionPane.showMessageDialog(null, "U R NIC");
}
if(randomNumber == 3) {
	JOptionPane.showMessageDialog(null, "U R GUD ENUF TO PLA POKEMOON ARCUOOOUOS LEGONNDDSUS");
}
if(randomNumber == 4) {
	JOptionPane.showMessageDialog(null, "U R GUD ENUF TO BE AN UWU");
}
if(randomNumber == 5) {
	JOptionPane.showMessageDialog(null, "U R GUD ENUF TO BE A SUS IMPOSSOR");
}
if(randomNumber == 6) {
	JOptionPane.showMessageDialog(null, "U R GUD ENUF TO BE A PIECE OF DOE");
}
	
	
	
	
	
	}
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}

