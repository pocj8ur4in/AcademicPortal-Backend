package academic.portal.domain.domain.example.service;

import academic.portal.core.exception.ExampleCodeException;
import academic.portal.domain.domain.example.ExampleEntity;
import academic.portal.domain.domain.example.repository.ExampleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ExampleDomainService {
    private final ExampleRepository exampleRepository;

    public void exampleException() {
        throw new ExampleCodeException(400, "샘플 오류!", "샘플 오류!");
    }

    // 샘플 Rest API 서버 구현 (<#> 참고 : https://velog.io/@alstn_dev/Spring-Boot로-REST-API-서버-만들기)
    // 데이터베이스 연동 X : "/api/v1/example"에 접속하면, 콘솔에 "샘플 오류!" 출력
    // 데이터베이스 연동 O : 기능 : GET, CREATE / 대상 : example_id & example_condtent
    public ExampleEntity exampleQuery(Long id) {
        return exampleRepository
                .findById(id)
                .orElseThrow(() -> new ExampleCodeException(400, "샘플 오류!", "샘플 오류!"));
    }

    public ExampleEntity exampleSave(String content) {
        ExampleEntity exampleBuild = ExampleEntity.builder().example_content(content).build();
        return exampleRepository.save(exampleBuild);
    }
}
