package JavaInterface;

import java.util.*;

public class InterfaceProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car mycar;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Your Car Number:\n1. Accord\n2. Challenger\n3. Prius");
		
		int n = Integer.parseInt(s.nextLine());
		
		switch(n){
		case 1:
			mycar = new Accord();
			System.out.println(mycar.Mileage());
			break;
		case 2:
			mycar = new Challenger();
			System.out.println(mycar.Mileage());
			break;
		case 3:
			mycar = new Prius();
			System.out.println(mycar.Mileage());
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		}
	}

}
