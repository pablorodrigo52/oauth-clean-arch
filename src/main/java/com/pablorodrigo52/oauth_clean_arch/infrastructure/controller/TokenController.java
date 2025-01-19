package com.pablorodrigo52.oauth_clean_arch.infrastructure.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/token")
public class TokenController {
 
    @GetMapping
    public String getToken(@AuthenticationPrincipal OidcUser user) {
        return user.getIdToken().getTokenValue();
    }
    
}
