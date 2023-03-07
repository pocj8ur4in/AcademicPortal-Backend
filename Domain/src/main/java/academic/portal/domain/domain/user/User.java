package academic.portal.domain.domain.user;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Entity // @Entity : 엔티티 (@Entity를 사용하는 클래스)와 테이블 간의 매핑 (https://data-make.tistory.com/610)
@NoArgsConstructor(access = AccessLevel.PROTECTED) // JPA가 엔티티 객체를 생성할 때 기본 생성자 사용
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @GeneratedValue : 영속성 컨텍스트는 엔티티를 식별자 값으로 구분하므로, 엔티티를 영속 상태로 만들려면 식별자 값이 반드시 필요
    // GenerationType.IDENTITY : 기본 키 생성전략을 자동생성으로 (기본 키 생성을 데이터베이스에 위임)
    @Id // 기본 키 지정
    private Long user_id;

    @Embedded // 임베디드 타입 : 직접 정의 가능한 값 타입 (<#> 참고 : https://m.blog.naver.com/adamdoha/222141653373)
    private UserProfile user_userProfile;

    @Enumerated(EnumType.STRING) // @Enumerated : 자바와 Enum 타입을 매핑할 때 사용
    // EnumType.STRING : enum의 이름을 데이터베이스에 저장
    private UserRoleType user_userRoleType = UserRoleType.USERROLE_NONE;

    @Builder // @Builder : lombok에서 빌더 패턴으로 제공 (<#> 참고 : https://pamyferret.tistory.com/67)
    // lombok의 빌더 패턴은 이텍티브 자바 스타일의 생성 패턴 (<#> 참고 : https://johngrib.github.io/wiki/pattern/builder/)
    public User(UserProfile user_userProfile) {
        this.user_userProfile = user_userProfile;
    }
}
