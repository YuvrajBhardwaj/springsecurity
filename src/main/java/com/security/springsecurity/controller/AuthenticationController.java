package com.security.springsecurity.controller;

import com.security.springsecurity.config.JwtAuthenticationFilter;
import com.security.springsecurity.dto.JWTAuthenticationResponse;
import com.security.springsecurity.dto.RefreshTokenRequest;
import com.security.springsecurity.dto.SignInRequest;
import com.security.springsecurity.dto.SignUpRequest;
import com.security.springsecurity.entities.User;
import com.security.springsecurity.services.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {
    private final AuthenticationService authenticationService;

    @PostMapping("/signup")
    public ResponseEntity<User> signup(@RequestBody SignUpRequest signUpRequest){
        return ResponseEntity.ok(authenticationService.signup(signUpRequest));
    }
    @PostMapping("/signin")
    public ResponseEntity<JWTAuthenticationResponse> signin(@RequestBody SignInRequest signInRequest){
        return ResponseEntity.ok(authenticationService.signin(signInRequest));
    }
    @PostMapping("refresh")
    public ResponseEntity<JWTAuthenticationResponse> refresh(@RequestBody RefreshTokenRequest refreshTokenRequest){
        return ResponseEntity.ok(authenticationService.refreshToken(refreshTokenRequest));
    }
}
