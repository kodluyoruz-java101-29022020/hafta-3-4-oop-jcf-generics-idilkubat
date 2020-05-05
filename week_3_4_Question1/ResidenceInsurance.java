package week_3_4_Question1;

public class ResidenceInsurance extends Insurance{

	@Override
	public double calculate() {
		// TODO Auto-generated method stub
		
		super.insurancePrice = (double) ((super.insuranceEndDate.getYear()-super.insuranceStartDate.getYear())*3);
		
		return insurancePrice;
	}

}
