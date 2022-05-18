package com.mangkyu.factory.login.service;

import com.mangkyu.factory.login.type.LoginType;
import org.springframework.stereotype.Service;

@Service
class SnsLogin implements LoginService {

    @Override
    public boolean supports(final LoginType loginType) {
        return loginType == LoginType.SNS;
    }

    @Override
    public void login() {
        System.out.println("Sns Login");
    }

}
