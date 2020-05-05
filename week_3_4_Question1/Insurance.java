package week_3_4_Question1;

import java.util.ArrayList;
import java.util.Date;

public abstract class Insurance {
	
	protected String insuranceName;
	protected Double insurancePrice;
	protected Date insuranceStartDate;
	protected Date insuranceEndDate;
	protected ArrayList<String> insurancePriceList = new ArrayList<String>();
	
	public String getInsuranceName() {
		return insuranceName;
	}

	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	public Double getInsurancePrice() {
		return insurancePrice;
	}

	public void setInsurancePrice(Double insurancePrice) {
		this.insurancePrice = insurancePrice;
	}

	public Date getInsuranceStartDate() {
		return insuranceStartDate;
	}

	public void setInsuranceStartDate(Date insuranceStartDate) {
		this.insuranceStartDate = insuranceStartDate;
	}

	public Date getInsuranceEndDate() {
		return insuranceEndDate;
	}

	public void setInsuranceEndDate(Date insuranceEndDate) {
		this.insuranceEndDate = insuranceEndDate;
	}

	public abstract double calculate();
	

}
