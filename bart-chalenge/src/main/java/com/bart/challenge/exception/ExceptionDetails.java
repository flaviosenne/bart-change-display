package com.bart.challenge.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionDetails {
    private String title;
    private int status;
    private long timestamp;
    private String message;

}
