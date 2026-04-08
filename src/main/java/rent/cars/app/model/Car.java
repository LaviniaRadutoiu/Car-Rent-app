package rent.cars.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Car {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   Long id;
   String brand;
   String model;
   double pricePerDay;


}
