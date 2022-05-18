package com.mangkyu.factory.login.service;

import com.mangkyu.factory.login.type.LoginType;
import org.springframework.stereotype.Service;

@Service
class WebLogin implements LoginService {

    @Override
    public boolean supports(final LoginType loginType) {
        return loginType == LoginType.WEB;
    }

    @Override
    public void login() {
        System.out.println("Web Login");
    }

}
