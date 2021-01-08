package com.sysgears.user.exception;

import com.sysgears.core.exception.FieldErrorException;

import java.util.Map;

public class LoginFailedException extends FieldErrorException {

    public LoginFailedException(Map<String, String> errors) {
        super("Login failed.", errors);
    }
}
