package rent.cars.app.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   Long id;
    LocalDate startDate;
    LocalDate endDate;
    Double totalPrice;
    @ManyToOne
    Car car;

}
