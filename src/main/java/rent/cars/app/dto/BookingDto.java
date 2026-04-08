package rent.cars.app.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Setter
public class BookingDto {
    Long id;
    Long carId;
    String carBrand;
    String carModel;
    LocalDate startDate;
    LocalDate endDate;
    double totalPrice;



}
