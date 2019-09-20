import java.util.Scanner;
public class BMI {
		public static void main(String[] args) {
			Scanner scnr = new Scanner(System.in);
			
			int decide;
			double numerator;
			double denominator;
			double weightPounds;
			double weightKilos;
			double heightInches;
			double heightMeters;
			double BMI;
			
			System.out.println("Would you like to calculate your BMI in metric units or imperial?");
			System.out.println("");
			System.out.println("         Press 1 for imperial or press 2 for metric.");
			
			decide = scnr.nextInt();
			
			switch (decide) {
				case 1:
					System.out.println("How many pounds do you weigh?");
					weightPounds = scnr.nextDouble();
					System.out.println("How tall are you in inches?");
					heightInches = scnr.nextDouble();
					numerator = weightPounds * 703;
					denominator = heightInches * heightInches;
					BMI = numerator / denominator;
					break;
				
				case 2:
					System.out.println("How many kilograms do you weigh?");
					weightKilos = scnr.nextDouble();
					System.out.println("How tall are you in meters?");
					heightMeters = scnr.nextDouble();
					numerator = weightKilos;
					denominator = heightMeters * heightMeters;
					BMI = numerator / denominator;
					break;
				
				default:
					System.out.println("Unknown input");
					return;
			}
			
			System.out.print("Your body mass index is ");
			System.out.printf("%.1f", BMI);
			System.out.println("");
			System.out.println("A body mass index of less than 18.5 is considered underweight.");
			System.out.println("A body mass index between 18.5 and 24.9 is considered normal.");
			System.out.println("A body mass index between 25 and 29.9 is considered overweight.");
			System.out.print("A body mass index of 30 or greater is considered obese.");
			}
}
