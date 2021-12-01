package martin.kea.mandatorytek.repositories;

import martin.kea.mandatorytek.models.Request;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestRepository extends JpaRepository<Request, Long> {
}
