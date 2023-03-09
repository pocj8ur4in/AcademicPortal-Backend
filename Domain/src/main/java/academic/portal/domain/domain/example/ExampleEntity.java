package academic.portal.domain.domain.example;

import academic.portal.domain.domain.common.model.BaseTimeEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity // @Entity : 엔티티 (@Entity를 사용하는 클래스)와 테이블 간의 매핑 (https://data-make.tistory.com/610)
@NoArgsConstructor(access = AccessLevel.PROTECTED) // JPA가 엔티티 객체를 생성할 때 기본 생성자 사용
public class ExampleEntity extends BaseTimeEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @GeneratedValue : 영속성 컨텍스트는 엔티티를 식별자 값으로 구분하므로, 엔티티를 영속 상태로 만들려면 식별자 값이 반드시 필요
    // GenerationType.IDENTITY : 기본 키 생성전략을 자동생성으로 (기본 키 생성을 데이터베이스에 위임)
    @Id // 기본 키 지정
    private Long example_id;

    private String example_content;

    @Builder // @Builder : lombok에서 빌더 패턴으로 제공 (<#> 참고 : https://pamyferret.tistory.com/67)
    // lombok의 빌더 패턴은 이텍티브 자바 스타일의 생성 패턴 (<#> 참고 : https://johngrib.github.io/wiki/pattern/builder/)
    public ExampleEntity(String example_content) {
        this.example_content = example_content;
    }
}
