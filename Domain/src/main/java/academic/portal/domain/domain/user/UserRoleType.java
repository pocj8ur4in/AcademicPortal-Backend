package academic.portal.domain.domain.user;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum UserRoleType { // Enum : 자바의 열거 타입 (<#> 참고 : https://scshim.tistory.com/253)
    USERROLE_NONE("NONE", false),
    USERROLE_STUDENT("STUDENT", true),
    USERROLE_PROFESSOR("TEACHER", true),
    USERROLE_STAFF("STAFF", true);

    private final String role_name;
    private final Boolean role_authority_access;
}
