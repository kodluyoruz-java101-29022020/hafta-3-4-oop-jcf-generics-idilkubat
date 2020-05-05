package week_3_4_Question1;

import java.util.ArrayList;

public class Enterprise extends Account {

	public Enterprise(User user, ArrayList<Insurance> insurance, AuthenticationStatus authenticationStatus) {
		
		super(user, insurance, authenticationStatus);
		
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected double addInsurance(double insurancePrice) {
		// TODO Auto-generated method stub
		
		double total =0;
		total = insurancePrice *4;
		return total;
	}

	@Override
	public int compareTo(Account o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
