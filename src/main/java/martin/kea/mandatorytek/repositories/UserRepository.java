package martin.kea.mandatorytek.repositories;

import martin.kea.mandatorytek.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
