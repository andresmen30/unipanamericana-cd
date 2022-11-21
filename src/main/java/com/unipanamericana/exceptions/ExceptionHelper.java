package com.unipanamericana.exceptions;

import com.unipanamericana.response.ErrorResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class ExceptionHelper extends ResponseEntityExceptionHandler {

    private static final String MESSAGE_ERROR = "No puede ser nulo";

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(final MethodArgumentNotValidException ex,
                                                                  final HttpHeaders headers,
                                                                  final HttpStatus status,
                                                                  final WebRequest request) {
        final List<String> details = new ArrayList<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            final String detail = ((FieldError) error)
                    .getField().concat(" : ").concat(error.getDefaultMessage());
            details.add(detail);
        });
        return new ResponseEntity(ErrorResponse.error(status.value(),
                MESSAGE_ERROR, details),
                status);
    }
}
