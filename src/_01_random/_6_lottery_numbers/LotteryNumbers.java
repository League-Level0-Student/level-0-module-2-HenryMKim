package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {

	public static void main(String[] args) {
		Random number = new Random();
		String sdfsdfsdf = "";
		for(int d = 0; d<6; d++) {
		
				int i = number.nextInt(1);
				sdfsdfsdf+=" " + String.valueOf(i);
			
		}
		JOptionPane.showMessageDialog(null, "Your lottery numbers aaaaaarrrrrrrrreeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee " + sdfsdfsdf);
		}
	}
