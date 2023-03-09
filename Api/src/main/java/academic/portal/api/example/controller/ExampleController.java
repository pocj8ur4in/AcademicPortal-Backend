package academic.portal.api.example.controller;

import academic.portal.api.example.dto.ExampleResponse;
import academic.portal.api.example.service.ExampleApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class ExampleController {
    private final ExampleApiService exampleApiService;

    @GetMapping("/example")
    public ExampleResponse get() {
        return exampleApiService.exampleGet();
    }

    @PostMapping
    public ExampleResponse create() {
        return exampleApiService.exampleCreate();
    }
}
