package academic.portal.domain.domain.common.model;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import java.time.LocalDateTime;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Getter
@MappedSuperclass // @MappedSuperclass : 엔티티 클래스들이 이 추상 클래스를 상속하면 createDate, modifiedDate를 컬럼으로 인식
@EntityListeners(
        AuditingEntityListener
                .class) // JPA Auditing (<#> 참고 : https://webcoding-start.tistory.com/53)
public abstract class BaseTimeEntity {

    @Column(updatable = false)
    @CreatedDate
    private LocalDateTime createdAt;

    @Column @LastModifiedDate private LocalDateTime updatedAt;
}
