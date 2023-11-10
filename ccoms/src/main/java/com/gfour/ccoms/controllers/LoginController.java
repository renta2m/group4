package com.gfour.ccoms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gfour.ccoms.dtos.LoginDTO;
import com.gfour.ccoms.services.LoginService;

@RestController
@RequestMapping("login")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public LoginDTO login(@RequestBody LoginDTO loginDTO) throws Exception{
        return this.loginService.login(loginDTO);
    }
}
