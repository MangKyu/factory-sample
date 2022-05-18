package com.mangkyu.factory.login.controller;

import com.mangkyu.factory.login.factory.LoginFactory;
import com.mangkyu.factory.login.service.LoginService;
import com.mangkyu.factory.login.type.LoginType;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LoginController {

    private final LoginFactory loginFactory;

    @GetMapping("/login")
    public ResponseEntity<Void> login(LoginType loginType) {
        LoginService loginService = loginFactory.find(loginType);

        loginService.login();

        return ResponseEntity.ok()
                .build();
    }

}
