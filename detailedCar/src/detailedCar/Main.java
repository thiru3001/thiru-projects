package detailedCar;

import java.util.Scanner;

public class Main {
	public static void main(String arg[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter location and we have production in two countries (india or usa)");
	String location=sc.next();
	System.out.println("enter car type (mini/medium/large");
	String carType=sc.next();
	CommFact fact=new CommFact();
	fact.buildCar(location, carType);
}
}
