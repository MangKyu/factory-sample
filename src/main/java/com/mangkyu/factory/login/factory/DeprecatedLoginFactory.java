package com.mangkyu.factory.login.factory;

import com.mangkyu.factory.login.service.LoginService;
import com.mangkyu.factory.login.service.MobileLogin;
import com.mangkyu.factory.login.service.SnsLogin;
import com.mangkyu.factory.login.service.WebLogin;
import com.mangkyu.factory.login.type.LoginType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.NoSuchElementException;

@Component
@RequiredArgsConstructor
@Deprecated
public class DeprecatedLoginFactory {

    private final MobileLogin mobileLogin;
    private final WebLogin webLogin;
    private final SnsLogin snsLogin;

    public LoginService find(final LoginType loginType) {
        if (loginType == LoginType.MOBILE) {
            return mobileLogin;
        } else if (loginType == LoginType.WEB) {
            return webLogin;
        } else if (loginType == LoginType.SNS) {
            return snsLogin;
        }

        throw new NoSuchElementException("Cannot find loginType: " + loginType);
    }

}