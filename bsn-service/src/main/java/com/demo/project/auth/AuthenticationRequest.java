package com.demo.project.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class AuthenticationRequest {

    @Email(message = "Email id is not valid")
    @NotEmpty(message = "Enter Email address")
    @NotBlank(message = "Enter Email Address")
    private String email;

    @NotEmpty(message = "Enter Password")
    @NotBlank(message = "Enter Password")
    @Size(min = 8, message = "Password should be least 8 characters")
    private String password;

}
