package week_3_4_Question1;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class User {
	
	public String name = "İdil", surname = "Kubat", job = "Engineer";
	public String email = "idil";
	public String password = "kubat";
	public int age;
	public ArrayList<String> address;
	public Date LoginSystemDate;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public ArrayList<String> getAddress() {
		return address;
	}
	public void setAddress(ArrayList<String> address) {
		this.address = address;
	}
	public Date getLoginSystemDate() {
		return LoginSystemDate;
	}
	public void setLoginSystemDate(Date loginSystemDate) {
		LoginSystemDate = loginSystemDate;
	}
	
	
	
	
}
