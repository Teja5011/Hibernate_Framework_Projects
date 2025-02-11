package One_To_Many.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Person 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int personId;
	private String name,address,gender;
	private int age;
	
	@OneToMany(cascade = CascadeType.PERSIST)
	List<Vehicle> vechicles;

	
	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Vehicle> getVechicles() {
		return vechicles;
	}

	public void setVechicles(List<Vehicle> vechicles) {
		this.vechicles = vechicles;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", address=" + address + ", gender=" + gender
				+ ", age=" + age + ", vechicles=" + vechicles + "]";
	}

	public Person(String name, String address, String gender, int age, List<Vehicle> vechicles) {
		super();
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.age = age;
		this.vechicles = vechicles;
	}
	
	
	
	

}
