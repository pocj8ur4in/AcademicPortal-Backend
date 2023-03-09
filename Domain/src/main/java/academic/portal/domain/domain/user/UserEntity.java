package academic.portal.domain.domain.user;

import academic.portal.domain.domain.common.model.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserEntity extends BaseTimeEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long user_id; // 기본 키

    @Embedded // 임베디드 타입 : 직접 정의 가능한 값 타입 (<#> 참고 : https://m.blog.naver.com/adamdoha/222141653373)
    private UserProfile userProfile;

    @Enumerated(EnumType.STRING) // @Enumerated : 자바와 Enum 타입을 매핑할 때 사용
    // EnumType.STRING : enum의 이름을 데이터베이스에 저장
    private UserRoleType userRoleType = UserRoleType.USERROLE_NONE;

    @Builder
    public UserEntity(UserProfile user_userProfile) {
        this.userProfile = user_userProfile;
    }
}
