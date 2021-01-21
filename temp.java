// Write a program that reads a Fahrenheit degree converts it into Celsius and displays the result.

import java.util.Scanner;

public class temp {

		public static void main(String[] args) {
			
						double Cel;
						Scanner sc =new Scanner(System.in);
						
						System.out.println("Enter temprature in Fahrenheit ");
						double fah =sc.nextDouble();
						Cel=(fah-32)*5/9;
						System.out.println("Temprature in celcius =  " +Cel);

		}

	}


