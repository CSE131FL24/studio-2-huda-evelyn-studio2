package studio2;

import java.util.Scanner;
public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("How much money do you want to start with?");
		int startAmount = in.nextInt();
		
		System.out.println("Enter the win probablity");
		double winChance = in.nextDouble();
		
		System.out.println("What do you want your win limit to be?" );
		int winLimit = in.nextInt();
		
		int money = startAmount;
		int ruins = 0;
		
		while (money < winLimit && money >= 0) {
			if (Math.random() < winChance) {
				money++;	
			}
			else {
				money--;
			}
		}
		if (money)
		System.out.println("Your current money =" + money);
	}	

}
