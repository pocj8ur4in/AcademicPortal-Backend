package academic.portal.domain.domain.user;

import jakarta.persistence.*;
import lombok.*;

@Embeddable
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserProfile {

    private String profile_username;

    private String profile_realname;

    @Lob // @LOB : DB에 LOB 자료형인 BLOB, CLOB 사용 (<#> 참고 : https://kogle.tistory.com/250)
    // LOB : (<#> 참고 : https://m.blog.naver.com/skygrab/30102791739)
    private String profile_pfp;

    @Column // @Column : 객체 필드를 테이블 컬럼에 매핑
    private String profile_phone;

    @Column private String profile_mail;

    @Column private String profile_addr;

    @Column private String profile_birth;

    @Builder
    public UserProfile(
            String profile_username,
            String profile_realname,
            String profile_pfp,
            String profile_phone,
            String profile_mail,
            String profile_addr,
            String profile_birth) {
        this.profile_username = profile_username;
        this.profile_realname = profile_realname;
        this.profile_pfp = profile_pfp;
        this.profile_phone = profile_phone;
        this.profile_mail = profile_mail;
        this.profile_addr = profile_addr;
        this.profile_birth = profile_birth;
    }
}
