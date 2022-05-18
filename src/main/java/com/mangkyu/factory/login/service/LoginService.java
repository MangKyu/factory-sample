package com.mangkyu.factory.login.service;

import com.mangkyu.factory.login.type.LoginType;

public interface LoginService {

    boolean supports(LoginType loginType);

    void login();

}
