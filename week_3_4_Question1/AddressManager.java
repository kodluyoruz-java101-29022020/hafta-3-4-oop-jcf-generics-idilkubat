package week_3_4_Question1;

import java.util.ArrayList;
import java.util.List;

public class AddressManager {
	
	public static void addAddress(User user, Address address) {
		//Eğer belirtilen user da adres yoksa ekleme yapılır
		if(user.getAddress() == null) {
			
			List<Address> adressList = new ArrayList<Address>();
			adressList.add(address);
			
		}
		else {
			user.getAddress();
		}
		
	}
	
	
	public static void removeAddress(User user, Address address) {
		//Belirtilen user ın adresi kaldırılır
		if(user.getAddress()== address) {
			user.getAddress().remove(address);
		}
		
		
	}

}
