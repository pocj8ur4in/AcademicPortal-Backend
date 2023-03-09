package academic.portal.api.example.service;

import academic.portal.api.example.dto.ExampleResponse;
import academic.portal.domain.domain.example.ExampleEntity;
import academic.portal.domain.domain.example.service.ExampleDomainService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExampleApiService {

    private final ExampleDomainService exampleDomainService;

    public ExampleResponse exampleGet() { // GET
        ExampleEntity exampleQuery = exampleDomainService.exampleQuery(1L);

        return ExampleResponse.from(exampleQuery);
    }

    public ExampleResponse exampleCreate() {
        ExampleEntity exampleCreate = exampleDomainService.exampleSave("exampleCreate");
        return ExampleResponse.from(exampleCreate);
    }
}
