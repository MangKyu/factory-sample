package com.mangkyu.factory.login.service;

import com.mangkyu.factory.login.type.LoginType;
import org.springframework.stereotype.Service;

@Service
class MobileLogin implements LoginService {

    @Override
    public boolean supports(final LoginType loginType) {
        return loginType == LoginType.MOBILE;
    }

    @Override
    public void login() {
        System.out.println("Mobile Login");
    }

}
