package week_3_4_Question1;

import java.util.ArrayList;
import java.util.Scanner;

public class BusinessAddress implements Address {
	
	ArrayList<String> BusinessAddress = new ArrayList<String>();
	Scanner scanner = new Scanner(System.in);
	
	@Override
	public ArrayList<String> addressInformation() {
		// TODO Auto-generated method stub
		String address;
		System.out.println("Add business address: ");
		address = scanner.nextLine();
		BusinessAddress.add(address);
		return BusinessAddress;
	}
	
	@Override
	public ArrayList<String> removeAddress() {
		// TODO Auto-generated method stub
		String address;
		System.out.println("Remove business address: ");
		address = scanner.nextLine();
		BusinessAddress.remove(address);
		return BusinessAddress;
	}
}
