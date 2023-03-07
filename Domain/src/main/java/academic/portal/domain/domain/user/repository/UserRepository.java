package academic.portal.domain.domain.user.repository;

import academic.portal.domain.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> { // extends JpaRepository <...> : Spring Data JPA가 해당 인터페이스에 대해 프록시 구현체를 만든 뒤 DI
}
