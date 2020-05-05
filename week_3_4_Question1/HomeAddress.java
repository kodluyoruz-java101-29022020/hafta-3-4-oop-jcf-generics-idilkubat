package week_3_4_Question1;

import java.util.ArrayList;
import java.util.Scanner;

public class HomeAddress implements Address{

	ArrayList<String> HomeAddress = new ArrayList<String>();
	Scanner scanner = new Scanner(System.in);
	
	@Override
	public ArrayList<String> addressInformation() {
		// TODO Auto-generated method stub
		String address;
		System.out.println("Add home address: ");
		address = scanner.nextLine();
		HomeAddress.add(address);
		return HomeAddress;
	}
	@Override
	public ArrayList<String> removeAddress() {
		// TODO Auto-generated method stub
		String address;
		System.out.println("Remove home address: ");
		address = scanner.nextLine();
		HomeAddress.remove(address);
		return HomeAddress;
	}
	
}
