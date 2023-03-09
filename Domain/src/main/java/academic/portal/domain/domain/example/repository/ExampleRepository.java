package academic.portal.domain.domain.example.repository;

import academic.portal.domain.domain.example.ExampleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExampleRepository extends JpaRepository<ExampleEntity, Long> {}
