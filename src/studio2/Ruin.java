package studio2;

import java.util.Scanner;
public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is the starting amount?: ");
		int startAmount = in.nextInt();
		System.out.println("What is the win probability?: ");
		double winChance = in.nextDouble();
		System.out.print("How much money do you need before quitting?: ");
		int winLimit = in.nextInt();
		System.out.print("How many days do you want to play?: ");
		int totalSimulations = in.nextInt();
		int simulationsRun = 0;
		
	while ((simulationsRun < totalSimulations) && (((startAmount < winLimit)) && (startAmount != 0))) {
		if((Math.random() * 101) <= winChance) {
			System.out.println("You win!");
			startAmount ++;
			simulationsRun ++;
			System.out.println("Simulation " + simulationsRun + " " + startAmount + "$");
		}
		else  {
			System.out.println("You lose");
			startAmount --;
			simulationsRun ++;
			System.out.println("Simulation " + simulationsRun + " " + startAmount + "$");
		}
		
	}
}
}
