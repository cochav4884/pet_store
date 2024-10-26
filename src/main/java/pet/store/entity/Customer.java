package pet.store.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class Customer {
	
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long CustomerId;
  
  private String CustomerFirstName;
  private String CustomerLastName;
  private String CustomerEmail;
  	
	
  @ManyToMany(mappedBy = "customers", cascade = CascadeType.PERSIST)
  private Set<PetStore> petStores = new HashSet<>();
}
 