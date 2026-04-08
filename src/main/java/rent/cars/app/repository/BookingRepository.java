package rent.cars.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rent.cars.app.model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {

}
