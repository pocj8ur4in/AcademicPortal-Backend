package academic.portal.api.example.dto;

import academic.portal.domain.domain.example.ExampleEntity;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ExampleResponse {

    private final Long id;
    private final String content;

    public static ExampleResponse from(ExampleEntity exampleEntity) {
        return new ExampleResponse(
                exampleEntity.getExample_id(), exampleEntity.getExample_content());
    }
}
