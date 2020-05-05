package week_3_4_Question1;

import java.util.ArrayList;

//Müşterinin sisteme giriş sonrasında tüm bilgilerinin tutulduğu hesap bilgisidir.
//Sınıfın sıralanabilir olabilirmesi için Comparable interface'den kalıtım alır
public abstract class Account implements Comparable <Account>{
	
	
	private User user;		//Kullanıcı nesnesi
	private ArrayList<Insurance> insurance; //Müşterilerin yaptırdıkları sigortalar
	private AuthenticationStatus authenticationStatus;//Kullanıcının login olma durumu
	
	public Account(AuthenticationStatus authenticationStatus) {
		this.authenticationStatus = authenticationStatus;
	}
	
	public Account(User user, ArrayList<Insurance> insurance, AuthenticationStatus authenticationStatus) {
		this.user = user;
		this.insurance = insurance;
		this.authenticationStatus = authenticationStatus;
	}

	//User Login olma durumu
	public void userLoginStatus(String email, String password) throws InvalidAuthenticationException{
		
		if (email == user.getEmail() && password == user.getPassword()) {
			
			authenticationStatus.SUCCESS.getCode();
			authenticationStatus.SUCCESS.getDescription();

		} else {

			throw new InvalidAuthenticationException(authenticationStatus.FAIL.getCode(),authenticationStatus.FAIL.getDescription());
		}	
	}
	
	//Sigorta poliçesi kar durumunu hesaplamak için
	protected abstract double addInsurance(double insurancePrice);
	
	
	//Müşteri bilgilerini ekrana yazdıran "final" tipinde, değer döndürmeyen ve ismi "showUserInfo" bir fonksiyon
	final void showUserInfo(User user) {
		
		if(user!= null) {
			
			StringBuilder builder = new StringBuilder();
			builder.append("[");
			builder.append(" User name:");
			builder.append(user.getName());
			builder.append(" User surname:");
			builder.append(user.getSurname());
			builder.append(" User email:");
			builder.append(user.getEmail());
			builder.append(" User password:");
			builder.append(user.getPassword());
			builder.append(" User job:");
			builder.append(user.getJob());
			builder.append(" User age:");
			builder.append(user.getAge());
			builder.append(" User address:");
			builder.append(user.getAddress());
			builder.append(" User system login date:");
			builder.append(user.getLoginSystemDate());
			builder.append("]");
			
			System.out.println(builder.toString());
			
		}	
	}  //End of showUserInfo()
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((authenticationStatus == null) ? 0 : authenticationStatus.hashCode());
		result = prime * result + ((insurance == null) ? 0 : insurance.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (authenticationStatus != other.authenticationStatus)
			return false;
		if (insurance == null) {
			if (other.insurance != null)
				return false;
		} else if (!insurance.equals(other.insurance))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

}
