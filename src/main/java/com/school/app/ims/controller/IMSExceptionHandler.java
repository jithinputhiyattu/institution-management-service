package com.school.app.ims.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import reactor.core.publisher.Mono;

@ControllerAdvice
@Slf4j
public class IMSExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public Mono<ResponseEntity<Object>> genericExceptionHandler(Exception exception) {
        return Mono.empty();
    }
}
