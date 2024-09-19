package com.demo.project.handler;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.NOT_IMPLEMENTED;
import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.FORBIDDEN;

@Getter
@AllArgsConstructor
public enum BusinessErrorCodes {

    NO_CODE(
            0,
            NOT_IMPLEMENTED,
            "No code"
    ),

    INCORRECT_CURRENT_PASSWORD(
            300,
            BAD_REQUEST,
            "Current password is incorrect"
    ),

    NES_PASSWORD_DOES_NOT_MATCH(
            301,
            BAD_REQUEST,
            "New password does not match"
    ),

    ACCOUNT_LOCKED(
            302,
            FORBIDDEN,
            "User Account is Locked"
    ),

    ACCOUNT_DISABLED(
            303,
            FORBIDDEN,
            "User Account is disabled"
    ),

    BAD_CREDENTIALS(
            304,
            FORBIDDEN,
            "Login and/or password incorrect"
    );

    private final int code;
    private final HttpStatus httpStatus;
    private final String description;

}
