package rent.cars.app.dto;

import lombok.NoArgsConstructor;
import rent.cars.app.model.Booking;
import rent.cars.app.model.Car;

@NoArgsConstructor
public class Mapper {
    public CarDto toDto(Car car){
        CarDto dto = new CarDto();
        dto.setId(car.getId());
        dto.setBrand(car.getBrand());
        dto.setModel(car.getModel());
        dto.setPricePerDay(car.getPricePerDay());
        return dto;
    }
    public BookingDto toDto(Booking booking){
        BookingDto dto = new BookingDto();
        dto.setId(booking.getId());
        dto.setCarId(booking.getCar().getId());
        dto.setCarBrand(booking.getCar().getBrand());
        dto.setCarModel(booking.getCar().getModel());
        dto.setStartDate(booking.getStartDate());
        dto.setEndDate(booking.getEndDate());
        dto.setTotalPrice(booking.getTotalPrice());
        return dto;
    }
}
