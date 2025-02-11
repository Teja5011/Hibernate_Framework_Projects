package Many_To_One.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class College
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int collegeId;
	String collegeName,address;

}
