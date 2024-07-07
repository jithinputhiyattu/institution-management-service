package com.school.app.ims.controller;

import com.school.app.ims.exceptions.IMSValidationException;
import com.school.app.ims.model.response.ErrorResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

@ControllerAdvice
@Slf4j
public class IMSExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<Object> genericExceptionHandler(Exception exception) {
                ErrorResponse errorResponse = ErrorResponse.builder()
                .message(exception.getLocalizedMessage())
                .timeStamp(LocalDateTime.now())
                .statusCode(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .build();
        return ResponseEntity.internalServerError().body(errorResponse);
    }


    @ExceptionHandler(value = HttpMessageNotReadableException.class)
    public ResponseEntity<ErrorResponse> failedToParseRequest(HttpMessageNotReadableException exception) {
        ErrorResponse errorResponse = ErrorResponse.builder()
                .message(exception.getLocalizedMessage())
                .timeStamp(LocalDateTime.now())
                .statusCode(HttpStatus.BAD_REQUEST.value())
                .build();
        return ResponseEntity.badRequest().body(errorResponse);
    }

    @ExceptionHandler(value = IMSValidationException.class)
    public ResponseEntity<ErrorResponse> validationException(IMSValidationException exception) {
        ErrorResponse errorResponse = ErrorResponse.builder()
                .message(exception.getLocalizedMessage())
                .timeStamp(LocalDateTime.now())
                .statusCode(HttpStatus.BAD_REQUEST.value())
                .build();
        return ResponseEntity.badRequest().body(errorResponse);
    }

}
