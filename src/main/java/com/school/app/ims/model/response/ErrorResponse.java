package com.school.app.ims.model.response;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class ErrorResponse {
    private int statusCode;
    private String message;
    private LocalDateTime timeStamp;
}
