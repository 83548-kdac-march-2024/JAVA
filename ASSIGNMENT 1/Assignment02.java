 

//Accept 2 double values from User (using Scanner). Check data type. If arguments are not
//doubles, supply suitable error message & terminate.
//If numbers are double values, print its average.
//Hint : Check Scanner class for the methods

import java.util.Scanner;

public class Assignment02 {

	public static void main(String[] args) {
		Double dnum1;
		Double dnum2;
		Double avg;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter double value = ");
		
		if(sc.hasNextDouble())
		{
			dnum1=sc.nextDouble();
			dnum2=sc.nextDouble();
			
			avg = (dnum1+dnum2)/2;
			System.out.println("Average of both number = "+avg);
		}
		else
		{
			System.out.println("Error - Enter type double values");
		}

	}

}
