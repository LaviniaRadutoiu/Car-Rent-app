package rent.cars.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rent.cars.app.model.Car;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findByPricePerDayLessThanEqual(double price);
}
