package com.mangkyu.factory.login.factory;

import com.mangkyu.factory.login.service.LoginService;
import com.mangkyu.factory.login.type.LoginType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class LoginFactory {

    private final List<LoginService> loginServiceList;
    private final Map<LoginType, LoginService> factoryCache;

    public LoginService find(LoginType loginType) {
        LoginService loginService = factoryCache.get(loginType);
        if (loginService != null) {
            return loginService;
        }

        loginService = loginServiceList.stream()
                .filter(v -> v.supports(loginType))
                .findFirst()
                .orElseThrow();

        factoryCache.put(loginType, loginService);

        return loginService;
    }

}
