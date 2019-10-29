package java_practice_v1;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
import java.io.IOException;
public class main_practice_v1 {

	public static void main(String[] args) throws InterruptedException, IOException, InterruptedException {
	Scanner inObj = new Scanner(System.in);
	Scanner pause_key = new Scanner(System.in);
	int operation_value = 0; double fnumber, snumber;
	while (operation_value != 5) {
	System.out.println("Enter Operation\nChoose between:\n1.Addition\n2.Subtraction\n3.Division\n4.Multiplication\n5.Exit Application");
	operation_value = inObj.nextInt();
	if (operation_value == 1) {
		System.out.println("You Chose Addition");
		System.out.println("First Number :");	
		fnumber = inObj.nextDouble();
		System.out.println("Second Number :");
		snumber = inObj.nextDouble();
		double sum = fnumber + snumber;
		System.out.println("The Sum is : " + sum);
	}
	else if (operation_value == 2) {
		System.out.println("You Chose Subtraction");
		System.out.println("Enter Minuend");
		fnumber = inObj.nextDouble();
		System.out.println("Enter Subtrahend");
		snumber = inObj.nextDouble();
		double difference = fnumber - snumber;
		System.out.println("The Difference is : " + difference);
	}
	else if (operation_value == 3) {
		System.out.println("You Chose Division");
		System.out.println("Enter Dividend");
		fnumber = inObj.nextDouble();
		System.out.println("Enter Divisor");
		snumber = inObj.nextDouble();
		double quotient = fnumber - snumber;
		double remainder = 0;
		remainder = fnumber % snumber;
		System.out.println("The Quotient is : " + quotient + " With a remainder of : " + remainder);
	}
	else if (operation_value == 4) {
		System.out.println("You Chose Multiplication");
		System.out.println("Enter Multiplicand");
		fnumber = inObj.nextDouble();
		System.out.println("Enter Multiplier");
		snumber = inObj.nextDouble();
		double product = fnumber - snumber;
		System.out.println("The Product is : " + product);
	}
	else if (operation_value == 5) {
		System.out.println("Thank you for Using My First Java Calculator");
	
	}
	else {
		System.out.println("Incorrect Input\nPlease choose only between 1-4");
		Thread.sleep(1000);
		continue;
	}
	System.out.println("Press any key to continue...");
	pause_key.nextLine();
	for(int space_counter = 1; space_counter != 6; space_counter++) {
		System.out.println("");
	}
	}
	}

	

	private static Object operation_value(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
