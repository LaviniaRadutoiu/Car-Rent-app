package rent.cars.app.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
public class CarDto {
    Long id;
    String brand;
    String model;
    Double pricePerDay;

}
