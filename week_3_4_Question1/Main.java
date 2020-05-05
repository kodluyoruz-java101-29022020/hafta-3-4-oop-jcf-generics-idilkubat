package week_3_4_Question1;

import java.util.Scanner;
import week_3_4_Question1.User;
import week_3_4_Question1.HomeAddress;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccountManager accountManager = new AccountManager(null);	
		
		Scanner scanner = new Scanner(System.in);
		String email, password;
		int choice = 0;
		
		System.out.println("Email: ");
		email = scanner.nextLine();
		
		System.out.println("Password: ");
		password = scanner.nextLine();
		
		accountManager.Login(email, password);
		int result = accountManager.Login(email, password);
		
		if(result == 202) {
			showOperationMenu();
			choice = scanner.nextInt();
		}
		
		else {
			System.out.println("Invalid account");
		}
		
	/*	HomeAddress homeAddress = new HomeAddress();
		BusinessAddress businessAddress = new BusinessAddress();
		HealthInsurance healthInsurance = new HealthInsurance();
		ResidenceInsurance residenceInsurance = new ResidenceInsurance();
		TravelInsurance travelInsurance = new TravelInsurance();
		CarInsurance carInsurance = new CarInsurance();
		*/
		
		switch(choice) {
		
		case 1:
			accountManager.fillAccountList();
			break;
		
	/*	case 2:
			
			break;
		
		case 3:
			
			break;
		
		case 4:
			
			break;
		
		case 5:
			
			break;
		
		case 6:
			
			break;
		
		case 7:
			
			break;
		
		case 8:
			
			break;
		
		case 9:
			
			break; */
		
		case 10:
			break;
		
		}
		
	}

	private static void showOperationMenu() {

		// TODO Auto-generated method stub
		System.out.println("Please choose operation what you want to do: ");
		StringBuilder builder = new StringBuilder();
		builder.append("1 - Show my user information");
	/*	builder.append("\n2 - Add Home Address");
		builder.append("\n3 - Add Business Address");
		builder.append("\n4 - Remove Home Address");
		builder.append("\n5 - Remove Business Address");
		builder.append("\n6 - Calculate Health Insurance");
		builder.append("\n7 - Calculate Residence Insurance");
		builder.append("\n8 - Calculate Travel Insurance");
		builder.append("\n9 - Calculate Car Insurance");*/
		builder.append("\n10 - Exit");
		System.out.println(builder.toString());
	}
}
