package hiberanate_2;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class User 
{
	String name,email,pwd,address;
	@Id
	long phone;
	public User(String name, String email, String pwd, String address, long phone) 
	{
		super();
		this.name = name;
		this.email = email;
		this.pwd = pwd;
		this.address = address;
		this.phone = phone;
	}
	
	public void find()
	{
		
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", pwd=" + pwd + ", address=" + address + ", phone=" + phone
				+ "]";
	}
	
	
}
