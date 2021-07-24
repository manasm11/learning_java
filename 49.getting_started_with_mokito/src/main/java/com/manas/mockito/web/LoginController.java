package com.manas.mockito.web;

import com.manas.mockito.service.AuthenticationService;

public class LoginController {
    AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    public String service(String username, String password) {
        return authenticationService.authenticate(username, password) ? "/home" : "/login";
    }

}
