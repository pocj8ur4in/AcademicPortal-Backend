package academic.portal.core.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ExampleCodeException extends RuntimeException {
    private int status;
    private String code;
    private String message;
}
