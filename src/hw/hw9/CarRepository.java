package hw.hw9;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findByPower(int power);

    List<Car> findByProducerIgnoreCase(String producer);
}
