// ==============================================================================
// File: BankCharges.java
// ==============================================================================
// Programmer: Jennifer King
// Date: 8/24/2018
// Project: Chap4
// Description:
//	This application asks for the number of checks written for the month.
//	It then calculates and displays the bank's service fees for the month.
// ===============================================================================

import java.util.Scanner;
import java.text.*;
import java.text.DecimalFormat;

public class BankCharges
{
		public static void main(String[] args)
		{
			double base = 10; 
			
			Scanner reader = new Scanner(System.in);
			System.out.println("How many checks were written? ");
			int checks = reader.nextInt();
			reader.close();
			
			double lessTwenty = .10 * checks;
			double twentyPlus = .08 * checks;
			double fortyPlus = .06 * checks;
			double sixtyPlus = .04 * checks;
			
			
			NumberFormat df = DecimalFormat.getInstance();
			df.setMaximumFractionDigits(2);
			df.setMinimumFractionDigits(2);
			
			double total;
			
			if(checks < 60)
			{
				if(checks >= 40)
				{
					total = fortyPlus + base;
					System.out.println("Bank fees: $" + df.format(total));
				}
				else if(checks >= 20)
				{
					total = twentyPlus + base;
					System.out.println("Bank fees: $" + df.format(total));
				}
				else if(checks > 0)
				{
					total = lessTwenty + base;
					System.out.println("Bank fees: $" + df.format(total));
				}
				else
				{
					System.out.println("Invalid number of checks.");
				}
			}
			else
			{
				total = sixtyPlus + base;
				System.out.println("Bank fees: $" + df.format(total));
			}
		}
}
