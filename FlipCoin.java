/***********************************************************************************************************************************************************************
  ********************************************************** Flip coin and print % of Heads and Tails ******************************************************************
  *
  * Name : suraj kale
  * Date : 18/06/2021 
  *
  *********************************************************************************************************************************************************************/

import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {	

		//declaration

		int head=0;

		int tail=0;

		int i=1;

		// Get input from the user

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Number of time to flip the coin");

		int num=sc.nextInt();

		// check  the condition	

	

		while (i <= num) {

			double a=Math.random();

			if (a < 0.5) {

				tail++;

 			}

			else {

  				head++;

			}

		i++;

		

		}

		System.out.println("Head = "+head);

		System.out.println("Tail = "+tail);

		// Calculating Percentage for Head and Tail

		

		int Headper=(head*100)/num;

		int Tailper=(tail*100)/num;

		System.out.println("HeadPercentage = "+Headper);

                System.out.println("TailPercentage = "+Tailper);

        }

}
