package academic.portal.domain.domain.user.service;

import academic.portal.domain.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(
        readOnly = true) // 트랙잭션을 읽기 전용으로 설정 : 프레임워크가 hibernate Session.FlushMode.MANUAL로 (OSIV 패턴),
// 명시적으로 flush( )를 호출할 때만 영속성 컨텍스트를 플러시 (<#> 참고 : https://willseungh0.tistory.com/75)
// OSIV 패턴 (<#> 참고 : http://pds19.egloos.com/pds/201106/28/18/Open_Session_In_View_Pattern.pdf)
@RequiredArgsConstructor
public class UserDomainService {
    private final UserRepository userRepository;
}
