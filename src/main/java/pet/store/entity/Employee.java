package pet.store.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Employee {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long employeeId;
	private Long petStoreId;
	  
	private String employeeFirstName;
	private String employeeLastName;
	private String employeePhone;
	private String employeeJobTitle;
	
	@ManyToOne(cascade = CascadeType.ALL)

	private PetStore petStore;
		
}
