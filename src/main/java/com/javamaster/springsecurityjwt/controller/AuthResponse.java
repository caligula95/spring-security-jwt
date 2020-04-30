package com.javamaster.springsecurityjwt.controller;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthResponse {

    private String token;
}
