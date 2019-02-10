package springboot.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.test.entity.Employer;

public interface EmployerRepository extends JpaRepository<Employer,Integer> {
}
