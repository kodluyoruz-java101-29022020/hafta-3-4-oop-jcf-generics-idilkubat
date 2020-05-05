package week_3_4_Question1;

import java.util.ArrayList;
import java.util.TreeSet;

public class AccountManager {

	User user = new User();
	public TreeSet<String> accountList;  //Olusturdugumuz bireysel ve kurumsal hesapları tutacak
	
	
	public AccountManager(TreeSet<String> accountList){
		
		this.accountList = accountList;	
	}
	
	public void fillAccountList() {
		accountList.add(user.getName());
		accountList.add(user.getSurname());
		accountList.add(user.getJob());
		
		System.out.println(accountList);
	}
	
	public Integer Login(String email, String password) {
		int result;
		if(user.getEmail().equals(email) && user.getPassword().equals(password)) {
			result = AuthenticationStatus.SUCCESS.getCode();
			System.out.println(AuthenticationStatus.SUCCESS.getCode() + " " 
					+AuthenticationStatus.SUCCESS.getDescription());
		}
		
		else {
			result = AuthenticationStatus.FAIL.getCode();
			System.out.println(AuthenticationStatus.FAIL.getCode() + " " 
					+ AuthenticationStatus.FAIL.getDescription());
		}
	/*	for(Account account: accountList) {
			if (account != null) {	
				try {
					
					account.userLoginStatus(email, password);
					System.out.println(AuthenticationStatus.SUCCESS.getCode()
							+AuthenticationStatus.SUCCESS.getDescription());
					
				} catch (InvalidAuthenticationException exception) {
					System.out.println(AuthenticationStatus.FAIL.getCode()
							+ AuthenticationStatus.FAIL.getDescription());
				}

			}
			
			else {
				System.out.println("AccountList empty!");
			}
			
		}*/
		return result;
	}
		
	public TreeSet<String> getAccountList() {
		return accountList;
	}


	public void setAccountList(TreeSet<String> accountList) {
		this.accountList = accountList;
	}
	
	

}
