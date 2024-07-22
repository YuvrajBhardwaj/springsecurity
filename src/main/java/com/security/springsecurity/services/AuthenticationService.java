package com.security.springsecurity.services;

import com.security.springsecurity.dto.JWTAuthenticationResponse;
import com.security.springsecurity.dto.RefreshTokenRequest;
import com.security.springsecurity.dto.SignInRequest;
import com.security.springsecurity.dto.SignUpRequest;
import com.security.springsecurity.entities.User;

public interface AuthenticationService {
    User signup(SignUpRequest signUpRequest);
    JWTAuthenticationResponse signin(SignInRequest signInRequest);
    JWTAuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
